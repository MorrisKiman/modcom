//8th may 2019
//loops
public class lesson3b {

    public static void main(String [] args){
        //loops - repeat tasks
        //while, for, do...while
        /*while (condition is true){
                <code to execute>}*/
        // steps for creating loops++> 1. Initialize, 2. Condition, 3. Increment/Decrement

        int counter = 0; //initialization is done only using an integer coz its a counter

        while(counter<=100){
            System.out.println("Hello " + counter);
            counter ++;//updates the counter by 1
            //loop stops when the condition becomes false
            //assignment: change the loop to print 1930 - 2020
            //change the above assigno to print -3 to +3
            //change the above to print 10 to 1
        }//end while

        System.out.println("\nWhile loop 2");
        int counter1 = 1930;
        while (counter1 <= 2030){
            System.out.println(counter1);
            counter1++;
        }//end while

        System.out.println("\nWhile loop 3");
        int counter2 = 10;
        while (counter2>=1){
            System.out.println(counter2);
            counter2--;
        }//end while

        System.out.println("\nWhile loop 4");
        int counter3 = -3;
        while (counter3 <= 3){
            System.out.println(counter3);
            counter3++;
        }//end while

    }//end main
}//end class
