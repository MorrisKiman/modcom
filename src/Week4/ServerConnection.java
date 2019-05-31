// 28th - may -2019
package Week4;

import java.sql.*;
import java.util.ArrayList;

public class ServerConnection {
    //first setup the mysql connection
    //file - project structure - modules
    String reg;
    public boolean insCars() {
        Connection conn;
        boolean t = false;

        {
            try {
                conn = DriverManager.getConnection(Constants.driver, Constants.user, Constants.password);
                String sql = "INSERT INTO Car(Reg_No, Year, Model_No, Make) VALUES(?, ?, ?, ?)";
                PreparedStatement stat = conn.prepareStatement(sql);

                Car car = new Car();

                stat.setString(1, car.getRegNo());
                stat.setInt(2, car.getYearOfMake());
                stat.setString(3, car.getModelNumber());
                stat.setString(4, car.getMake());
                System.out.println("Output"+car.getMake());
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
   ArrayList<String> arrayList;
    public String searchCars(String x) {
        Connection conn;
        boolean t = false;

        {
            try {
                conn = DriverManager.getConnection(Constants.driver, Constants.user, Constants.password);
                String sql = "SELECT * FROM Car";
                PreparedStatement stat = conn.prepareStatement(sql);

                Car car = new Car();

                //stat.setString(1, car.getRegNo());
                System.out.println("Output"+car.getRegNo());
                //execute
                ResultSet data = stat.executeQuery(sql);


                while (data.next()) {
                    reg = data.getString(1);
                    String Year = data.getString(2);
                    String Model = data.getString(3);
                    String Make = data.getString(4);

                    System.out.print(reg +"  ");
                    System.out.print(Year +"  ");
                    System.out.print(Model +"  ");
                    System.out.print(Make);
                    System.out.println(" ");


//                    arrayList.add(reg);
//                    arrayList.add(Year);
//                    arrayList.add(Model);
//                    arrayList.add(Make);
                }

                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return reg;
    }//end method






}
