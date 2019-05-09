import java.util.Scanner;

//create a scanner
public class lesson3_Task {

    public static void main(String [] args){
        //create scanner
        //using a loop scan 3 numbers
        //find their sum and average

        int x = 0;
        int sum = 0;

        Scanner scan1 = new Scanner(System.in);
        while(x<3){
            System.out.print("Enter a number ");
            int num = scan1.nextInt();
            sum+=num;//update sum
            System.out.println("At point " +x+ " is " +sum);
            x++;
        }

        System.out.println("\n Final Sum is: "+sum);

    }
    //in videos, example and
    //multiplication table printer for any given number. eg: 4
    //2 x 4 =, 3 x 4 =, etc up to 12
    //add a feature of multiplication table for x from 1 to n.
}
