// 21 may 2019
package Week3;

public class ExceptionHandling {

    public static void main(String[] args){
        check();

    }//end main

    public static void check() {
        int[] arry = {12, 34, 44};
        try {
            System.out.println(arry[5]);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            //after try catch exits, it executes. It is optional to have it.

        }
    }//end check
}//end class


/*
1. Demontrate how you catch an exception when  two numbers are divided (Use a method with parameters)
2. create a method that reads a txt: it should return the content of the txt

try implementing abstraction, inheritance and interfaces


 */