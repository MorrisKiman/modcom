//8th may 2019

//for loops: faster and flexible
public class lesson3c {

    public static void main(String [] args){

        System.out.println("For loop 1");
        for (int counter = 1; counter<=10; counter ++){
            System.out.println("Hello " + counter);
            //it is easier to nest a for loop than a while loop when you are creating complex things
        }

        System.out.println("\nFor loop 2");
        for (int counter = 1930; counter<=2020; counter++){
            System.out.println("Hello " + counter);
        }

        System.out.println("\nFor loop 3");
        for(int counter=-3; counter <=3; counter++){
            System.out.println("Hello " + counter);
        }

        System.out.println("\nFor loop 4");
        for(int counter=10; counter <=1; counter--){
            System.out.println("Hello " + counter);
        }

        //loop a scanner to loop a scan caputre of numbers and find their sum

    }//end main
}//end class
//assignment: change the loop to print 1930 - 2020
//change the above assigno to print -3 to +3