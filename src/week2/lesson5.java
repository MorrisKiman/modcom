package week2;
//  14/May/2019
public class lesson5 {
    public static  void main(String [] args){
        /*Methods: a method is a collection of statements that are grouped together
            to perform an operation or task. Its sysntax is a as follows:

           |<---------method head--------->|<--------placeholder------>|
            modifiew return_type methodName (list parameters *optional*){
                        method body
                    }
        */

        //Methods can be defined in the same class or different classes.
        //1. From this class
        /*How do we call methods?---> It depends on:
            a). On the method's return type
            b). On the modifier (public, private etc)

         */

        //a. based on the return type ---> had to add 'static' after my modifier to make sure the or else I had to make an object of the method
        welcome();

        //ehre the return type is a datatype
        welcome2(); // was returning a double
        //since the method welcome2 is returning a double, you can set that return value to a variable in your main method
        double testRet = welcome2();
        System.out.println(testRet);

        //where return type is an array:
        double [] reType = welcome3();
        for(int i = 0; i<reType.length; i++) {
            System.out.println(reType[i]);
        }

        //where the return type is a char
        System.out.println(welcome4());
        System.out.println(welcome3());//--->this one will bring gibberish coz it is an array. you can't just print an array like that
        System.out.println(welcome2());
        //System.out.println(welcome());---->this will definitely be an error coz it doesnt have a return type

    }//end main

    //methjod 1
    //return types: void, data types(int, shiort, char, string....all 9)/arrays, object,
    //void means no return type
    //datatypes---> the method will return the specified datatype
    //objects-->
 //modifier-returntype-name-(parameters)
    //parameters are used to make the method more open
    public static void welcome(){
        System.out.println("Welcome to methods. \nThis is my first method");
    }

    public static double welcome2(){
        //the final result of this method should be a double data type or else you will keep getting a missing return type error.
        System.out.println("This is my second method");
        double reTurnType = 100/3;
        return reTurnType;
    }//end welcome1

    public static double[] welcome3(){
        System.out.println("This is my third method");
        double[] items = {108.6,33.890,78.889,45.8,45,56};
        return items;//---->ensure your return type is matching what you have in your method header
    }

    public static char welcome4(){
        return 'A';
    }

    public static int Calc(){
        int x = 45, y = 78;
        int ans = x + y;
        return ans;
    }

    //class quiz: write a method to find simple interest
    public static double sI(int p, double r, double t){
        //int p;
        //double r, t

        double ans = p*r*t;
//        System.out.println("Interest is: KSH"+ans);
        return ans;
    }//end sI

    //create the payroll calc method. Parameters are basic salary, allowances, nssf, payee 5%basic,
    //return gross and net pay
    public static double[] payeeCalc(int basicSal, int hseAllowance, int transAllowance, int nssf, int nhif){
        double payee = basicSal * 0.05;
        double gross = basicSal + hseAllowance + transAllowance + nssf + nhif;
        double net = gross - payee;
        //String [] msg = {"Gross Pay", "Net Pay"};
        double[] jibu = {gross, net};
        return jibu;
    }


    //the above methods must be called in the main method for them to be in a usable state.
}//end main
