package further_practice.StudentsMgT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

            //see if there is anything in the getters
            System.out.println("\nThe DB API values:\n");

            System.out.println("==> "+stdObj.getAdmNo());
            System.out.println("==> "+stdObj.getstudNames());
            System.out.println("==> "+stdObj.getForm());
            System.out.println("==> "+stdObj.getStream());
            System.out.println("==> "+stdObj.getClub());
            System.out.println("==> "+stdObj.getHouse());

            //Values to be passed to the db from the object are done here

            stat.setInt(1, stdObj.getAdmNo());
            stat.setString(2, names);
            stat.setString(3, form);
            stat.setString(4, stream);
            stat.setString(5, club);
            stat.setString(6, house);

//            stat.setInt(1, stdObj.getAdmNo());
//            stat.setString(2, stdObj.getstudNames());
//            stat.setString(3, stdObj.getForm());
//            stat.setString(4, stdObj.getStream());
//            stat.setString(5, stdObj.getClub());
//            stat.setString(6, stdObj.getHouse());


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

    public void searchStudent(){

    }//end searchStudent method

}//end class
