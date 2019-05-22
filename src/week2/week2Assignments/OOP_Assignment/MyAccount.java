package week2.week2Assignments.OOP_Assignment;

public class MyAccount {
    String name = "Morris Kimani", accountType = "Savings Account", contacts = "079655432";
    double accBalance;
    int accNumber = 127896;
    String me = "2019m";

    public void check_details(){
        System.out.println("Bank Account Details");
        System.out.println("||<=========================================>||");
        System.out.println("||=>Account Number:"+accNumber);
        System.out.println("||<==========================================>||");
        System.out.println("||=>Account Type: "+accountType);
        System.out.println("||=>Username: "+name+" ||=>Contacts: "+contacts);
        System.out.println("||=>Account Balance: KSH"+accBalance);
        System.out.println("||<==========================================>||");
    }

    public double depositCash(double newDeposit, int accountNo){ //curBal=>current balance
        double newBalance = this.accBalance + newDeposit;
        accBalance = newBalance;
        return newBalance;
    }

    public double withdrawCash(int withdrwal, int accountNumber){
        double withdrawn = this.accBalance - withdrwal;
        accBalance = withdrawn;
        return withdrawn;
    }

}
