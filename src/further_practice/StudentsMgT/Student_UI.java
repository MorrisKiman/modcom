package further_practice.StudentsMgT;


import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Student_UI extends JPanel {

    private JMenuBar jcomp1;
    private JLabel jcomp2,jcomp3, jcomp4, jcomp5, jcomp6, jcomp13, jcomp15,jcomp16, jcomp20;
    private JTextField txtSNames;
    private JComboBox cbxSform, cbxSStream, cbxSclub, cbxShouse, cbxSearchCriteria, cbxActions, cbxSpecializedSearch;
    private JButton btnSave, btnSearch, btnEdit, btnDelete;
    private JTextField txtSpecializedSearch, txtAdminEdtor;
    private JTable tblDisplay;
    Student_DB_API api = new Student_DB_API();
    Student_Object sOb = new Student_Object();

    public static void main (String[] args) {
        JFrame frame = new JFrame ("Student Management System");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Student_UI());
        frame.pack();
        frame.setVisible (true);
    }//end of main method

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
        String[] cbxSearchCriteriaItems = {"AdmNo", "Names", "Form", "Stream", "Club", "House"};
        String[] cbxActionsItems = {"Add Student", "Edit Student Details", "Delete Student"};


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
        btnDelete = new JButton("Delete");
        jcomp20 = new JLabel ("Select Action");
        cbxActions = new JComboBox (cbxActionsItems);
        txtAdminEdtor = new JTextField (5);
        cbxSpecializedSearch = new JComboBox();

        String[] columnNames = {"Adm No", "Names", "Form", "Stream", "Club", "House"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);

        tblDisplay = new JTable();//created a new instance of the object
        tblDisplay.setModel(model);//set the model of the table as a default model
        tblDisplay.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);//auto resize the columns depending on the data that will be entered into it
        tblDisplay.setFillsViewportHeight(true);
        JScrollPane scroll = new JScrollPane(tblDisplay);
        scroll.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        //set components properties
        cbxSform.setToolTipText ("Select the student's form");
        cbxSStream.setToolTipText ("Select the student's stream");
        cbxSclub.setToolTipText ("Select the student's club");
        cbxShouse.setToolTipText ("Select the student's house");
        btnDelete.setToolTipText("Delete a student in the Database");
        txtSpecializedSearch.setToolTipText ("Leave empty to give all records, add details to narrow search");
        btnEdit.setEnabled (false);
        btnDelete.setEnabled(false);
        cbxSpecializedSearch.setEditable(true);

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
        add (btnDelete);
        add (btnSearch);
        add (jcomp13);
        add (cbxShouse);
        add (jcomp15);
        add (jcomp16);
        add (cbxSearchCriteria);
        add (txtSpecializedSearch);//txtSpecializedSearch);
        add (btnEdit);
        add (jcomp20);
        add (cbxActions);
        add (txtAdminEdtor);
        add (scroll);//this may be a mistake.. haha

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
        btnDelete.setBounds (290, 200, 120, 30);
        jcomp20.setBounds (60, 55, 100, 25);
        cbxActions.setBounds (165, 55, 140, 25);
        txtAdminEdtor.setBounds (330, 55, 100, 25);
        scroll.setBounds(20, 335, 430, 100);

        //time for the logic of the system.

        //activate/deactivate insertion
        cbxActions.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (cbxActions.getSelectedIndex() == 0){
                    btnDelete.setEnabled(false);
                    btnEdit.setEnabled(false);
                    btnSave.setEnabled(true);
                }else if(cbxActions.getSelectedIndex() == 1){
                    btnDelete.setEnabled(false);
                    btnEdit.setEnabled(true);
                    btnSave.setEnabled(false);
                }else if(cbxActions.getSelectedIndex() == 2){
                    btnDelete.setEnabled(true);
                    btnEdit.setEnabled(false);
                    btnSave.setEnabled(false);
                }
            }
        });


        //Insertion Methods
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



        //search method
        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                model.setRowCount(0);//clears the table before adding a new data-set to it.
                //without this function, it will keep stacking data-sets in the table such that
                // if there were 12 records in the table, if I press the button again there will
                // be 24 records if the database from where the data is being fetched from remains unchanged.
                String sValue = txtSpecializedSearch.getText();

                if (sValue.length()==0){
                    try{
                        Connection con = DriverManager.getConnection(Student_Constants.DRIVE, Student_Constants.USER, Student_Constants.PASSWORD);
                        String sql = "SELECT * FROM Student";
                        Statement statement = con.createStatement();
                        ResultSet result = statement.executeQuery(sql);

                        while (result.next()) {
                            String AdmNo = result.getString("AdmNo");
                            String Names = result.getString("Names");
                            String Form = result.getString("Form");
                            String Stream = result.getString("Stream");
                            String Club = result.getString("Club");
                            String House = result.getString("House");
                            model.addRow(new Object[]{AdmNo, Names, Form, Stream, Club, House});
                            System.out.println("This Button has been pressed again");
                            System.out.println(AdmNo + " " + Names + " " + Form + " " + Stream + " " + Club + " " + House);
                        }//end while
                        if (model.getRowCount() == 0) {
                            JOptionPane.showMessageDialog(null, "No record found");
                        }
                    } catch (SQLException ex){
                        ex.printStackTrace();
                    }//end try catch block when the textbox is empty it should just bring back everything
                } else {

                    try {
                        Connection conn = DriverManager.getConnection(Student_Constants.DRIVE, Student_Constants.USER, Student_Constants.PASSWORD);

                        switch (cbxSearchCriteria.getSelectedIndex()) {
                            case 0://Admin No
                                String sql = "SELECT * FROM Student where AdmNo='" + sValue + "'";//+ sValue;
                                PreparedStatement stat = conn.prepareStatement(sql);
                                //stat.setString(1, sValue);

                                //Statement statement = conn.createStatement();
                                ResultSet result = stat.executeQuery(sql);

                                // ResultSet result = api.searchStudent();
                                System.out.println("This Button has been pressed");

                                while (result.next()) {
                                    String AdmNo = result.getString("AdmNo");
                                    String Names = result.getString("Names");
                                    String Form = result.getString("Form");
                                    String Stream = result.getString("Stream");
                                    String Club = result.getString("Club");
                                    String House = result.getString("House");
                                    model.addRow(new Object[]{AdmNo, Names, Form, Stream, Club, House});
                                    System.out.println("This Button has been pressed again");
                                    System.out.println(AdmNo + " " + Names + " " + Form + " " + Stream + " " + Club + " " + House);
                                }//end while
                                if (model.getRowCount() == 0) {
                                    JOptionPane.showMessageDialog(null, "No record found");
                                }

                                result.close();
                                break;

                            case 1: //Names
                                String sql1 = "SELECT * FROM Student where Names like'%" + sValue + "%'";//+ sValue;
                                PreparedStatement stat1 = conn.prepareStatement(sql1);
                                //stat.setString(1, sValue);

                                //Statement statement = conn.createStatement();
                                ResultSet result1 = stat1.executeQuery(sql1);

                                // ResultSet result = api.searchStudent();
                                System.out.println("This Button has been pressed");

                                while (result1.next()) {
                                    String AdmNo = result1.getString("AdmNo");
                                    String Names = result1.getString("Names");
                                    String Form = result1.getString("Form");
                                    String Stream = result1.getString("Stream");
                                    String Club = result1.getString("Club");
                                    String House = result1.getString("House");
                                    model.addRow(new Object[]{AdmNo, Names, Form, Stream, Club, House});
                                    System.out.println("This Button has been pressed again");
                                    System.out.println(AdmNo + " " + Names + " " + Form + " " + Stream + " " + Club + " " + House);
                                }//end while
                                if (model.getRowCount() == 0) {
                                    JOptionPane.showMessageDialog(null, "No record found");
                                }

                                result1.close();

                                break;

                            case 2: //Form
                                String sql2 = "SELECT * FROM Student where Form='" + sValue + "'";//+ sValue;
                                PreparedStatement stat2 = conn.prepareStatement(sql2);
                                //stat.setString(1, sValue);

                                //Statement statement = conn.createStatement();
                                ResultSet result2 = stat2.executeQuery(sql2);

                                // ResultSet result = api.searchStudent();
                                System.out.println("This Button has been pressed");

                                while (result2.next()) {
                                    String AdmNo = result2.getString("AdmNo");
                                    String Names = result2.getString("Names");
                                    String Form = result2.getString("Form");
                                    String Stream = result2.getString("Stream");
                                    String Club = result2.getString("Club");
                                    String House = result2.getString("House");
                                    model.addRow(new Object[]{AdmNo, Names, Form, Stream, Club, House});
                                    System.out.println("This Button has been pressed again");
                                    System.out.println(AdmNo + " " + Names + " " + Form + " " + Stream + " " + Club + " " + House);
                                }//end while
                                if (model.getRowCount() == 0) {
                                    JOptionPane.showMessageDialog(null, "No record found");
                                }

                                result2.close();
                                break;

                            case 3: //Stream
                                String sql3 = "SELECT * FROM Student where Stream='" + sValue + "'";//+ sValue;
                                PreparedStatement stat3 = conn.prepareStatement(sql3);
                                //stat.setString(1, sValue);

                                //Statement statement = conn.createStatement();
                                ResultSet result3 = stat3.executeQuery(sql3);

                                // ResultSet result = api.searchStudent();
                                System.out.println("This Button has been pressed");

                                while (result3.next()) {
                                    String AdmNo = result3.getString("AdmNo");
                                    String Names = result3.getString("Names");
                                    String Form = result3.getString("Form");
                                    String Stream = result3.getString("Stream");
                                    String Club = result3.getString("Club");
                                    String House = result3.getString("House");
                                    model.addRow(new Object[]{AdmNo, Names, Form, Stream, Club, House});
                                    System.out.println("This Button has been pressed again");
                                    System.out.println(AdmNo + " " + Names + " " + Form + " " + Stream + " " + Club + " " + House);
                                }//end while
                                if (model.getRowCount() == 0) {
                                    JOptionPane.showMessageDialog(null, "No record found");
                                }

                                result3.close();
                                break;

                            case 4: //Club
                                String sql4 = "SELECT * FROM Student where Club='" + sValue + "'";//+ sValue;
                                PreparedStatement stat4 = conn.prepareStatement(sql4);
                                //stat.setString(1, sValue);

                                //Statement statement = conn.createStatement();
                                ResultSet result4 = stat4.executeQuery(sql4);

                                // ResultSet result = api.searchStudent();
                                System.out.println("This Button has been pressed");

                                while (result4.next()) {
                                    String AdmNo = result4.getString("AdmNo");
                                    String Names = result4.getString("Names");
                                    String Form = result4.getString("Form");
                                    String Stream = result4.getString("Stream");
                                    String Club = result4.getString("Club");
                                    String House = result4.getString("House");
                                    model.addRow(new Object[]{AdmNo, Names, Form, Stream, Club, House});
                                    System.out.println("This Button has been pressed again");
                                    System.out.println(AdmNo + " " + Names + " " + Form + " " + Stream + " " + Club + " " + House);
                                }//end while
                                if (model.getRowCount() == 0) {
                                    JOptionPane.showMessageDialog(null, "No record found");
                                }

                                result4.close();
                                break;

                            case 5: //House
                                String sql5 = "SELECT * FROM Student where House='" + sValue + "'";//+ sValue;
                                PreparedStatement stat5 = conn.prepareStatement(sql5);
                                //stat.setString(1, sValue);

                                //Statement statement = conn.createStatement();
                                ResultSet result5 = stat5.executeQuery(sql5);

                                // ResultSet result = api.searchStudent();
                                System.out.println("This Button has been pressed");

                                while (result5.next()) {
                                    String AdmNo = result5.getString("AdmNo");
                                    String Names = result5.getString("Names");
                                    String Form = result5.getString("Form");
                                    String Stream = result5.getString("Stream");
                                    String Club = result5.getString("Club");
                                    String House = result5.getString("House");
                                    model.addRow(new Object[]{AdmNo, Names, Form, Stream, Club, House});
                                    System.out.println("This Button has been pressed again");
                                    System.out.println(AdmNo + " " + Names + " " + Form + " " + Stream + " " + Club + " " + House);
                                }//end while
                                if (model.getRowCount() == 0) {
                                    JOptionPane.showMessageDialog(null, "No record found");
                                }

                                result5.close();
                                break;


                        }//end switch

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }//end if
            }
        });//end search button

        //update method
        btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (txtAdminEdtor.getText().length()==0){
                    JOptionPane.showMessageDialog(null, "Please enter the admission number of the student you wish to\nremove from the database in the textbox at the very top of the window.\nthank you");
                    txtAdminEdtor.grabFocus();
                }else{
                    if(txtSNames.getText().length()==0){
                        JOptionPane.showMessageDialog(null, "Please enter a name\nfor the student");
                        txtSNames.grabFocus();
                    }else {
                        boolean x = api.updateStudent(txtAdminEdtor.getText(), txtSNames.getText(), (String) cbxSform.getSelectedItem(), (String) cbxSStream.getSelectedItem(), (String) cbxSclub.getSelectedItem(), (String) cbxShouse.getSelectedItem());

                        if (x){
                            JOptionPane.showMessageDialog(null, "Record edited successfully");
                            System.out.println("Good");
                        }

                        else {
                            JOptionPane.showMessageDialog(null, "Record Update Failed!!\n Check your Database Connection");
                            System.out.println("Bad");
                        }//end if
                    }//end if
                }//end if

            }
        });

        //delete student method
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (txtAdminEdtor.getText().length()==0){
                    JOptionPane.showMessageDialog(null, "Please enter the admission number of the student whose details\nyou want to edit textbox at the very top of the window.\nthank you");
                    txtAdminEdtor.grabFocus();
                }else{
                    boolean x = api.deleteStudent(txtAdminEdtor.getText());
                        if (x) {
                            JOptionPane.showMessageDialog(null, "Deleted Successfuly");
                            System.out.println("Good");
                        } else {
                            JOptionPane.showMessageDialog(null, "The delete was unsuccessful\nCheck your connection to the\nDatabase");
                            System.out.println("Bad");
                        }//end if
                }//end if
            }
        });


    }//end student ui method

}//end class





/*
I realize that there are two ways that the reason why the getters in the Student_DB_API class is probably because
we are re-initializing the class and reset all it's values to null every time we create it afresh as we call it from
the Student object class. I don't know if this makes any sense at all but it is my observation that these methods need to instead
be given parameters to be satisfied by the object class instead of leaving them null. THat is how I have managed to make this
work. Hopefully it is true for all the others.

 */