//17th - may - 2019
//lesson 6
package weekTwo.week2Assignments;

import weekTwo.Lesson6_Encapulation;

import java.util.Scanner;

public class lesson6_EncapTest {
    public static void main(String [] args){
        Lesson6_Encapulation object = new Lesson6_Encapulation("Joe", 87900, "Kiambu");
        object.setCost(9000);
        //^^ above we have updated the variable cost the right way using encapsulation

        System.out.println(object.getCost());//we print out the new updated value of cost
    }
}
