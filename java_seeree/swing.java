// import javax.swing.*;
// class test {
//     public static void main(String[] args) {
//         JFrame f=new JFrame();
//         f.setSize(300, 200);
//         f.setVisible(true);
//     }
// }

//or
//using child class

// import javax.swing.*;
// class test extends JFrame{
//     public static void main(String[] args) {
//         test f=new test();
//         f.setSize(300, 200);
//         f.setVisible(true);
//     }
// }

//or 
//using constructor

// import javax.swing.*;
// class test extends JFrame {
//     test()
//     {
//         this.setSize(300,100);
//         this.setVisible(true);
//     }
//     public static void main(String[] args) {
//         test f=new test();
//     }
// }

// import javax.swing.*;
// class test extends JFrame {
//     JButton btn;
//     test()
//     {
//         this.setTitle("Login");
//         this.setSize(300,200);

//         btn=new JButton("PROCEED");
//         btn.setBounds(50, 50, 150, 40);
//         this.add(btn);

//         this.setLayout(null);
//         this.setVisible(true);
//     }
//     public static void main(String[] args) {
//         test f=new test();
//     }
// }

// import javax.swing.*;

// class test extends JFrame {
//     // JTextField t1;
//     // JRadioButton r1;
//     JCheckBox c1;
//     // JTextArea a1;

//     test() {
//         this.setTitle("Login");
//         this.setSize(300, 200);

//         c1 = new JCheckBox("cooking");
//         c1.setBounds(50, 50, 150, 40);
//         this.add(c1);

//         this.setLayout(null);
//         this.setVisible(true);
//     }

//     public static void main(String[] args) {
//         test f = new test();
//     }
// }

//JDialog is a container and is independent of JFrame

// import javax.swing.*;
// class test {
//     public static void main(String[] args) {
//         JDialog d=new JDialog();
//         d.setSize(200,200);
//         d.setVisible(true);
//     }
// }

//JWindow is also independent

// import javax.swing.*;
// class test {
//     public static void main(String[] args) {
//         JWindow window=new JWindow();
//         window.setSize(300,300);
//         window.setLocation(500,100);
//         window.setVisible(true);
//     }
// }

// import javax.swing.*;
// import java.awt.*;
// class test extends JFrame {
//     test()
//     {
//         this.setSize(300,300);
//         this.setLayout(null);

//         JPanel p=new JPanel();
//         p.setBackground(Color.RED);
//         p.setBounds(10, 10, 150, 200);
//         this.add(p);

//         JButton btn=new JButton("Login");
//         btn.setBounds(10, 10, 100, 30);
//         p.add(btn);

//         this.setVisible(true);
//     }
//     public static void main(String[] args) {
//         test obj=new test();
//     }
// }

// import javax.swing.*;
// import java.awt.*;

// class test extends JFrame {
//     JPanel p1, p2;
//     test() {
//         this.setSize(800, 100);
//         this.setLayout(new GridLayout(1, 2));  //EASY WAY
//         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         p1 = new JPanel();
//         p2 = new JPanel();

//         p1.setBackground(Color.WHITE);
//         // p1.setBounds(10, 10, 150, 200);
//         p2.setBackground(Color.RED);
//         // p2.setBounds(170, 10, 150, 200);

//         this.add(p1);
//         this.add(p2);

//         p1.add(new JButton("Login"));
//         p2.add(new JButton("GetLOst"));

//         this.setVisible(true);

//     }
//     public static void main(String[] args) {
//         new test();
//     }
// }

// import javax.swing.*;
// import java.awt.*;

// class test extends JFrame {
//     test() {
//         this.setSize(300, 300);
//         this.setLayout(new FlowLayout());

//         JButton btn1 = new JButton("Login");
//         this.add(btn1);

//         JButton btn2 = new JButton("Ok");
//         this.add(btn2);

//         this.setVisible(true);
//     }

//     public static void main(String[] args) {
//         test obj = new test();
//     }
// }

// import javax.swing.*;
// import java.awt.*;

// class test extends JFrame {
//     test() {
//         this.setSize(300, 300);
//         this.setLayout(new GridLayout(2, 2, 10, 20));

//         Button btn1 = new Button("1");
//         this.add(btn1);

//         Button btn2 = new Button("2");
//         this.add(btn2);

//         this.setVisible(true);
//     }

//     public static void main(String[] args) {
//         test obj = new test();
//     }
// }

// import javax.swing.*;
// class test {
//     test()
//     {
//         JFrame f= new JFrame();
//         JButton b=new JButton(new ImageIcon("arugula.png"));
//         b.setBounds(130, 100, 100, 40);
//         f.add(b);
//         f.setSize(300, 400);
//         f.setLayout(null);
//         f.setVisible(true);
//     }
//     public static void main(String[] args) {
//         new test();
//     }
// }

// import javax.swing.*;
// import java.awt.*;

// class test extends JFrame {
//     test() {
//         this.setSize(300, 300);
//         this.setLayout(null);

//         JToggleButton b = new JToggleButton("On");
//         b.setBounds(50, 50, 100, 100);
//         this.add(b);

//         this.setVisible(true);
//     }

//     public static void main(String[] args) {
//         new test();
//     }
// }

// import javax.swing.*;
// import java.awt.*;

// class test {
//     test() {

//         JFrame f = new JFrame();
//         f.setSize(300, 300);
//         f.setLayout(null);

//         JRadioButton r1 = new JRadioButton("Male");
//         JRadioButton r2 = new JRadioButton("Female");
//         r1.setBounds(50, 100, 70, 30);
//         r2.setBounds(50, 150, 70, 30);
//         ButtonGroup bg = new ButtonGroup();
//         bg.add(r1);
//         bg.add(r2);
//         f.add(r1);
//         f.add(r2);

//         f.setVisible(true);
//     }

//     public static void main(String[] args) {
//         new test();
//     }
// }




import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class test extends JFrame implements ActionListener { //1
    @Override
    public void actionPerformed(ActionEvent e) { //1
        if (b.getText().equals("On")) {
            b.setText("Off");
        } else {
            b.setText("On");
        }
    }

    JToggleButton b;

    test() {
        this.setSize(300, 300);
        this.setLayout(null);

        b = new JToggleButton("On");
        b.setBounds(50, 50, 100, 100);
        b.addActionListener(this); //2
        this.add(b);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new test();
    }

}
