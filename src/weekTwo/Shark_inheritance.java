//17b - may - 2019
//inheritance
package weekTwo;

public class Shark_inheritance extends Fish_Inheritance{
    //this is an "Is a " relationship.
    //Shar is a Fish...
    //Shark is a subclass of Fish. Fish is a superclass.

    public void eats(){
        System.out.println("Its Eating");
    }

    public void swim(){
        System.out.println("Likes swimming deed under water");
    }
}
