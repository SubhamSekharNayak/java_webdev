// import javax.swing.*;

// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// class test extends JFrame implements ActionListener { // 1
//     JButton b;
//     JTextField t1, t2;
//     JLabel lbl;

//     @Override
//     public void actionPerformed(ActionEvent e) { // 1
//         int i = Integer.parseInt(t1.getText());
//         int j = Integer.parseInt(t2.getText());
//         int r = i + j;
//         lbl.setText(String.valueOf(r));

//     }

//     test() {
//         this.setSize(450, 300);
//         this.setLayout(null);
//         this.setTitle("Student Result");

//         t1 = new JTextField();
//         t1.setBounds(20, 20, 150, 30);
//         this.add(t1);

//         t2 = new JTextField();
//         t2.setBounds(20, 70, 150, 30);
//         this.add(t2);

//         b = new JButton("Add");
//         b.setBounds(40, 120, 100, 30);
//         b.addActionListener(this); // 2
//         this.add(b);

//         lbl = new JLabel();
//         lbl.setBounds(40, 160, 100, 30);
//         this.add(lbl);

//         this.setVisible(true);
//     }

//     public static void main(String[] args) {
//         new test();
//     }

// }



// import javax.swing.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// class test extends JFrame implements ActionListener {
//     JButton b;
//     JTextField t1, t2;
//     JLabel lbl;

//     @Override
//     public void actionPerformed(ActionEvent e) {
//         try {
//             int i = Integer.parseInt(t1.getText());
//             int j = Integer.parseInt(t2.getText());
//             int r = i + j;

//             lbl.setText(String.valueOf(r));
//         }
//         catch (NumberFormatException ex) {
//             JOptionPane.showMessageDialog(this,
//                     "Please enter valid numbers only!",
//                     "Invalid Input",
//                     JOptionPane.ERROR_MESSAGE);
//         }
//         catch (Exception ex) {
//             JOptionPane.showMessageDialog(this,
//                     "Something went wrong: " + ex.getMessage());
//         }
//     }

//     test() {
//         this.setSize(450, 300);
//         this.setLayout(null);
//         this.setTitle("Student Result");

//         t1 = new JTextField();
//         t1.setBounds(20, 20, 150, 30);
//         this.add(t1);

//         t2 = new JTextField();
//         t2.setBounds(20, 70, 150, 30);
//         this.add(t2);

//         b = new JButton("Add");
//         b.setBounds(40, 120, 100, 30);
//         b.addActionListener(this);
//         this.add(b);

//         lbl = new JLabel();
//         lbl.setBounds(40, 160, 100, 30);
//         this.add(lbl);

//         this.setVisible(true);
//         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }

//     public static void main(String[] args) {
//         new test();
//     }
// }






import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




class StudentResult extends JFrame implements ActionListener {

    JTextField tRoll, tName, tEng, tAcc, tEco, tBus, tIp, tTotal, tPercent, tGrade;
    JButton btnCalc;

    StudentResult() {
        setTitle("Student Result");
        setSize(600, 450);
        setLayout(null);

        JLabel title = new JLabel("Student Details");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setBounds(200, 20, 300, 40);
        add(title);

        JLabel lRoll = new JLabel("Roll Number");
        lRoll.setBounds(100, 80, 100, 30);
        add(lRoll);

        tRoll = new JTextField();
        tRoll.setBounds(220, 80, 150, 25);
        add(tRoll);

        JLabel lName = new JLabel("Name");
        lName.setBounds(100, 120, 100, 30);
        add(lName);

        tName = new JTextField();
        tName.setBounds(220, 120, 150, 25);
        add(tName);

        // Subject Labels + TextFields
        JLabel lEng = new JLabel("English");
        lEng.setBounds(50, 170, 100, 30);
        add(lEng);

        tEng = new JTextField();
        tEng.setBounds(50, 200, 80, 25);
        add(tEng);

        JLabel lAcc = new JLabel("Account");
        lAcc.setBounds(150, 170, 100, 30);
        add(lAcc);

        tAcc = new JTextField();
        tAcc.setBounds(150, 200, 80, 25);
        add(tAcc);

        JLabel lEco =  new JLabel("Economics");
        lEco.setBounds(250, 170, 100, 30);
        add(lEco);

        tEco = new JTextField();
        tEco.setBounds(250, 200, 80, 25);
        add(tEco);
        
        JLabel lBus = new JLabel("Business Studies");
        lBus.setBounds(350, 170, 150, 30);
        add(lBus);

        tBus = new JTextField();
        tBus.setBounds(350, 200, 100, 25);
        add(tBus);

        JLabel lIp = new JLabel("IP");
        lIp.setBounds(470, 170, 100, 30);
        add(lIp);

        tIp = new JTextField();
        tIp.setBounds(470, 200, 80, 25);
        add(tIp);

        // Calculate Button
        btnCalc = new JButton("calculate");
        btnCalc.setBounds(230, 250, 120, 35);
        btnCalc.addActionListener(this);
        add(btnCalc);

         // Result Fields
        JLabel lTotal = new JLabel("Total Mark");
        lTotal.setBounds(100, 310, 100, 30);
        add(lTotal);

        tTotal = new JTextField();
        tTotal.setBounds(200, 310, 100, 25);
        add(tTotal);

        JLabel lPercent = new JLabel("Percentage");
        lPercent.setBounds(100, 350, 100, 30);
        add(lPercent);

        tPercent = new JTextField();
        tPercent.setBounds(200, 350, 100, 25);
        add(tPercent);

        JLabel lGrade = new JLabel("Grade");
        lGrade.setBounds(100, 390, 100, 30);
        add(lGrade);

        tGrade = new JTextField();
        tGrade.setBounds(200, 390, 100, 25);
        add(tGrade);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int eng = Integer.parseInt(tEng.getText());
            int acc = Integer.parseInt(tAcc.getText());
            int eco = Integer.parseInt(tEco.getText());
            int bus = Integer.parseInt(tBus.getText());
            int ip  = Integer.parseInt(tIp.getText());

            int total = eng + acc + eco + bus + ip;
            double percent = total / 5.0;

            tTotal.setText(String.valueOf(total));
            tPercent.setText(String.format("%.2f", percent));

            String grade;
            if (percent >= 90) grade = "A+";
            else if (percent >= 80) grade = "A";
            else if (percent >= 70) grade = "B";
            else if (percent >= 60) grade = "C";
            else if (percent >= 50) grade = "D";
            else grade = "Fail";

            tGrade.setText(grade);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Enter valid numeric marks!");
        }
    }

    public static void main(String[] args) {
        new StudentResult();
    }
}








        

















