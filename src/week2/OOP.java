package week2;

// 16-May-2019
public class OOP {
    /* A class is a blueprint where Java code is written (Statements, objects (eg Scanner) and variables)
       an object has a state and a behavior. Eg: A pen==> the current state of the pen is what it looks like now, eg, color, age, width, height
       weight, mass, date of purchase, color of ink etc...
       Behaviors: what can the pen do? definitely, its main behavior is writting, pointing on a board,

       In programming, States are Properties or Fields (Coz if you were to fill it in a form, you'd ) or attributes
       In programming, Behaviors are methods.

       Creating Objects
       There are two ways of doing this
       ===> User Defined (you make it yourself and give it methods and properties)
       ===> Built in (Comes with its own fixed properties and methods)

       When Creating objects you can do it in two ways
       ==> Getters and setters
       ==> Constructores

        Student Object
            ==> States= String name, String dept, int age, int admNo, double fee,

     */
    String name;
    String dept;
    int age;
    int admNo;
    double fee;

    //Construct your objedt


    public OOP(String name, String dept, int age, int admNo, double fee) {
        this.name = name;
        this.dept = dept;
        this.age = age;
        this.admNo = admNo;
        this.fee = fee;

        //"this" represents the current class/object
    }//end constructor

    //the object should have behaviors... Lets give it some
    //behaviors==> checkDetails, payFees, checkBalance, updatea,

    public void checkDetails (int admno){
        if (admno != this.admNo){
            System.out.println("You provided the wrong admission Number");
        } else {
            System.out.println("Name: " +name);
            System.out.println("Name: " +age);
        }
    }//end checkDetails

    public void payFees (int admissionNo, double amount){
        if (admissionNo == this.admNo || amount <1){
            this.fee += amount;

            System.out.println("You have paid KSH" +this.fee+ " for " +name);

        } else {
            System.out.println("You have entered the wrong admission or an unacceptable ammount of money.\n");
        }//end if
    }//end payFees

    public double balance(){
        return this.fee;
    }//end balance

}//end class

//method overloading
//two methods with the same name but different parameters
