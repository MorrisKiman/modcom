package week2;

import java.util.Scanner;

// 14-May-2019
public class External_Method_Call_Tester {

    public static void main (String [] args){
        Scanner scan1 = new Scanner(System.in);
        int answer = lesson5.Calc();
        System.out.println("You answer is "+answer);

        //lesson5.sI();// the answer is being written in lesson5 and not here bacause it is void. once I change it to double--->
        //I now pass on the result of lesson5.sI to the variable below
        double interest = lesson5.sI(20000, 1.4, 2);
        System.out.println("The Simple Interest is KSH"+interest);
        //now lets change the values of p,r,t. THis can be done by bringing in parameters/placeholders which makes the function more open
        //now you can add a scanner to change the variables for the method to work on.


        //Class Exercise 2: payee caluclator using an external method
        int basic, hseAllow, transAllow, nssF, nhiF;
        System.out.println("\n\nPayee External Method Test\n\n Enter Basic Salary: ");
        basic = scan1.nextInt();
        System.out.print("\nEnter House Allowance: ");
        hseAllow = scan1.nextInt();
        System.out.print("\nEnter Transport Allowance: ");
        transAllow = scan1.nextInt();
        System.out.print("\nEnter NHIF: ");
        nhiF = scan1.nextInt();
        System.out.print("\nEnter NSFF: ");
        nssF = scan1.nextInt();

        double[] rezult = lesson5.payeeCalc(basic, hseAllow, transAllow, nssF, nhiF);
        System.out.println("Your Gross Pay is: KSH" +rezult[0]+" and your net pay is: KSH"+rezult[1]);

    }//end main

}//end class

//home assignment
//1. Java method that accepts a string and returns its reverse

