//22 May 2019

package Week3.User_Interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface_Sample {

    public static void main (String [] args){
        Interface_Sample x = new Interface_Sample();
        x.starter();


    }//end main

    //methods will be void because the interfaces will not be returning anything

    JFrame frame1;//its global so it will be used in any other methods so the question is, will it usefull to
    // allmethods or just this one method?
    JMenuBar bar;//for creating menu bar without menus.
    JMenu file, help;//the actual menu but where are the menu items? haha
    JMenuItem fileCalc, filePayroll, fileBMI;//the items of the menu

    //jmenu items for help
    JMenuItem helpCalc, helpPayroll, helpBMI;


    public void starter(){
        frame1 = new JFrame("My First Frame y'all!");//==> default constructor to create a frame and accept a parameter
        frame1.setSize(600,700);
        //frame1.setPreferredSize(new Dimension(600, 700));

        //creating menues
        bar = new JMenuBar();
        file = new JMenu("Files");
        fileCalc = new JMenuItem("Calculator");
        filePayroll = new JMenuItem("Payrolls");
        fileBMI = new JMenuItem("Body Mass Index");

        //add JMenu items to the file menu
        file.add(fileCalc);
        file.add(filePayroll);
        file.add(fileBMI);

        //add file menu to the menu bar
        bar.add(file);
        //end of first menu

        //help menu
        help = new JMenu("Help");
        helpBMI = new JMenuItem("BMI");
        helpCalc = new JMenuItem("Calculator");
        helpPayroll = new JMenuItem("Payroll");
        //add to help
        help.add(helpCalc);
        help.add(helpBMI);
        help.add(helpPayroll);
        //add help to the bar
        bar.add(help);
        //end help menu


        //adding listeners to the menu items
        fileCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Action performed.. It is working");
                new Calculators().calc();
            }
        });//end file calc

        filePayroll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Paroll is working");
            }
        });//end payroll

        fileBMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int w =123, x = 89;
                int j = w*x;
                System.out.println("Action performed.. \n Your BMI is: " +j);

            }
        });




        //add bar to the jframe
        frame1.setJMenuBar(bar);
        frame1.setVisible(true);//make the frame visible, or else it will not show thn go to main and create an object x for the interface
    }//end starter method

}//end class
