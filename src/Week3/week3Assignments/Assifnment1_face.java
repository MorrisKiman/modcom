//21 May 2019

/*
        1. Demontrate how you catch an exception when  two numbers are divided (Use a method with parameters)
*/

package Week3.week3Assignments;

import java.util.Scanner;

public class Assifnment1_face extends Assifnment1_super{

    public static void main(String [] Args){
        Scanner scan = new Scanner(System.in);
        Assifnment1_super supClass = new Assifnment1_super();
        Assifnment1_methods meth = new Assifnment1_methods();
        int x, y;
        int mod;

        //Step 1: find the difference between two numbers
        // and throw an error where any of them is zero or something unusual
        try {
            System.out.println("Enter two numbers you want to divide");
            System.out.print("\nEnter the first number: ");
            x = scan.nextInt();
            System.out.print("\nEnter the first number: ");
            y = scan.nextInt();
            supClass.maths(x,y);
            mod = x%y;
            System.out.println("\nPerforming calculations......\n");


        //step 2 validate the operation and print out the answer
            meth.reply(mod);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(meth.resultingString);




    }//end main
    //done after 3 hours of toughness... wah..
}//
