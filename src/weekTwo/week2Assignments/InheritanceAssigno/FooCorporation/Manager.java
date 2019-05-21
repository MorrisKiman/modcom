package weekTwo.week2Assignments.InheritanceAssigno.FooCorporation;

public class Manager extends Employee {
    String SecretaryName = "Olivia";
    String parkingSlot = "78";

    @Override
    public void salary(int hours, double basePay, String name) {
        super.salary(hours, basePay, name);
    }
}//end main
