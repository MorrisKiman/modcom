package weekOne;

import java.util.Scanner;

//8th may 2018
public class assignment3 {

    public static void main(String [] args){
        Scanner scan1 = new Scanner(System.in);
        int select;

        System.out.println("Welcome. Pick a selection" +
                "\n1. You enter a number where you can find all its multiples from 1 to 12" +
                "\n2. You enter a number and the n-th multiple you want to print ");
        select = scan1.nextInt();

        switch (select){
            case 1: // done using a for loop
                System.out.print("Enter a number");
                int num1 = scan1.nextInt();
                System.out.println("The Multiples of " +num1+ " from 1 -> 12 are:");

                for(int i=1; i<=12; i++){
                    int ans = i*num1;
                    System.out.println(i+" X "+ num1 + " = "+ans);
                }//end for loop
                System.out.println("Multiplication Table of "+num1+" is complete!");
                break;

            case 2://done using a while loop
                System.out.print("Enter a number");
                int num2 = scan1.nextInt();
                System.out.print("Enter the length of its multiplication table");
                int length = scan1.nextInt();
                //int counter = 1;

                for(int counter = 1; counter<=length; counter++){
                    int ans = num2 * counter;
                    System.out.println(counter+" X "+ num2 + " = "+ans);
                }

               /* while(counter<=length){
                    int ans = num2 * counter;
                    System.out.println(counter+" X "+ num2 + " = "+ans);
                    counter++;
                }//end while*/

        }//end switch


    }//end main
}//end class
