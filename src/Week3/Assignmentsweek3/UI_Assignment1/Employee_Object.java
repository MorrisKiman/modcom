package Week3.Assignmentsweek3.UI_Assignment1;

public class Employee_Object {
    Methds mt = new Methds();
    private String names;
    private int hrsWorked =0;
    private double grossPay =0;
    private double federalTax= 0;
    private double stateTax =0;
    private double totalDeductions =0;
    private double netPay =0;

    /*public Employee_Object(String names, int hrsWorked, double grossPay, double federalTax, double stateTax, double totalDeductions, double netPay) {
        this.names = names;
        this.hrsWorked = hrsWorked;
        this.grossPay = grossPay;
        this.federalTax = federalTax;
        this.stateTax = stateTax;
        this.totalDeductions = totalDeductions;
        this.netPay = netPay;
    }

    public Employee_Object(String names, double hrsWorked) {
        this.names = names;
        this.hrsWorked = hrsWorked;
    }*/

    //empty constructor
    public Employee_Object() {

    }

    public void setNames(String names) {
        this.names = names;
    }

    public void setHrsWorked(int hrsWorked) {
        this.hrsWorked = hrsWorked;
    }

    public void setGrossPay(double grossPay) {
        mt.grossCalc(hrsWorked);
        this.grossPay = mt.grossCalc(hrsWorked);
    }

    public void setFederalTax(double federalTax) {
        federalTax = mt.fedCalc(grossPay);
        this.federalTax = federalTax;
    }

    public void setStateTax(double stateTax) {
        stateTax = mt.stateCalc(grossPay);
        this.stateTax = stateTax;
    }

    public void setTotalDeductions(double fedTax, double stateTx) {
        fedTax = this.federalTax;
        stateTx = this.stateTax;
        this.totalDeductions = mt.totalDeductions(fedTax, stateTx);
    }

    public void setNetPay(double gs, double tD) {
        gs = this.grossPay;
        tD = this.totalDeductions;
        this.netPay = mt.netCalc(gs,tD);
    }

    //getters
    public String getNames() {
        return names;
    }

    public double getHrsWorked() {
        return hrsWorked;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public double getFederalTax() {
        return federalTax;
    }

    public double getStateTax() {
        return stateTax;
    }

    public double getTotalDeductions() {
        return totalDeductions;
    }

    public double getNetPay() {
        return netPay;
    }
}//end class
