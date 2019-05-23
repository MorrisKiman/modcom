//23 - may -2019
//today we will be creating tabs.. I was lazy so
package Week3.User_Interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Interface2 {
    public static void main(String[]args){
        Interface2 x = new Interface2();
        x.starter();
    }

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
        });//end

        //<=======================We do tabs here==============================>\
        //they help in preventing creation of too many JPanels(windows)
        JTabbedPane tabPane = new JTabbedPane();
        //add tabed pane to your frame
        frame1.getContentPane().add(tabPane);//NB Tabbed panes do not have tabs!!!
        //if the tabs in the tabbed pane doesn't have content, it will crash

        //add 4 tabs
        tabPane.addTab("New Student", new NewStudent());
        tabPane.addTab("New Teachers", new NewTeacher());
        tabPane.addTab("New Course", null);
        tabPane.addTab("New Subject", null);


        //add bar to the jframe
        frame1.setJMenuBar(bar);
        frame1.setVisible(true);//make the frame visible, or else it will not show thn go to main and create an object x for the interface
    }//end starter method


}//end class

class NewStudent extends JPanel{
    JTextField txtName, txtAge;
    JComboBox cmbPrograms;
    JCheckBox checkIT, checkBiz, checkLay;//if you do not wish to create combos one at a time, figure out how to do so using loops
    JButton submit;
    NewStudent(){
        txtName = new JTextField();
        txtAge = new JTextField();
        String [] items = {"IT", "BBIT", "COmp.Scie", "Telecoms"};
        cmbPrograms = new JComboBox(items);
        checkIT = new JCheckBox("Technologey");
        checkBiz = new JCheckBox("Business");
        checkLay = new JCheckBox("Languages");
        submit = new JButton("Submit");

        //set size
        setPreferredSize(new Dimension(500,500));
        setLayout(null);

        //set bounds
        // txtName;

        txtName.setBounds(100,100,300,50);
        txtAge.setBounds(100,150,300,50);
        cmbPrograms.setBounds(100,200,300,50);
        checkIT.setBounds(100,250,300,50);
        checkBiz.setBounds(100,300,300,50);
        checkLay.setBounds(100,350,300,50);
        submit.setBounds(100,400,300,50);

        //add to opanel
        add(txtAge);
        add(cmbPrograms);
        add(checkIT);
        add(checkBiz);
        add(checkLay);
        add(submit);

    }//end NewStudent
        }//end class

class NewTeacher extends JPanel {
    private JToggleButton jcomp1;
    private JToggleButton jcomp2;
    private JLabel jcomp3;
    private JTextField jcomp4;
    private JLabel jcomp5;
    private JTextField jcomp6;
    private JLabel jcomp7;
    private JComboBox jcomp8;
    private JLabel jcomp9;
    private JTextField residence;
    private JLabel jcomp11;
    private JRadioButton jcomp12;
    private JRadioButton jcomp13;
    private JLabel jcomp14;
    private JCheckBox jcomp15;
    private JCheckBox jcomp16;
    private JCheckBox jcomp17;
    private JLabel jcomp18;
    private JSlider RateBar;
    private JMenuBar jcomp20;

    public NewTeacher() {
        //construct preComponents
        String[] jcomp8Items = {"Diploma", "Undergraduate", "Post Graduate"};
        JMenu fileMenu = new JMenu ("File");
        JMenuItem printItem = new JMenuItem ("Print");
        fileMenu.add (printItem);
        JMenuItem exitItem = new JMenuItem ("Exit");
        fileMenu.add (exitItem);
        JMenu helpMenu = new JMenu ("Help");
        JMenuItem contentsItem = new JMenuItem ("Contents");
        helpMenu.add (contentsItem);
        JMenuItem aboutItem = new JMenuItem ("About");
        helpMenu.add (aboutItem);

        //construct components
        jcomp1 = new JToggleButton ("Save", false);
        jcomp2 = new JToggleButton ("Reset", false);
        jcomp3 = new JLabel ("Sirname:");
        jcomp4 = new JTextField (5);
        jcomp5 = new JLabel ("Other Names: ");
        jcomp6 = new JTextField (5);
        jcomp7 = new JLabel ("Education");
        jcomp8 = new JComboBox (jcomp8Items);
        jcomp9 = new JLabel ("Residence");
        residence = new JTextField (5);
        jcomp11 = new JLabel ("Gender");
        jcomp12 = new JRadioButton ("Male");
        jcomp13 = new JRadioButton ("Female");
        ButtonGroup rc = new ButtonGroup();//forgot to group the radio buttons so we group them like this
        rc.add(jcomp12);
        rc.add(jcomp13);
        jcomp14 = new JLabel ("Major");
        jcomp15 = new JCheckBox ("Information Security");
        jcomp16 = new JCheckBox ("Networks");
        jcomp17 = new JCheckBox ("Artificial Intelligence");
        jcomp18 = new JLabel ("Rate Yourself");
        RateBar = new JSlider (0, 10);
        jcomp20 = new JMenuBar();
        jcomp20.add (fileMenu);
        jcomp20.add (helpMenu);

        //set components properties
        RateBar.setOrientation (JSlider.HORIZONTAL);
        RateBar.setMinorTickSpacing (1);
        RateBar.setMajorTickSpacing (5);
        RateBar.setPaintTicks (true);
        RateBar.setPaintLabels (true);
        RateBar.setToolTipText ("Ratheth Thy Self");

        //adjust size and set layout
        setPreferredSize (new Dimension (666, 558));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);
        add (jcomp5);
        add (jcomp6);
        add (jcomp7);
        add (jcomp8);
        add (jcomp9);
        add (residence);
        add (jcomp11);
        add (jcomp12);
        add (jcomp13);
        add (jcomp14);
        add (jcomp15);
        add (jcomp16);
        add (jcomp17);
        add (jcomp18);
        add (RateBar);
        add (jcomp20);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (110, 505, 100, 25);
        jcomp2.setBounds (375, 505, 100, 25);
        jcomp3.setBounds (30, 25, 100, 25);
        jcomp4.setBounds (35, 50, 240, 25);
        jcomp5.setBounds (35, 75, 100, 25);
        jcomp6.setBounds (35, 105, 245, 25);
        jcomp7.setBounds (35, 140, 70, 25);
        jcomp8.setBounds (35, 170, 240, 25);
        jcomp9.setBounds (40, 235, 100, 25);
        residence.setBounds (40, 260, 215, 25);
        jcomp11.setBounds (55, 345, 100, 25);
        jcomp12.setBounds (105, 375, 100, 25);
        jcomp13.setBounds (105, 405, 100, 25);
        jcomp14.setBounds (410, 15, 100, 25);
        jcomp15.setBounds (410, 40, 190, 25);
        jcomp16.setBounds (415, 70, 100, 25);
        jcomp17.setBounds (415, 100, 185, 25);
        jcomp18.setBounds (360, 140, 100, 25);
        RateBar.setBounds (365, 170, 300, 55);
        jcomp20.setBounds (0, 0, 665, 25);

        //button listener
        jcomp1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String selected = jcomp8.getSelectedItem().toString();//for comboboxes
                int x = 0;

                //checkboxes
                ArrayList<String> arraylist = new ArrayList<>();
                String[] major;
                if (jcomp15.isSelected()){
                    x = 7000;
                    arraylist.add(jcomp15.getText());
                }//end if

                if (jcomp16.isSelected()){
                    x+=9000;
                    arraylist.add(jcomp15.getText());
                }//end if
                if (jcomp17.isSelected()){
                    x+= 123456;
                    arraylist.add(jcomp15.getText());
                }//end if

                System.out.println(arraylist);
                System.out.println(arraylist.size());
                major = arraylist.toArray(new String[arraylist.size()]);
                System.out.println(major[0]);
                System.out.println(x);

                //radio buttons
                String rad;
                if (jcomp12.isSelected()){
                    rad = jcomp12.getText();
                } else {
                    rad = jcomp12.getText();
                }
                //to have a radio button selected by default use the following after you create it
                jcomp12.setSelected(true);//<radio button name>.setSelected(true/false)
            }
        });

    }
}//convert and arraylist to an arry in java

/*

Assignment hints
actionn  listener in the checkBoxes









 */