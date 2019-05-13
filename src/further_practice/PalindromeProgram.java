package further_practice;

import java.util.Scanner;

public class PalindromeProgram {
    /*
      This is a program that checks if a number is the same when reversed
    */

    public static void main(String[] args){
        Scanner scan1 = new Scanner(System.in);
        int r, sum = 0, temp;
        int palindrome = 0;
        while (palindrome < 10) {
            System.out.print("Enter the number you wish to check if it is a palindrome.\n NB: It must be a two digit Number:--> ");
            palindrome = scan1.nextInt();
        }//end while
        temp = palindrome;

        while (palindrome>0){
            r = palindrome % 10; //getting the reminder
            sum = (sum*10)+r;
            palindrome = palindrome/10;
        }//end while

        if (temp == sum){
            System.out.println(temp + " is a palindrome number");
        }else{
            System.out.println(temp + " is not a palindrome number");
        }//end if



    }//end main

}//end class
