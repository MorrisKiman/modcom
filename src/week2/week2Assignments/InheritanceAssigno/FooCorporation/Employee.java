package week2.week2Assignments.InheritanceAssigno.FooCorporation;

public class Employee {

    String professional_level;
    double base_pay;
    int hours_worked;

    public void salary(int hours, double basePay, String name){
        double sal;
        if (hours<=40) {

            sal = basePay * hours;

            if (sal > basePay) {
                System.out.println("The Salary of " + name + " is KSH" + sal);
            } else {
                System.out.println("AN ERROR OCCURED");
            }
        }else if (hours > 40){
            int overtime = hours - 40;
            int newBasepay = 0;
            for (int i = 0; i < overtime; i++){
                newBasepay += basePay*1.5;
            }//end for
            if (newBasepay<80){
                System.out.println("Error in calculation");
            }else{
                sal = (basePay * hours) + newBasepay;
                if (sal > basePay) {
                    System.out.println("The Salary of " + name + " is KSH" + sal);
                }else {
                    System.out.println("AN ERROR OCCURED");
                }//end if
            }//end if
        }//end if
    }

}
