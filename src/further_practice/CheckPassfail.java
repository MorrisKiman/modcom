package further_practice;

import java.util.Scanner;

public class CheckPassfail {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        //this prigram accepts the score that you giv it and outputs it as pass or fail.
        //you ccan modify it to suit your needs by dding other cases it can work with


            System.out.print("Enter an average score ====> ");
            int score = scan.nextInt();
            if (score<0 || score>100){
                System.out.println("The score you have entered is invalid");
            }//end if


        if (score >0 && score <=40){
            System.out.println("FAIL");
        }else if ( score <=59 && score>=49){
            System.out.println("MODERATE");
        }else if ( score<= 79 && score >= 60){
            System.out.println("GOOD");
        }else if (score <= 100 && score >= 80){
            System.out.println("EXCELLENT!");
        }else{
            System.out.println("UNKNOWN ERROR");
        }//end if

        for (int i = 0; i <= 100; i++){
            System.out.print("==");
        }

    }//end main
}
