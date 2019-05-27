package Week3.Assignmentsweek3.UI_Assignment1;

public class Methds{
    //this class is purely dependent on the Employee_Object class for data

    public double grossCalc (int hrs){//for gross
        double grossSalary = Konstants.HOURLY_PAY_RATE * hrs;
        return grossSalary;
    }//end sal calc

    public double fedCalc(double gS){//for calculating the federal tax
        double feddTax = Konstants.FED_TAX_RATE * gS;
        return feddTax;
    }//end fed calc

    public double stateCalc(double gS){
        double stateTax = Konstants.STATE_TAX_RATE * gS;
        return stateTax;
    }//end state calc

    public double totalDeductions(double fTX, double sTX){
        double totalDed = fTX + sTX;
        return totalDed;
    }//end deductions calc

    public double netCalc(double gS, double totDed){
        double netSal = gS - totDed;
        return netSal;
    }//end net calc

}
