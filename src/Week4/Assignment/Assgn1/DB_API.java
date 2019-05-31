package Week4.Assignment.Assgn1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DB_API {

    //1. Setup MySQL connection

    public boolean insertCars(){
        boolean ins = false;
        Connection conn;//sets the default java function Connection to conn

        try {
            conn = DriverManager.getConnection(Constantz.DRIVER, Constantz.USER, Constantz.PASSWORD);
            String sql = "INSERT INTO Car (Reg_No, Year, Model_No, Make) VALUES (?, ?, ?, ?)";
            PreparedStatement stat = conn.prepareStatement(sql);

            Car1 car = new Car1();

            stat.setString(1, car.getRegNo());
            stat.setInt(2, car.getYearOfMake());
            stat.setString(3, car.getModelNumber());
            stat.setString(4, car.getMake());

            //execution of the commmand
            int count = stat.executeUpdate();
            if (count == 1){
                ins = true;
            }else{
                ins = false;
            }//end if
            conn.close();

        } catch (SQLException e){
            System.out.println(e.getNextException());
            e.printStackTrace();
        }//end try

        return ins;
    }//end insertCars
}
