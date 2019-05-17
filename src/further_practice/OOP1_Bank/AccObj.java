package further_practice.OOP1_Bank;

public class AccObj {
    int count = 1, arrindex=0;
    String [] name = new String[count];
    String [] accountType = new String[count];
    String [] contacts = new String[count];
    double [] accBalance = new double[count];
    int [] accNumber = new int [count];

    public void check_details(int accIndex){
        System.out.println("Bank Account Details");
        System.out.println("||<=========================================>||");
        System.out.println("||=>Account Number:"+accNumber[accIndex]);
        System.out.println("||<==========================================>||");
        System.out.println("||=>Account Type: "+accountType[accIndex]);
        System.out.println("||=>Username: "+name[accIndex]+" ||=>Contacts: "+contacts[accIndex]);
        System.out.println("||=>Account Balance: KSH"+accBalance[accIndex]);
        System.out.println("||<==========================================>||");
    }

    public double depositCash(double newDeposit, int accountNo, int accIndex){ //curBal=>current balance
        double newBalance = this.accBalance[accIndex] + newDeposit;
        accBalance[accIndex] = newBalance;
        return newBalance;
    }

    public double withdrawCash(int withdrwal, int accountNumber, int accIndex){
        double withdrawn = this.accBalance[accIndex] - withdrwal;
        accBalance[accIndex] = withdrawn;
        return withdrawn;
    }

    public String addAccount(String names, String kontacts, String accountTYpe, int deposited){
        name[arrindex] = names;
        accountType[arrindex] = accountTYpe;
        contacts[arrindex] = kontacts;
        accBalance[arrindex] = deposited;
        accNumber[arrindex] = count + (10467);
        String done = "You have successfully created an account with us!";
        this.count++;
        this.arrindex++;
        return done;
    }

    public void all_accounts(int adminPass){
        System.out.println("\n\nHello Morris.. we are happy you came.\nThe following is an accounts summary of all \n accounts in this bank\n\n");
        System.out.println("<=======================================================================================================>");
        System.out.println("||==>Account Number  ||==>Account Type              ||==>Account User             ||==>Balance(ksh)    ||");
        System.out.println("<=======================================================================================================>");
         for (int i = 0; i < this.count; i++){
             System.out.println("||==> "+accNumber[i]+"             ||==> "+accountType[i]+  "||==>"+name[i]     +        "||==>"+accBalance[i]+"     ||");
             System.out.println("<=======================================================================================================>");
         }

         System.out.println("\nThese are the details of all "+count+" accounts present in the bank");
    }
    int me = 2019;

    //while this comment stands, this code is not running as it should
    //look into object arrays
    //the way I created the object might be the const
}
