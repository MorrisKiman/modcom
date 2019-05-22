package week1;//6th may 2019
import java.util.Scanner;

//7th May 2019
public class lesson2a {// Arithmetic operators
    public static void main(String [] args){
        /*relational/conditional operators

          > : greater than
          < : less than
         >= : greater than or equal to
         <= : less than or equal to
         != : not equal to
         == : equivalent to

         Logical operators
         && : AND
         || : OR
         ! : NOT
         */

        int x = 67;
        int y = 56;

        //Control Structurea: if, if else, elseif, switch, for loop, while loop, dow while,

        Scanner scanner1 = new Scanner(System.in);//Scans anything entered in the console
        System.out.println("Enter your  Marks: ");
        int marks = scanner1.nextInt();
        System.out.println("\n\bYour  Marks are: " + marks);
        //boolean x = marks<50;
        if (marks<=50){
          //for true, execute this
            if (marks <0){
                System.out.println("Its negative");
            }else{
                System.out.println("You FAILED!");
            }//nested if statements inside an if statement.
        }
         //when marks are >than 50, we need to add an else satement

        //elseif is for multiple conditions
        else if (marks>50 && marks <=75){
            System.out.println("You got a Credit ");
        }
        else if (marks >75 && marks<100) {
            System.out.println("You got a distingtion");
        }

        else{
            //for false.
            System.out.println(" Invalid Entry");
        }
        //Above if...else is intented for 1 condition (marks <=50))
        //else if is for multiple conditions.






    }//end of main
}// end of class
