package week1;//6th may 2019
import java.util.Scanner;

public class lesson2 {

    public static void main (String [] args){
        //simple interest


        Scanner scanner1 = new Scanner(System.in);

        double answer;
        //P, r, A, t
        System.out.println("What is your amount: ");
        double principle = scanner1.nextDouble(); // static value coz its hard coded

        System.out.println("What is your rate: ");
        double rate = scanner1.nextDouble();

        System.out.println("What duration will it be repaid in: ");
        double time = scanner1.nextDouble();

        //operators14
        /*
        +, -, /, *, ++,--,%
         */

        answer = principle * (rate/100) * time;
        System.out.println(answer);

    }
}
