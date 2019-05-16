package weekTwo.week2Assignments;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class StringReverser {
    //A program that accepts a string and outputs its reverse.
    public static void main(String [] args){
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the word/sentence that you wish to reverse");
        String myString = scan1.nextLine();
        System.out.println("The reverse String is:\n");
        int count = 0;//I will use this to index the strArray2 array
        char[] strArray1 = new char[myString.length()];//the string will be converted to a character array and stored here
        char[] strArray2 = new char[myString.length()];//the character array will be reversed and stored here then fixed back into the original string

        strArray1 = myString.toCharArray();
        for (int i = strArray1.length; i > 0; i--){
            strArray2[count] = strArray1[(i- 1)];//had to dao this because the length is 6 but indexing ends at 5.
            System.out.print(strArray2[count]);
            count++;
        }//end for
        System.out.println("\n\n");
    }//end main

}//end class
