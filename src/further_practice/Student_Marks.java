package further_practice;

import java.util.Scanner;

public class Student_Marks {
    //This program takes the name of your student and allows input for 7 subjects.
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);

        //get Strudent Details
        System.out.println("Student Marks Management System\n\n" +
                "Please enter the names of your Student: ");
        String names = scan1.nextLine();
        String[] subjects = {"English", "Math", "Kiswahili", "Physics", "Geography", "Computer Studies", "CRE"};
        int [] marks = new int [subjects.length];
        int total = 0;
        System.out.println("You are about to enter marks for "+names+" for "+subjects.length+" subjects");

        for(int i = 0; i<subjects.length; i++){
            System.out.print("Enter marks for "+subjects[i]+": ");
            marks[i] = scan1.nextInt();
            total +=marks[i];
        }//end for

        double average = total/subjects.length;
        if (average>0 && average<40){
            System.out.println(names+" scored: " +total+ " with an average score of: "+average+" and got an E");
        } else if (average>=45 && average<40){
            System.out.println(names+" scored: " +total+ " with an average score of: "+average+" and got a D");
        } else if (average>=55 && average<46){
            System.out.println(names+" scored: " +total+ " with an average score of: "+average+" and got a C");
        } else if (average>=70 && average<56){
            System.out.println(names+" scored: " +total+ " with an average score of: "+average+" and got a B");
        } else if (average<=98 && average<71){
            System.out.println(names+" scored: " +total+ " with an average score of: "+average+" and got an A");
        } else {
            System.out.println("Something went wrong. Please try again and ensure the data is accurate");
        }
    }//end main
}
