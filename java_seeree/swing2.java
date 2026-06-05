import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class test extends JFrame implements ActionListener { // 1
    JButton b;
    JTextField t1, t2;
    JLabel lbl;

    @Override
    public void actionPerformed(ActionEvent e) { // 1
        int i = Integer.parseInt(t1.getText());
        int j = Integer.parseInt(t2.getText());
        int r = i + j;
        lbl.setText(String.valueOf(r));

    }

    test() {
        this.setSize(300, 300);
        this.setLayout(null);

        t1 = new JTextField();
        t1.setBounds(20, 20, 150, 30);
        this.add(t1);

        t2 = new JTextField();
        t2.setBounds(20, 70, 150, 30);
        this.add(t2);

        b = new JButton("Add");
        b.setBounds(40, 120, 100, 30);
        b.addActionListener(this); // 2
        this.add(b);

        lbl = new JLabel();
        lbl.setBounds(40, 160, 100, 30);
        this.add(lbl);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new test();
    }

}







// import javax.swing.*;
// import java.awt.event.KeyEvent;
// import java.awt.event.KeyListener;

// class test extends JFrame implements KeyListener { // 1
//     JLabel l;
//     JTextArea area;

//     // @Override
//     // public void keyPressed(KeyEvent e) {
//     // l.setText("Key Pressed...");

//     // }

//     // public void keyReleased(KeyEvent e) {
//     // l.setText("Key Released...");

//     // }

//     // public void keyTyped(KeyEvent e) {
//     // l.setText("Key Typed...");

//     // }

//     test() {
//         this.setSize(300, 300);
//         this.setLayout(null);

//         area = new JTextArea();
//         area.setBounds(30, 30, 150, 50);
//         area.addKeyListener(this); // 2
//         this.add(area);

//         l = new JLabel();
//         l.setBounds(30, 100, 100, 30);
//         this.add(l);

//         this.setVisible(true);
//     }

//     public static void main(String[] args) {

//         new test();
//     }

//     @Override
//     public void keyPressed(KeyEvent e) {
//         l.setText("Key Pressed...");

//     }

//     @Override
//     public void keyReleased(KeyEvent e) {
//         l.setText("Key Released...");

//     }

//     @Override
//     public void keyTyped(KeyEvent e) {
//         l.setText("Key Typed...");

//     }

// }
