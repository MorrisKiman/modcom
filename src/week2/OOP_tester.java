package week2;

import week2.week2Assignments.OOP_constants;

import java.util.ArrayList;
import java.util.Scanner;

public class OOP_tester {
    public static void main(String [] args){
        Scanner x = new Scanner(System.in);
        //create the object oop
        OOP object = new OOP("Morris Kimani", "IT", 34, 2345, 23000);//If you point the class you get an error. Point the constructor
        //above will provide the oject with states through the constructor
        object.checkDetails(2345);

        //use this for the bank oop
        ArrayList<OOP> alist = new ArrayList<>();
        alist.add(object);

        for (int i = 0; i<=2; i++) {
            if ( object.balance() >= OOP_constants.SCHOOL_FEES) {
               System.out.println("You cannot deposit");
            }else{
                System.out.println("Enter your admin no: ");
                int y = x.nextInt();
                System.out.println("How much do you want to pay: ");
                int amm = x.nextInt();
                //pass them to payFeess method for updating
                object.payFees(y, amm);
            }//end if
        }//end for

        /* another way of doing it by making the for loop infinite until the if statement is true where it will break
        for (int i = 0; true; i++) {
            if ( object.balance() >= OOP_constants.SCHOOL_FEES) {
               System.out.println("You cannot deposit");
               break;
            }else{
                System.out.println("Enter your admin no: ");
                int y = x.nextInt();
                System.out.println("How much do you want to pay: ");
                int amm = x.nextInt();
                //pass them to payFeess method for updating
                object.payFees(y, amm);
            }//end if
        }//end for
         */

        //now we need to know the balance that I have from the constant in my OOP_constants java file called SCHOOL_FEES.
    }//end main
}//end class

//;try to recreate this scenario. A method for paying fees, showing how much has been paid and the balance left and use an abject to do all this.

// Create an account class (object) with an account test
//the account should have states (name, blalance, accNo, phone)
// behaviors (checkdetails, deposit==>{cant deposit <100 || >70,000(these two are constants that are set)}),
//      ||=> withdrawal, cant withdraw more than (balance - 30) or ksh0.
//mix void and returns