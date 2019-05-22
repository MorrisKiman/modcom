package week2.week2Assignments.InheritanceAssigno;

import java.util.Scanner;

public class Appointment_Interface {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        Appointment [] appointment = new Appointment[2];

        try {

            System.out.println("Appointment management System");
            for (int i = 0; i < appointment.length; i++) {
                System.out.print("\nENter the Name of a Patient: ");
                appointment[i].setNames(scan.next());

                System.out.print("\nENter the Date of appointment: ");
                appointment[i].setDay(scan.next());

                System.out.print("\nENter the Name of a Patient: ");
                appointment[i].setTime(scan.nextDouble());
            }//end for

            System.out.println("Appointment reports:");

            for (int i = 0; i < appointment.length; i++) {
                System.out.print("\nName of a Patient: " + appointment[i].getNames());

                System.out.print("\nDate of appointment: " + appointment[i].getDay());

                System.out.print("\nTime of appointment: " + appointment[i].getTime());
            }//end for
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }//end main
}//end class
