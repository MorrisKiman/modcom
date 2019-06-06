package further_practice.StudentsMgT;

import java.sql.*;

public class Student_DB_API {

    public boolean save_Student(String names, String form, String stream, String club, String house){
        //the reason why thi method is a boolean is because either the data was saved, or it wasn't...
        boolean saved = false;

        //create connection
        Connection con;

        //create a try - catch clause for attempting the transaction and keeping the program from crashing in case the
        //transaction fails
        try {
            //connection string to give the application access to the database
            con = DriverManager.getConnection(Student_Constants.DRIVE, Student_Constants.USER, Student_Constants.PASSWORD);

            //lets do the SQL string
            String sql = "INSERT INTO Student VALUES (?,?,?,?,?,?)";

            //lets fuse the connection string to the sql query and do the do...
            PreparedStatement stat = con.prepareStatement(sql);

            //we are getting this data from the Student object
            Student_Object stdObj = new Student_Object();

            //Values to be passed to the db from the object are done here

            stat.setInt(1, stdObj.getAdmNo());
            stat.setString(2, names);
            stat.setString(3, form);
            stat.setString(4, stream);
            stat.setString(5, club);
            stat.setString(6, house);
            //we have set the variables now let us check if the insertion has been done successfuly
            int count = stat.executeUpdate();

            if(count == 1){
                //it means that the saving process was successful so we set the boolean return value to true
                saved = true;
            }else{
                //the process was a failure.
                System.out.println("Saving record failed!");
                saved = false;
            }//end if
            //now close the connection
            con.close();

        }catch (SQLException e){
            e.printStackTrace();
        }//end try - catch

        System.out.println(saved);//printout the result of the operation to the console
        return saved;

    }//end save student method
    ResultSet result;

    public ResultSet searchStudent() {

        Student_Object sOb = new Student_Object();
        try (Connection conn = DriverManager.getConnection(Student_Constants.DRIVE, Student_Constants.USER, Student_Constants.PASSWORD)) {

            String sql = "SELECT * FROM Student";
            Statement statement = conn.createStatement();
            result = statement.executeQuery(sql);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }//end try catch statement*/

            return result;
        }//end Search Student method

    public void searchStudent(String columnName, String value){
        try{
            Connection con = DriverManager.getConnection(Student_Constants.DRIVE, Student_Constants.USER, Student_Constants.PASSWORD);
            if (value == null){
                String sql = "SELECT * FROM Student";
                Statement statement = con.createStatement();
                result = statement.executeQuery(sql);
            }else{
                String sql = "SELECT * FROM Student where ? = ?";

                PreparedStatement stat = con.prepareStatement(sql);
                stat.setString(1, columnName);
                stat.setString(2, value);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }

    }//end parameter search

    public boolean updateStudent(String admNo, String names, String form, String stream, String club, String house){
        boolean saved = false;

        Connection con;

        try {
            con = DriverManager.getConnection(Student_Constants.DRIVE, Student_Constants.USER, Student_Constants.PASSWORD);

            String sql = "UPDATE Student set Names =?, Form =?, Stream =?, Club =?, House =? where AdmNo = ?";

            PreparedStatement stat = con.prepareStatement(sql);

            stat.setString(1, names);
            stat.setString(2, form);
            stat.setString(3, stream);
            stat.setString(4, club);
            stat.setString(5, house);
            stat.setString(6, admNo);
            //we have set the variables now let us check if the insertion has been done successfuly
            int count = stat.executeUpdate();

            if(count == 1){
                //it means that the saving process was successful so we set the boolean return value to true
                saved = true;
            }else{
                //the process was a failure.
                System.out.println("Saving record failed!");
                saved = false;
            }//end if
            //now close the connection
            con.close();

        }catch (SQLException e){
            e.printStackTrace();
        }//end try - catch

        System.out.println(saved);//printout the result of the operation to the console
        return saved;
    }//end update method

    public boolean deleteStudent(String admNo){
        boolean deleted = false;

        Connection con;

        try {
            con = DriverManager.getConnection(Student_Constants.DRIVE, Student_Constants.USER, Student_Constants.PASSWORD);

            String sql = "DELETE  FROM Student where AdmNo = ?";

            PreparedStatement stat = con.prepareStatement(sql);
            stat.setString(1, admNo);
            //we have set the variables now let us check if the insertion has been done successfuly
            int count = stat.executeUpdate();

            if(count > 0){
                //it means that the saving process was successful so we set the boolean return value to true
                deleted = true;
            }else{
                //the process was a failure.
                System.out.println("Deleting record failed!");
                deleted = false;
            }//end if
            //now close the connection
            con.close();

        }catch (SQLException e){
            e.printStackTrace();
        }//end try - catch

        System.out.println(deleted);//printout the result of the operation to the console
        return deleted;

    }//end delete function

    }//end class
