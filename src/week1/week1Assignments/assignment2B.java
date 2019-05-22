package week1.week1Assignments;//7th may 2019
import java.util.Scanner;

public class assignment2B {

    public static void main(String [] args){
        Scanner scan1 = new Scanner(System.in);
        int x, y, z;
        System.out.println("Hello. Enter three numbers:");
        System.out.println("Number 1: ");
        x = scan1.nextInt();

        System.out.println("Number 2: ");
        y = scan1.nextInt();

        System.out.println("Number 3: ");
        z = scan1.nextInt();

        if(x>y && x<z){
            System.out.println("FIrst:" +z+ "\nsecond: " +x+ "\nThird: " +y);
        }else if (x<y && x>z){
            System.out.println("FIrst:" +y+ "\nsecond: " +x+ "\nThird: " +z);
        }else if (x>y && x>z){
            if (y>z){
                System.out.println("FIrst:" +x+ "\nsecond: " +y+ "\nThird: " +z);
            }else if (z>y){
                System.out.println("FIrst:" +x+ "\nsecond: " +z+ "\nThird: " +y);
            }else if (z==y){
                System.out.println("FIrst:" +x+ "\nBut " +z+ "and " +y+ "are equal");
            }
        }else if(x==y && x==z){
            System.out.println(x+ " and " +z+ "and " +y+ " are equal");
        }else if (x<y && x<z){
            if (y>z){
                System.out.println("FIrst:" +y+ "\nsecond: " +z+ "\nThird: " +x);
            }else if (z>y){
                System.out.println("FIrst:" +z+ "\nsecond: " +y+ "\nThird: " +x);
            }else if (z==y){
                System.out.println(z+ "and " +y+ "are equal" + "But" +x+ " is less than both" );
            }
        }else if (x==y && x!=z){
            if (z>x){
                System.out.println(z + " is greater and " +x+ " and " +y+ " are equal");
            }else{
                System.out.println(x+ " and " +y+ " are equal but greater than " +z);
            }
        }else if (x==z && x!=y){
            if (z>x){
                System.out.println(y + " is greater and " +x+ " and " +z+ " are equal");
            }else{
                System.out.println(x+ " and " +z+ " are equal but greater than " +y);
            }
        }else if (z==y){
            if (x>z){
                System.out.println(x + " is greater and " +z+ " and " +y+ " are equal");
            }else{
                System.out.println(z+ " and " +y+ " are equal but greater than " +z);
            }
        }else{
            System.out.println("Unhandled Event!! \uD83D\uDE11\uD83D\uDE11");
        }

    }
}
