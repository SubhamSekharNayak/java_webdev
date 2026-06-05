import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator extends JFrame implements ActionListener {

    JTextField t1, t2, t3;
    JButton bAdd, bSub, bMul, bDiv, bReset;

    Calculator() {
        setTitle("Simple Calculator");
        setSize(450, 350);
        setLayout(null);


        //Labels
        JLabel l1 = new JLabel("First Number");
        l1.setBounds(50, 40, 120, 30);

        JLabel l2 = new JLabel("Second Number");
        l2.setBounds(50, 90, 120, 30);

        JLabel l3 = new JLabel("Total Number");
        l3.setBounds(50, 140, 120, 30);

        //TextFields
        t1 = new JTextField();
        t1.setBounds(180, 40, 180, 30);

        t2 = new JTextField();
        t2.setBounds(180, 90, 180, 30);

        t3 = new JTextField();
        t3.setBounds(180,140, 180, 30);
        t3.setEditable(false);

        //Buttons
        bAdd = new JButton("Add");
        bAdd.setBounds(40, 200, 70, 40);

        bSub = new JButton("Sub");
        bSub.setBounds(120, 200, 70, 40);

        bMul = new JButton("Mul");
        bMul.setBounds(200, 200, 70, 40);

        bDiv = new JButton("Div");
        bDiv.setBounds(280, 200, 70, 40);

        bReset = new JButton("Reset");
        bReset.setBounds(360, 200, 70, 40);

        //Add ActionListeners
        bAdd.addActionListener(this);
        bSub.addActionListener(this);
        bMul.addActionListener(this);
        bDiv.addActionListener(this);
        bReset.addActionListener(this);

        //Add components
        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);

        add(bAdd); add(bSub); add(bMul); add(bDiv); add(bReset);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
    }
    public void actionPerformed(ActionEvent e) {
        try{
            double num1 = Double.parseDouble(t1.getText());
            double num2 = Double.parseDouble(t2.getText());
            double result = 0;

            if(e.getSource() == bAdd) {
                result = num1 + num2;
            }else if(e.getSource()==bSub){
                result=num1-num2;
            }else if(e.getSource()==bMul){
                result=num1*num2;
            }else if(e.getSource()==bDiv){
                result=num1/num2;
            }
            
            t3.setText(String.valueOf(result));

            if(e.getSource()==bReset){
                t1.setText("");
                t2.setText("");
                t3.setText("");
            }

        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Enter Valid Numbers!");
        }
    }

    public static void main(String[] args){
        new Calculator();
    }
}