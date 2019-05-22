package week1;

//6th may 2019
public class lesson1 {

    //Java is object oriented: we use classes and methods.

    public static void main (String [] args){

        System.out.println("Hello World");
        System.out.println(45);
        System.out.println("Looking Glass is an awesome movie!!");

        //Java datatypes - type of data I want to store
        //variables will store data
        //java has 8 primitive datatypes

        /*
        * int- stores from 2billion to -2billion, no decimals.
        * short - stores from -32k to +32k, no decimals.
        * long - stores more than an int., no decimals.
        * float - stores large arrays/numbers with many decimal places.
        * Double- stores numbers few decimal places.
        * char - stores a single character like 'C'.
        * boolena - stores two states, eg: true or false
        * byte - stores fata in byte format, i.e: an image
        * */

        int myAge = 78; //declaration state: age is an identifier ie, age = identifier, int = datatype.
        myAge = 30; //initialization
        System.out.println(myAge);

        short myCash = 32700;
        System.out.println(myCash);

        long budget = 9000000000000000000l;
        System.out.println(budget);

        float bill = 24567.549999f;
        System.out.println(bill);

        double price = 23678777777777777777777777777777777777777777777777777777777777777.0;
        System.out.println(price);

        char grade = 'A';
        System.out.println(grade);

        boolean status = true;
        System.out.println(status);

        String name = "GotobedDaisy";
        System.out.println(name);

        byte[] newName = name.getBytes();
        System.out.println(newName);

        //convert newName back to string
        String backName = new String(newName);
        System.out.println(backName);



    }




}

