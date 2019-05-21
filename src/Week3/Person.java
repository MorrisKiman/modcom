//lesson 1
//21-may-2019
//Abstraction
package Week3;

public abstract class Person{
    //an abstract method is a method with no implementation within its class. It is used in another class.
    //abstract method cannot be instantiated
    // they can contain methods that are (not) implemented.
    //you focus on what the class is doing than how it does it.

    private String name;
    private String gender;

    public Person(String name, String gender) {//this class is abstract, you cannot use it ina naother class
        this.name = name;
        this.gender = gender;
    }

    //implemented method
    public void getDetails(){
        System.out.println("I am "+this.name);
        System.out.println("My genser is "+ this.gender);
    }//end getDetails

    //unimplemented
    public abstract void work();
}//end class
