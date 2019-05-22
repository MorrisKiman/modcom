package week2;

public class Overloading {
    public static void main(String[]args) {

        Overloading ob = new Overloading();
        System.out.println();


    }

    public void sum(){
        System.out.println("HELLOO");
    }

    public int sum(int x, int y){
        return x*y;
    }

    public void sum(int [] x){
//sum of array
    }
//if your application is large, you can overload the methods. Have one method name but with different parameters as we have done with sum.


}
