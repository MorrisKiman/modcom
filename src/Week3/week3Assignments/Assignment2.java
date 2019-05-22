//overflowed to 22/may/2019 at 3am
package Week3.week3Assignments;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Assignment2 {
    //simple program that reads a file

    public static void main(String [] args){
        try {
            File file = new File("/home/kimani/Desktop/CommonKommands.txt");
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }//end while
        } catch (Exception e){
            System.out.println(e.getMessage());
        }//end try

    }//end main
}//end class
