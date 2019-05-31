package further_practice.StudentsMgT;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Student_UI extends JPanel {

    private JMenuBar jcomp1;
    private JLabel jcomp2,jcomp3, jcomp4, jcomp5, jcomp6, jcomp13, jcomp15,jcomp16, jcomp20;
    private JTextField txtSNames;
    private JComboBox cbxSform, cbxSStream, cbxSclub, cbxShouse, cbxSearchCriteria, cbxActions;
    private JButton btnSave, btnSearch, btnEdit;
    private JTextField txtSpecializedSearch, txtAdminEdtor;
    Student_DB_API api = new Student_DB_API();

    public static void main (String[] args) {
        JFrame frame = new JFrame ("Student Management System");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Student_UI());
        frame.pack();
        frame.setVisible (true);
    }

    //JFrame frame1;

    public Student_UI() {
        //construct the frame
        //frame1 = new
        //construct preComponents
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
        String[] cbxSformItems = {"1", "2", "3", "4"};
        String[] cbxSStreamItems = {"North", "South", "East", "West", "Central"};
        String[] cbxSclubItems = {"Drama", "Music", "Science", "Maths", "Computer", "Junior Acheivers", "Presidential Awards"};
        String[] cbxShouseItems = {"Nairobi", "Mombasa", "Kisumu", "Nanyuki", "Bungoma"};
        String[] cbxSearchCriteriaItems = {"Adm. No.", "Names", "Form", "Stream", "House", "Clubs"};
        String[] jcomp21Items = {"Add Student", "Edit Student Details"};

        //construct components
        jcomp1 = new JMenuBar();
        jcomp1.add (fileMenu);
        jcomp1.add (helpMenu);
        jcomp2 = new JLabel ("Students Management System");
        jcomp3 = new JLabel ("Student Names: ");
        jcomp4 = new JLabel ("Student Form: ");
        jcomp5 = new JLabel ("Student Stream: ");
        jcomp6 = new JLabel ("Student Club: ");
        txtSNames = new JTextField (5);
        cbxSform = new JComboBox (cbxSformItems);
        cbxSStream = new JComboBox (cbxSStreamItems);
        cbxSclub = new JComboBox (cbxSclubItems);
        btnSave = new JButton ("Save Details");
        btnSearch = new JButton ("Search");
        jcomp13 = new JLabel ("Student House: ");
        cbxShouse = new JComboBox (cbxShouseItems);
        jcomp15 = new JLabel ("<===================Search Area=================>");
        jcomp16 = new JLabel ("Search By: ");
        cbxSearchCriteria = new JComboBox (cbxSearchCriteriaItems);
        txtSpecializedSearch = new JTextField (5);
        btnEdit = new JButton ("Edit Details");
        jcomp20 = new JLabel ("Select Action");
        cbxActions = new JComboBox (jcomp21Items);
        txtAdminEdtor = new JTextField (5);

        //set components properties
        cbxSform.setToolTipText ("Select the student's form");
        cbxSStream.setToolTipText ("Select the student's stream");
        cbxSclub.setToolTipText ("Select the student's club");
        cbxShouse.setToolTipText ("Select the student's house");
        txtSpecializedSearch.setToolTipText ("Use * to give all records");
        btnEdit.setEnabled (false);

        //adjust size and set layout
        setPreferredSize (new Dimension (466, 522));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);
        add (jcomp5);
        add (jcomp6);
        add (txtSNames);
        add (cbxSform);
        add (cbxSStream);
        add (cbxSclub);
        add (btnSave);
        add (btnSearch);
        add (jcomp13);
        add (cbxShouse);
        add (jcomp15);
        add (jcomp16);
        add (cbxSearchCriteria);
        add (txtSpecializedSearch);
        add (btnEdit);
        add (jcomp20);
        add (cbxActions);
        add (txtAdminEdtor);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (0, 0, 470, 30);
        jcomp2.setBounds (130, 25, 220, 35);
        jcomp3.setBounds (20, 100, 125, 25);
        jcomp4.setBounds (20, 135, 125, 25);
        jcomp5.setBounds (20, 170, 125, 25);
        jcomp6.setBounds (20, 205, 125, 25);
        txtSNames.setBounds (145, 100, 250, 25);
        cbxSform.setBounds (145, 135, 135, 25);
        cbxSStream.setBounds (145, 170, 135, 25);
        cbxSclub.setBounds (145, 205, 135, 25);
        btnSave.setBounds (290, 135, 120, 25);
        btnSearch.setBounds (370, 305, 90, 25);
        jcomp13.setBounds (20, 240, 125, 25);
        cbxShouse.setBounds (145, 240, 135, 25);
        jcomp15.setBounds (0, 280, 470, 25);
        jcomp16.setBounds (15, 305, 85, 25);
        cbxSearchCriteria.setBounds (100, 305, 100, 25);
        txtSpecializedSearch.setBounds (210, 305, 160, 25);
        btnEdit.setBounds (290, 165, 120, 30);
        jcomp20.setBounds (60, 55, 100, 25);
        cbxActions.setBounds (165, 55, 140, 25);
        txtAdminEdtor.setBounds (330, 55, 100, 25);

        //time for the logic of the system.
        //1. Insertion Methods

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //throw data into the object
                Student_Object sOb = new Student_Object();
                sOb.setstudNames(txtSNames.getText());
                sOb.setForm(cbxSform.getSelectedItem().toString());
                sOb.setStream(cbxSStream.getSelectedItem().toString());
                sOb.setClub(cbxSclub.getSelectedItem().toString());
                sOb.setHouse(cbxShouse.getSelectedItem().toString());

                Student_DB_API dbAPI = new Student_DB_API();

                //push to the database
                boolean x = dbAPI.save_Student(sOb.getstudNames(), sOb.getForm(), sOb.getStream(), sOb.getClub(), sOb.getHouse());
                if (x){
                    JOptionPane.showMessageDialog(null, "The save was successful");
                    System.out.println("Good");
                }

                else {
                    JOptionPane.showMessageDialog(null, "The save was unsuccessful");
                    System.out.println("Bad");
                }

            }
        });


    }

}
/*
I realize that there are two ways that the reason why the getters in the Student_DB_API class is probably because
we are re-initializing the class and reset all it's values to null every time we create it afresh as we call it from
the Student object class. I don't know if this makes any sense at all but it is my observation that these methods need to instead
be given parameters to be satisfied by the object class instead of leaving them null. THat is how I have managed to make this
work. Hopefully it is true for all the others.

 */