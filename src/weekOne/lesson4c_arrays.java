package weekOne;

//9th May 2019
public class lesson4c_arrays {
    public static void main(String [] args){
        //An array: store multiple values in a single variable.

        //method 1
        int[] x = {34,45,56,34,67,88,98,34,23,23,34,29};
        double[] y={2,65,4,33,78.55,12.67,5,6.7};
        char[] grades={'A','B','C','D','E',};
        boolean[] payment={true,false,false,true};
        String[] counties={"Embu", "Kisumu", "Nairobi", "Machakos", "Nakuru"};

        //method 2
        int [] age = new int[6];
        age[0] = 78;
        age[1] = 45;
        age[2] = 79;
        age[3] = 56;
        age[4] = 12;
        age[5] = 56;

        //accessing array items
        System.out.println("The child's age was" +age[4]);
        System.out.println("The lucky Number was " +x[6]);
        System.out.println("I live in " +counties[2]+ " County");
        System.out.println("I got grade: " +grades[2]+ " in School");

        //loops in arrays: helps you to print the contents of your array
        for (int i=0; i<x.length; i++){
            System.out.println("Value of X is:" + x[i]);

            //I need for loops incase I reach a number, eg, if x @i = 66, I can print that that is the lucky number or perform some other function
            if (x[i]==67){
                System.out.println(" This is the Lucky number!! \uD83D\uDC8B\uD83D\uDC8B");
            }
        }//end for... loop

        for (int i=0; i<payment.length; i++){
            System.out.println("Payment at "+i+ "is: " + payment[i]);
        }//end for... loop
        //above, we loop through our arrays: we may want to perform a specific action like the printing of something when x[i} was = 67.
        //this is why for loop is better than internal functions of dealing with arrays
        //Yaani, the buitl in functions for dealing with arrays are not flexible



    }//end main
}//end class
