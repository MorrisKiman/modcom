package Week3.Assignmentsweek3.UI_Assignment1;

public class Employee_Object {
    private String names;
    private double hrsWorked =0;
    private double grossPay =0;
    private double federalTax= 0;
    private double stateTax =0;
    private double totalDeductions =0;
    private double netPay =0;

    public Employee_Object(String names, int hrsWorked, double grossPay, double federalTax, double stateTax, double totalDeductions, double netPay) {
        this.names = names;
        this.hrsWorked = hrsWorked;
        this.grossPay = grossPay;
        this.federalTax = federalTax;
        this.stateTax = stateTax;
        this.totalDeductions = totalDeductions;
        this.netPay = netPay;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public void setHrsWorked(int hrsWorked) {
        this.hrsWorked = hrsWorked;
    }

    public void setGrossPay(double grossPay) {
        this.grossPay = grossPay;
    }

    public void setFederalTax(double federalTax) {
        this.federalTax = federalTax;
    }

    public void setStateTax(double stateTax) {
        this.stateTax = stateTax;
    }

    public void setTotalDeductions(double totalDeductions) {
        this.totalDeductions = totalDeductions;
    }

    public void setNetPay(double netPay) {
        this.netPay = netPay;
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
