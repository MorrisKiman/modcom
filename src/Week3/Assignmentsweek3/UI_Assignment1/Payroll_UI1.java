package Week3.Assignmentsweek3.UI_Assignment1;

import week2.week2Assignments.InheritanceAssigno.FooCorporation.Employee;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Payroll_UI1 {
    Methds methodes = new Methds();

    public static void main(String [] args){
        Payroll_UI1 x = new Payroll_UI1();
        x.pay_Roll();

    }//end main

    JFrame frame1;

    public void pay_Roll(){
        //variables
        //the ui
        frame1 = new JFrame("Morris Payroll System");
        frame1.setSize(500, 700);
        frame1.setMaximumSize(new Dimension(500, 150));
        frame1.setMinimumSize(new Dimension(500, 150));
        frame1.getContentPane().setLayout(null);

        //labels, textboxes and button definition
        JLabel namesLBL = new JLabel("Names: ");
        JLabel hrsWorkedLBL = new JLabel("Hours Worked");
        JLabel sep = new JLabel("<===============RESULTS ARE DOWN HERE===============>");
        JTextField namesTXT = new JTextField();
        JTextField hrsWorkedTXT = new JTextField();
        JButton calculateBTN = new JButton("Start Computation");
        //output stuff
        //place holder labels
        JLabel lbl_majina = new JLabel("Employee Names: ");
        JLabel lbl_hrsWorked = new JLabel("Hours Worked: ");
        JLabel lbl_hrlYpayRate = new JLabel("Hourly Pay Rate: ");
        JLabel lbl_GrossPay = new JLabel("Gross Pay: ");
        JLabel lbl_Deductions = new JLabel("Deductions: ");
        JLabel lbl_FedTax = new JLabel("Federal Tax withholding (20%): ");
        JLabel lbl_StateTax = new JLabel("State Tax withholding rate (9%): ");
        JLabel lbl_TotalDed = new JLabel("Total Deductions: ");
        JLabel lbl_NetPay = new JLabel("Net Pay: ");
        //Data Output Labels
        JLabel op_names = new JLabel("---------");
        JLabel op_hrsWorked = new JLabel("----Hrs");
        JLabel op_hrlyPR = new JLabel("----");
        JLabel op_GrossPay = new JLabel("----");
        JLabel op_Deds = new JLabel("----");
        JLabel op_FedTax = new JLabel("----");
        JLabel op_StateTax = new JLabel("----");
        JLabel op_TotalDed = new JLabel("----");
        JLabel op_netPay = new JLabel("----");




        //position everything
        namesLBL.setBounds(20,10, 70,30);
        hrsWorkedLBL.setBounds(20,50, 100,30);
        namesTXT.setBounds(130,10, 200,30);
        hrsWorkedTXT.setBounds(130,50, 100,30);
        calculateBTN.setBounds(100,90, 200,50);
        sep.setBounds(0,130, 500, 50);
        //Output layering
        lbl_majina.setBounds(20,170,200,30);
        op_names.setBounds(150,170,200,30);

        lbl_hrsWorked.setBounds(20,200,200,30);
        op_hrsWorked.setBounds(150,200,200,30);

        lbl_hrlYpayRate.setBounds(20,230,200,30);
        op_hrlyPR.setBounds(150,230,200,30);

        lbl_GrossPay.setBounds(20,260,200,30);
        op_GrossPay.setBounds(150,260,200,30);

        lbl_Deductions.setBounds(20,290,200,30);
        op_Deds.setBounds(150,290,200,30);

        lbl_FedTax.setBounds(20,320,250,30);
        op_FedTax.setBounds(260,320,200,30);

        lbl_StateTax.setBounds(20,350,250,30);
        op_StateTax.setBounds(260,350,200,30);

        lbl_TotalDed.setBounds(20,380,200,30);
        op_TotalDed.setBounds(150,380,200,30);

        lbl_NetPay.setBounds(20,410,200,30);
        op_netPay.setBounds(100,410,200,30);

        //add everything to the JFrame for viewing
        frame1.add(namesLBL);
        frame1.add(hrsWorkedLBL);
        frame1.add(namesTXT);
        frame1.add(hrsWorkedTXT);
        frame1.add(calculateBTN);
        frame1.add(sep);
        //output
        frame1.add(lbl_majina);
        frame1.add(lbl_hrsWorked);
        frame1.add(lbl_hrlYpayRate);
        frame1.add(lbl_GrossPay);
        frame1.add(lbl_Deductions);
        frame1.add(lbl_FedTax);
        frame1.add(lbl_StateTax);
        frame1.add(lbl_TotalDed);
        frame1.add(lbl_NetPay);
        frame1.add(op_names);
        frame1.add(op_hrsWorked);
        frame1.add(op_hrlyPR);
        frame1.add(op_GrossPay);
        frame1.add(op_Deds);
        frame1.add(op_FedTax);
        frame1.add(op_StateTax);
        frame1.add(op_TotalDed);
        frame1.add(op_netPay);

        calculateBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Employee_Object empObj = new Employee_Object();
                System.out.println("This button has been pressed");
                if (namesTXT.getText().length()==0 || hrsWorkedTXT.getText().length()==0){
                    System.out.println("Empty Text fields!!");
                }else {
                    try {
                            empObj.setNames(namesTXT.getText());
                            empObj.setHrsWorked(Integer.parseInt(hrsWorkedTXT.getText()));

                            new Pay_roll("Ken",5);

                            methodes.salCalc (Integer.parseInt(hrsWorkedTXT.getText()));
                            //methodes.allmths();
                            methodes.fedCalc();
                            methodes.stateCalc();
                            methodes.totalDeductions();
                            methodes.netCalc();





                            System.out.println("Methods called and done working!!\n Output time!!");
                            System.out.println(empObj.getFederalTax());
                        System.out.println(empObj.getStateTax());
                        System.out.println(empObj.getGrossPay());
                        System.out.println(empObj.getTotalDeductions());
                        System.out.println(empObj.getHrsWorked());
                        System.out.println(empObj.getNames());
                        System.out.println(empObj.getNetPay());


                            //ui output
                            op_names.setText(empObj.getNames());
                            op_hrsWorked.setText(String.valueOf(empObj.getHrsWorked()));
                            op_hrlyPR.setText(String.valueOf(Konstants.HOURLY_PAY_RATE));
                            op_GrossPay.setText(String.valueOf(empObj.getGrossPay()));
                            op_Deds.setText(String.valueOf(empObj.getTotalDeductions()));
                            op_FedTax.setText(String.valueOf(empObj.getFederalTax()));
                            op_StateTax.setText(String.valueOf(empObj.getStateTax()));
                            op_TotalDed.setText(String.valueOf(empObj.getTotalDeductions()));
                            op_netPay.setText(String.valueOf(empObj.getNetPay()));

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }//end try
                }//end if

            }
        });



        frame1.setVisible(true);
    }//end payroll
    /*
    Double.parseDouble(op_hrsWorked.setText());
    Double.parseDouble(op_hrlyPR.setText());
    Double.parseDouble(op_GrossPay.setText());
    Double.parseDouble(op_Deds.setText());
    Double.parseDouble(op_FedTax.setText());
    Double.parseDouble(op_StateTax.setText());
    Double.parseDouble(op_TotalDed.setText());
    Double.parseDouble(op_netPay.setText());*/
}//end class
