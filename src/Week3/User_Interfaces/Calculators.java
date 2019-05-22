//22 may 2019
package Week3.User_Interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculators {

    JFrame frame;

    public void calc(){
        frame  = new JFrame("Morris Calculator");
        frame.setSize(800,700);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.getContentPane().setLayout(null);
        //two ways.. go back to the first interface and create an object to display this jframe
        // oryou can use inheritance and inherit this method and jframe

        //labels, text fields and buttons
        JLabel num1 = new JLabel("First Number: ");
        JLabel num2 = new JLabel("Second Number: ");
        JLabel ans = new JLabel();
        JTextField txtnum1 = new JTextField();
        JTextField txtnum2 = new JTextField();
        JButton btnAdd = new JButton("Add the Math");

        //set the position for each where they will appear in a frame
        num1.setBounds(100,100, 300, 50);
        txtnum1.setBounds(100,200, 300, 50);
        num2.setBounds(100,300, 300, 50);
        txtnum2.setBounds(100, 400, 300, 50);

        ans.setBounds(100, 450, 300, 50);
        btnAdd.setBounds(100, 600, 300, 50);

        //styling
        num1.setForeground(Color.CYAN);
        num2.setForeground(Color.red);
        btnAdd.setBackground(Color.RED);
        ans.setForeground(Color.GREEN);
        Font f = new Font("Chiller", Font.BOLD, 15);
        ans.setFont(f);

        //add them to fram
        frame.add(num1);
        frame.add(num2);
        frame.add(txtnum1);
        frame.add(txtnum2);
        frame.add(btnAdd);
        frame.add(ans);

        //add a listener to the button
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //get text & validation
                if(txtnum1.getText().length()==0 || txtnum2.getText().length()==0) {

                }else{
                    double number1 = Double.parseDouble(txtnum1.getText());
                    double number2 = Double.parseDouble(txtnum2.getText());

                    double sum = number1 + number2;
                    ans.setText("The answer is: " + sum);
                }//end if
            }
        });



        frame.setVisible(true);
    }//end calc
}//end class
