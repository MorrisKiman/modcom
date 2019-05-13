
import java.lang.reflect.Array;
//10th may 2019
import java.util.Scanner;
public class assignment4 {
    public static void main(String [] args) {
        Scanner scan1 = new Scanner(System.in);
        /*this assignment has three parts.
            1. A java program that finds the frequency of a charater in a string
            2. Using a switch, make a simple java calulator.
            3. Program that calculates average using arrays
            4. Java program to swap two numbers
            5. Program to convert character to string and String to character
            I will Implement all this in a switch so the user can pick which assignment they want to view.
         */
        int looper = 0;
        while(looper<1) {
            System.out.println("Hey.. this is an assignment with 5 questions: there are 6 options to pick from..\n" +
                    "1. Question one.\n" +
                    "2. Question Two\n" +
                    "3. Question Three\n" +
                    "4. Question Four\n" +
                    "5. Question Five\n" +
                    "6. Exit the Assignment... \uD83D\uDE22\uD83D\uDE22\uD83D\uDE22");
            System.out.print("\n enter your option..");

            int pick = scan1.nextInt();

            switch (pick) {
                case 1:
                    //Question 1
                    System.out.println("Enter a sentence: ");
                    String sentence = scan1.nextLine();
                    char[] strArray = new char[sentence.length()];
                    strArray = sentence.toCharArray();

                    System.out.println("\n" + strArray + "\n");
                    System.out.print("Enter a single character whose frequency in the string you wnat to find: ");
                    char character = scan1.next().charAt(0);
                    int counter = 0;

                    for (int i = 0; i < sentence.length(); i++) {
                        if (strArray[i] == character) {
                            counter++;
                        } else {
                            System.out.print(strArray[i] + " x");
                        }
                    }//end for
                    System.out.println("\nThe frequency of " + character + " is " + counter);
                    break;

                case 2:
                    int bloop = 0;
                    while (bloop < 1) {

                        System.out.println("\nSelect the arithmetic operation you want to undertake" +
                                "\n1. Addtition" +
                                "\n2.Subtraction" +
                                "\n3.Multiplication" +
                                "\n4.Division" +
                                "\n5.Exit");
                        double num1, num2, answer;
                        int selection = scan1.nextInt();

                        switch (selection) {
                            case 1:
                                System.out.println("Welcome to addition operation. Enter two numbers you wish to add.");
                                System.out.print("Enter First Number: ");
                                num1 = scan1.nextDouble();
                                System.out.print("\nEnter Second Number: ");
                                num2 = scan1.nextDouble();
                                answer = num1 + num2;
                                System.out.println("Your answer is: " + answer);
                                break;

                            case 2:
                                System.out.println("Welcome to subtraction operation. Enter two numbers you wish to Subtract.");
                                System.out.print("Enter First Number: ");
                                num1 = scan1.nextDouble();
                                System.out.print("\nEnter Second Number: ");
                                num2 = scan1.nextDouble();
                                answer = num1 - num2;
                                System.out.println("Your answer is: " + answer);
                                break;

                            case 3:
                                System.out.println("Welcome to Multiplication operation. Enter two numbers you wish to Multiply.");
                                System.out.print("Enter First Number: ");
                                num1 = scan1.nextDouble();
                                System.out.print("\nEnter Second Number: ");
                                num2 = scan1.nextDouble();
                                answer = num1 * num2;
                                System.out.println("Your answer is: " + answer);
                                break;

                            case 4:
                                System.out.println("Welcome to Division operation. Enter two numbers you wish to Divide.");
                                System.out.print("Enter First Number: ");
                                num1 = scan1.nextDouble();
                                System.out.print("\nEnter Second Number: ");
                                num2 = scan1.nextDouble();
                                answer = num1 / num2;
                                double mod = num1 % num2;
                                System.out.println("Your answer is: " + answer + " reminder" + mod);
                                break;

                            case 5:
                                System.out.println("Are you sure you want to exit to main menu?\n" +
                                        "\t1. Yes\t\t2. No");
                                int choice = scan1.nextInt();
                                if (choice == 1) {

                                } else if (choice == 2) {
                                    bloop++;
                                } else {
                                    System.out.println("INVALID ENTRY!!!");
                                }

                                break;

                            default:
                                System.out.println("INVALID ENTRY!!!");
                                break;

                        }//end switch

                    }
                    break;

                case 3:
                    System.out.print("How many numbers do you want to get an average of?");
                    int count = scan1.nextInt();
                    double numeral[] = new double[count];

                    for (int i = 0; i < count; i++) {
                        System.out.print("\nEnter the " + i + " number: ");
                        numeral[i] = scan1.nextDouble();
                    }

                    double sum = 0;
                    for (int i = 0; i < count; i++) {
                        sum += numeral[i];
                    }

                    System.out.println("\nThe sum of all the numbers is: " + sum);
                    double ave = sum / count;
                    System.out.println("\nThe average of all the numbers is: " + ave);
                    break;

                case 4:
                    System.out.println("This will switch two numbers.\n");
                    System.out.print("Enter the first number to switch: ");
                    int num1 = scan1.nextInt();
                    System.out.print("\nEnter the second number to switch: ");
                    int num2 = scan1.nextInt();
                    System.out.println("You have entered");
                    int tempNum;

                /*tempNum = num1;
                num1 = num2;
                num2 = tempNum;*/
                    num1 = num1 + num2;
                    num2 = num1 - num2;
                    num1 = num1 - num2;

                    System.out.println(num1 + "" + num2);
                    break;

                case 5:
                    System.out.print("Enter a character: ");
                    char ch = scan1.next().charAt(0);
                    String myString = Character.toString(ch);
                    System.out.println("The character '" + ch + "' is now String '" + myString + "'.\n" +
                            "Now enter a string you want to convert to a set of characters");

                    myString = scan1.nextLine();
                    char[] charString = myString.toCharArray();
                    int counter1 = myString.length();
                    for (int i = 0; i < counter1; i++) {

                        System.out.print(charString[i] + "\t");
                    }//end for
                    scan1.next();
                    break;

                case 6:
                    looper++;
                    break;

                default:
                    System.out.print("Error in your input.. try again.");
                    break;
            }//end Switch
        }//end while loop
    }//end main
}//end Class
//Assignment complete