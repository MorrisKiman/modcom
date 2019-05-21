package weekTwo.week2Assignments.OOP_Assignment;


import java.util.Scanner;

public class MyAccountTester {
    public static void main(String [] args){
        MyAccount myAccountObj = new MyAccount();
        Scanner scan = new Scanner(System.in);
        int x =0, acNo, cash;
        //double cashm;
        while (x==0) {
            System.out.println("My Bank inc..");
            System.out.println("\nHello. Please select one of the options we are providing for you.\n" +
                    "1. View your account details\n" +
                    "2. Deposit Some cash.\n" +
                    "3. Withdraw some cash.\n" +
                    "4. Exit");
            System.out.print("Selection: ");
            int pick = scan.nextInt();
            switch (pick) {
                case 1:
                    myAccountObj.check_details();
                    scan.nextLine();
                    break;

                case 2:
                    System.out.println("You are about to make a deposit.\n");
                    System.out.print("Enter the account number: ");
                    acNo = scan.nextInt();

                    if (acNo == myAccountObj.accNumber) {//validate the account number
                        System.out.print("\nEnter your deposit: ");
                        cash = scan.nextInt();
                        if(cash > MyAccount_Constants.MAX_DEPOSIT) {//validate the ammount
                            System.out.println("The Account you wish to deposit is more than our single acceptable amount.");
                        }else if(cash < MyAccount_Constants.MIN_DEPOSIT){
                            System.out.println("The Account you wish to deposit is less than our single acceptable amount.");
                        }else{
                            myAccountObj.depositCash(cash, acNo);
                            System.out.println("You have deposited: KSH" +cash+" into Account: " +myAccountObj.accountType);
                            System.out.println("Account Number: "+myAccountObj.accNumber+ "New Balance: KSH"+ myAccountObj.accBalance);
                        }//end if
                    }else {
                        System.out.println("The Account Number you have given does not exsist!");
                    }//end if

                    break;
                    
                case 3:
                    System.out.println("\nWithdrawals.");
                    System.out.println("<===========================>\n");
                    System.out.print("Enter The Account number you wish to withdraw from:");
                    acNo = scan.nextInt();
                    if(acNo == myAccountObj.accNumber) {//ID validation
                        System.out.print("\nEnter The ammount you wish to withdraw: ");
                        cash = scan.nextInt();
                        if((myAccountObj.accBalance - cash)< MyAccount_Constants.MIN_WITHDRAWAL){//ensure the withdrawal doesnt violate the minimum amount
                            System.out.println("You have insufficient funds to make this withdrawal");
                        } else if (cash > MyAccount_Constants.MAX_WITHDRAWAL){//Ensure the withdrawal doesn't violate the upper limit
                            System.out.println("This amount exceeds the maximum amount you can withdraw at a go.");
                        } else{
                            myAccountObj.withdrawCash(cash, acNo);
                            System.out.println("You have withdrawn: KSH" +cash+ " form Account Number: "+myAccountObj.accNumber);
                            System.out.println("New Balance is: "+myAccountObj.accBalance);
                        }

                    }

                    break;

                case 4://exit the while loop
                    System.out.println("Are you sure you want to exit?\n" +
                            "\t1. Yes\t2.No");
                    int exit = scan.nextInt();
                    if (exit == 1) {
                        x = 1;
                    } else if (exit == 2){
                        x = 0;
                    }else{
                        x = 0;
                    }//end if
                    break;


                default:
                    System.out.println("Invalid Selection. Please try again");
            }//end Switch
        }//end while loop


    }//end main
}//
