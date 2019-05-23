package Week3.Assignmentsweek3.UI_Assignment1;

public class Methds{
    //this class is purely dependent on the Employee_Object class for data
    int hrsWked;
    Double grssPay, fedTX, stateTX, totDeds, netpay;
    Employee_Object emOb = new Employee_Object("", hrsWked, grssPay, fedTX, stateTX, totDeds, netpay);
    Pay_roll pay = new Pay_roll();
    public double salCalc (int y){//for gross
        double grossSalary = Konstants.HOURLY_PAY_RATE * pay.getHrsWorked();
        emOb.setGrossPay(grossSalary);
        return grossSalary;
    }//end sal calc

    public double fedCalc(){//for calculating the federal tax
        double feddTax = Konstants.FED_TAX_RATE * emOb.getGrossPay();
        emOb.setFederalTax(feddTax);
        return feddTax;
    }//end fed calc

    public double stateCalc(){
        double stateTax = Konstants.STATE_TAX_RATE * emOb.getGrossPay();
        emOb.setStateTax(stateTax);
        return stateTax;
    }//end state calc

    public double totalDeductions(){
        double totalDed = emOb.getFederalTax() + emOb.getStateTax();
        emOb.setTotalDeductions(totalDed);
        return totalDed;
    }//end deductions calc

    public double netCalc(){
        double netSal = emOb.getGrossPay() - emOb.getTotalDeductions();
        emOb.setNetPay(netSal);
        return netSal;
    }//end net calc

    public void allmths(){
        fedCalc();
        stateCalc();
        totalDeductions();
        netCalc();
    }//end of method




}
