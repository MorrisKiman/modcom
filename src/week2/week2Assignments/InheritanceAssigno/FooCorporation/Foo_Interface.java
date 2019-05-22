package week2.week2Assignments.InheritanceAssigno.FooCorporation;

import java.util.Scanner;

public class Foo_Interface {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        Employee emp = new Employee();
        String names;
        int hrs;
        double bsPay;

        System.out.println("Enter Name: ");
        names = scan.next();

        System.out.println("Enter Hours Worked: ");
        hrs = scan.nextInt();

        System.out.println("Enter Base Salary: ");
        bsPay = scan.nextDouble();

        emp.salary(hrs,bsPay, names);

       // System.out.println(Employee.salary());
    }
}
