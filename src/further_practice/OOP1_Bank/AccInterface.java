package further_practice.OOP1_Bank;

import java.util.Scanner;

public class AccInterface {}
    
   /* public static void main(String [] args){
        //create a counter for storing accounts
        int Acccoun = 1;
        Account[] accounts = new Account[Acccoun];
        //int [] r = new int[accountInd];

        Scanner scan = new Scanner(System.in);
        int x =0, acNo, cash, indx;

        while (x==0) {s
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
                    System.out.print("\n\nPlease enter the Account Number you wish to view:==> ");
                    acNo = scan.nextInt();
                    for(indx = 0; indx <= accounts; indx++) {
                        if (acNo != accounts.accNumber[indx] && indx!=(accounts.count+1)){

                        } else if (acNo == accounts.accNumber[indx]){
                            accounts.check_details(indx);
                            scan.nextLine();
                        } else{
                            System.out.println("The Account you wanted could not be found");
                        }//end if
                    }
                    break;

                case 2:
                    System.out.println("You are about to make a deposit.\n");
                    System.out.print("Enter the account number: ");
                    acNo = scan.nextInt();


                    for(indx = 0; indx <= accounts.count; indx++) {
                        if (acNo != accounts.accNumber[indx] && indx!=(accounts.count+1)){

                        }else if (acNo == accounts.accNumber[indx]) {//validate the account number
                            System.out.print("\nEnter your deposit: ");
                            cash = scan.nextInt();
                            if (cash > AccConstants.MAX_DEPOSIT) {//validate the ammount
                                System.out.println("The Account you wish to deposit is more than our single acceptable amount.");
                            } else if (cash < AccConstants.MIN_DEPOSIT) {
                                System.out.println("The Account you wish to deposit is less than our single acceptable amount.");
                            } else {
                                accounts.depositCash(cash, acNo, indx);
                                System.out.println("You have deposited: KSH" + cash + " into Account: " + accounts.accountType);
                                System.out.println("Account Number: " + accounts.accNumber + "New Balance: KSH" + accounts.accBalance);
                            }//end if
                        }else {
                            System.out.println("The Account Number you have given does not exsist!");
                        }//end if
                    }

                    break;

                case 3:
                    System.out.println("\nWithdrawals.");
                    System.out.println("<===========================>\n");
                    System.out.print("Enter The Account number you wish to withdraw from:");
                    acNo = scan.nextInt();

                    for(indx = 0; indx <= accounts.count; indx++) {
                        if (acNo != accounts.accNumber[indx] && indx!=(accounts.count+1)){

                        }else if (acNo == accounts.accNumber[indx]) {//ID validation
                            System.out.print("\nEnter The ammount you wish to withdraw: ");
                            cash = scan.nextInt();
                            if ((accounts.accBalance[indx] - cash) < AccConstants.MIN_WITHDRAWAL) {//ensure the withdrawal doesnt violate the minimum amount
                                System.out.println("You have insufficient funds to make this withdrawal");
                            } else if (cash > AccConstants.MAX_WITHDRAWAL) {//Ensure the withdrawal doesn't violate the upper limit
                                System.out.println("This amount exceeds the maximum amount you can withdraw at a go.");
                            } else {
                                accounts.withdrawCash(cash, acNo, indx);
                                System.out.println("You have withdrawn: KSH" + cash + " form Account Number: " + accounts.accNumber);
                                System.out.println("New Balance is: " + accounts.accBalance);
                            }//end if

                        }else {
                            System.out.println("The Account Number you have given does not exsist!");
                        }//end if
                    }//end for



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

                case 5:
                    System.out.print("If you dont know what lies ahead, turn back.\n");
                    System.out.print("==> ");
                    int still = scan.nextInt();

                    if (still == accounts.me){
                        int loo = 0;
                        while (loo == 0) {

                            System.out.print("Hello admin!\nHere, you can:\n" +
                                    "1. View All accounts\n" +
                                    "2. Add a new account\n" +
                                    "3. Exit\n");
                            System.out.print("+Selection ====>  ");
                            int swi = scan.nextInt();
                            switch (swi){
                                case 1:
                                    accounts.all_accounts(still);
                                    break;

                                case 2:
                                    System.out.print("You can add a new account by entering the following details:\n");
                                    System.out.print("Names of the applicant: ");
                                    String amjina = scan.next();

                                    System.out.print("Contacts of the applicant: ");
                                    String noSimu = scan.next();

                                    System.out.print("Account type applied for: ");
                                    String acctype = scan.next();

                                    System.out.print("Deposit for the new account. Not less than Ksh100: ");
                                    cash = scan.nextInt();

                                    if (cash < AccConstants.MIN_DEPOSIT) {
                                        System.out.println("Amount deposited is too little. Operation Cancelled");
                                    }else if (cash > AccConstants.MAX_DEPOSIT){
                                        System.out.println("Amount deposited is too much. Operation Cancelled");
                                    } else if (cash <= AccConstants.MAX_DEPOSIT && cash >= AccConstants.MIN_DEPOSIT){
                                        accounts.addAccount(amjina, noSimu, acctype, cash);
                                        System.out.print("\n Operation Success for: ");
                                        int indexed = (accounts.arrindex - 1);
                                        accounts.check_details(indexed);
                                        System.out.print("\n\n");
                                    } else {
                                        System.out.print("\nUnknown Error");
                                    }//end if
                                    break;

                                case 3:
                                    loo = 1;
                                    break;

                                    default:
                                        loo = 1;
                                        System.out.println("ERROR");

                            }//ens switch

                            }//end while

                        }else{

                    }//end if


                default:
                    System.out.println("Invalid Selection. Please try again");
            }//end Switch
        }//end while loop

    }//end main
}//end class

    */
