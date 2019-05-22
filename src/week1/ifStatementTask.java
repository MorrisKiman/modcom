package week1;//7th May 2019
import java.util.Scanner;

public class ifStatementTask {
    public static void main(String [] args){
        int year, mod;
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("We are testing for a leap year.\nEnter a year to check: ");
        year = scanner1.nextInt();

        if ((year%4)==0){//if 1
            if((year%100 ==0)){ //if 2
                if((year%400 == 0)){//if 3
                    System.out.println(year + " is a leap year");
                }else {
                    System.out.println(year + " is not a leap year \n Failed in if 3");
                }
            }else{
                System.out.println(year + " is a leap year");
            }
        }else{
            System.out.println(year + " is not a leap year \n Failed in if 1");
        }

    }//end of main
}//end of class
