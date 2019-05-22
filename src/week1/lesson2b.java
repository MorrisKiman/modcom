package week1;

import java.util.Scanner;

//7th May 2019
public class lesson2b {

    public static void main(String [] args){
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter a Name: ");
        String name = scan1.next();
        System.out.println("Your name is " +name);

        if (name.length()<=5){
            System.out.println("The name too short!");
        }

        else if (!name.contains("@") || !name.contains("#")){
            System.out.println("Word must include either @ or #");
        }

        else if(name.endsWith("e")){
            System.out.println("It ends with an 'E'");
        }

        else if (name.equalsIgnoreCase("admin")){
            System.out.println("Welcome " +name);
        }

        else if (name.isEmpty()){
            System.out.println("The name is empty!");
        }

        else{
            System.out.println("its False");
        }
    }//end of main
}//end of class
