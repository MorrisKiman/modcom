//6th May
import java.util.Scanner;

public class assignment1 {

    public static void main(String [] args){
        /*
        * payroll calculator: promts the user to input: Basic salary, housing allowance, transport allowance,
        * NHIF, NSSF.
        * PAYEE is 20% of basic salary
        * Calculate:
        * 1. Gross Pay
        * 2. Net Pay
        * */

        //inputs
        String names;
        Double basicSalary, housingAllowance, transportAllowance, nhif, nssf, payee;
        float grossPay, netPay;
        Scanner scanner1 = new Scanner(System.in);

        //get data from user
        System.out.println("Calculate Gross and Net pay here: \n\b Enter Basic Salary: ");
        basicSalary= scanner1.nextDouble();

        System.out.println("Enter Housing Allowance: ");
        housingAllowance=scanner1.nextDouble();

        System.out.println("Enter Transport Allowance: ");
        transportAllowance=scanner1.nextDouble();

        System.out.println("Enter NHIF: ");
        nhif=scanner1.nextDouble();

        System.out.println("Enter NSSF: ");
        nssf=scanner1.nextDouble();

        //logic operations
        payee = (basicSalary + housingAllowance + transportAllowance + nhif + nssf)*0.2;
        System.out.println( "Your PAYEE is: KSH " + payee);//

        //real system objective
        grossPay = (float) (basicSalary + housingAllowance + transportAllowance + nhif + nssf);
        System.out.println("Gross Pay is KSH" + grossPay);

        netPay = (float) (grossPay - payee);
        System.out.println("Net Pay is KSH" + netPay);

    }
}
