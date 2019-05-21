//21 may 2019
package Week3;

public class Employee extends Person implements Manager {

    //to get rid of the error coming from the employee class, create its empty constructor
    public Employee(String name, String gender){//the parameters are attributes from the "Person" superclass
        super(name, gender);
    }

    public  void writeCheck(){
        //do Stuff
        System.out.println("This is from  the interface");
        //if you implement just one method from the interface in this class, it will give you an error
    }
    @Override
    public void work() {
        System.out.println("This method has been overriden");
    }

    public static void main (String [] args){
        Person person = new Employee("Joe", "Male");
        person.work();//not implemented
        person.getDetails();//implemented
        //echeiving multiple inheritace using an interface. You cannot
        ((Employee) person).writeCheck();
    }

}