package weekOne;//9th May 2019
import java.util.*;
public class lesson4 {

    public static void main(String [] args){
        //Nested loops

        for (int x=0; x <= 10; x++){
            System.out.println("Outer Loop" + x);
            for (int i=0; i<=10; i++){
                System.out.print("\tInner Loop" + i);
            }
            System.out.println("");
        }//end for loop


        //With the below loop, you can printout triangles and rectanges..
        //Challenge, print a diamon


        for (int x=0; x <= 10; x++){
            System.out.println("*");
            for (int i=0; i<=x; i++){
                System.out.print("+");
            }
            //System.out.println("");
        }//end for loop
        System.out.println("");

        //😜😜❤ Checkout 12x12 multiplication table online

        for (int a=1; a <= 10; a++){
            for (int b=1; b<=10; b++) {
                System.out.printf((a * b) + "\t");
            }
            System.out.println();
            //Done 💪
        }//end for loop

    }//end main
}//end class
