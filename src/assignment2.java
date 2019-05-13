//6th may 2019
import java.util.Scanner;

public class assignment2 {

    public static void main(String [] args){
        Scanner scan1 = new Scanner(System.in);
        int j = 0;

        System.out.println("Welcome to Virtual Bank\n make a selection from the following menu items" +
                "\n1. Products" +
                "\n2.Accounts" +
                "\n3.About" +
                "\n4.Help" +
                "\n5.Exit");
        System.out.println("Enter an option: ");
        int menuSelect = scan1.nextInt();

        while( j == 0){
        switch(menuSelect){
            case 1:
                System.out.flush();
                System.out.println("1. Products");
                //products
                break;

            case 2:
                System.out.flush();
                System.out.println("2. Accounts");
                //Accounts
                break;

            case 3:
                System.out.flush();
                System.out.println("3. About");
                //About
                break;

            case 4:
                System.out.flush();
                System.out.println("4. Help");
                //Help
                break;

            case 5:
                System.out.println("Are you sure You want to exit?" +
                        "\n1. Yes \t\t 2. No");
                int exitornot = scan1.nextInt();

                if(exitornot ==1){
                    j = exitornot;}
                  else if (exitornot ==2 ){
                        j=0;
                    }
                break;


            default:
                System.out.flush();
                System.out.println("Invalid Option");

        }//end switch
        }//end while
        }//end main


}//class end
