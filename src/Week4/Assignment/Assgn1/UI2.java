package Week4.Assignment.Assgn1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI2 {
    public static void main(String [] args){
        UI2 x = new UI2();
        x.menu();

    }//end main

    public void menu(){
        ////4 Jtext fields
        JFrame frame = new JFrame("My Car System");
        JPanel pack = new JPanel();
        pack.setPreferredSize(new Dimension(400, 400));
        JPanel pack1 = new JPanel();
        pack1.setPreferredSize(new Dimension(400, 400));
        frame.setSize(600, 700);
        BoxLayout boxLayout = new BoxLayout(pack, BoxLayout.Y_AXIS);
        BoxLayout boxLayout1 = new BoxLayout(pack1, BoxLayout.Y_AXIS);
        pack.setLayout(boxLayout);
        pack1.setLayout(boxLayout1);

        pack.setBorder(BorderFactory.createTitledBorder("Left"));
        pack.setBorder(BorderFactory.createTitledBorder("Right"));

        //frame.getContentPane().setLayout();

       JLabel lblRegNo = new JLabel("RegNo: ");
        final JTextField txtRegNo = new JTextField();

        JLabel lblYear = new JLabel("Year of Make: ");
        final JTextField txtyear = new JTextField();

        JLabel lblModelNo = new JLabel("Model No: ");
        final JTextField txtModelNo = new JTextField();

        JLabel lblMake = new JLabel("Make: ");
        String [] itemz = {"Toyota", "Nissan", "Mazda", "Honda"};
        final JComboBox cbxMake = new JComboBox(itemz);

        JButton btnSave = new JButton("Save Details");

        //pack.setBorder(new EmptyBorder(new Insets(10, 20, 10, 20)));

        pack.add(lblRegNo);
        pack.add(txtRegNo);
        pack.add(lblModelNo);
        pack.add(txtModelNo);
        pack.add(lblYear);
        pack.add(txtyear);

        pack1.add(lblMake);
        pack1.add(cbxMake);
        pack1.add(btnSave);
        frame.add(pack);
        frame.add(pack1);

        frame.setLayout(new FlowLayout());

        frame.setVisible(true);

        //button action listener
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //we create a class called car
                if(txtRegNo.getText().length() == 0 || Integer.parseInt(txtyear.getText()) == 0 || txtModelNo.getText().length() == 0 || cbxMake.getSelectedItem().toString().length() == 0){
                    JOptionPane.showMessageDialog(null,"NULL! EMPTY");
                }else{
                    Car1 c = new Car1();

                    c.setRegNo1(txtRegNo.getText());
                    c.setYearOfMake1(Integer.parseInt(txtyear.getText()));
                    c.setModelNumber1(txtModelNo.getText());
                    c.setMake1(cbxMake.getSelectedItem().toString());

                    System.out.println(c.getMake());
                    System.out.println(c.getRegNo());
                    System.out.println(c.getModelNumber());
                    System.out.println(c.getYearOfMake());

                    boolean x = c.fill();
                    if (x){
                        System.out.println("okay");
                    }

                    else {
                        System.out.println("Bad");
                    }

                }//end if
            }
        });


    }
}
