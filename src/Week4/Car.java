// 28th - may -2019
package Week4;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Car {
    ServerConnection serverconn = new ServerConnection();

    private String regNo;
    private int yearOfMake;
    private String modelNumber;
    private String make;

    public Car(String regNo) {
        this.regNo = regNo;
    }

    public Car() {
    }

    public Car(String regNo, int yearOfMake, String modelNumber, String make) {
        this.regNo = regNo;
        this.yearOfMake = yearOfMake;
        this.modelNumber = modelNumber;
        this.make = make;
    }

    public String getRegNo() {
        return regNo;
    }

    public int getYearOfMake() {
        return yearOfMake;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public String getMake() {
        return make;
    }
    public boolean insCars() {
        Connection conn;
        boolean t = false;

        {
            try {
                conn = DriverManager.getConnection(Constants.driver, Constants.user, Constants.password);
                String sql = "INSERT INTO Car(Reg_No, Year, Model_No, Make) VALUES(?, ?, ?, ?)";
                PreparedStatement stat = conn.prepareStatement(sql);



                stat.setString(1, getRegNo());
                stat.setInt(2, getYearOfMake());
                stat.setString(3, getModelNumber());
                stat.setString(4, getMake());


                System.out.println("Output"+getMake());
                //execute
                int count = stat.executeUpdate();
                if (count == 1){
                    t = true;
                }else{
                    t = false;
                }//end if
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return t;
    }//end method

//    public String search(){
//        return serverconn.searchCars();
//    }

}
