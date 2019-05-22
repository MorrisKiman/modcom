package week2;

public class Test_Inheritance {

    public static void main(String [] args){
        Fish_Inheritance fish = new Fish_Inheritance();
        Shark_inheritance shark = new Shark_inheritance();
        Whale_inheritance whale = new Whale_inheritance();

        fish.swim();
        shark.swim();
        whale.swim();
        whale.eats();;//accessed only by whale and shark. Methods can only be accessed by their source parents and children
    }//end main
}//end class
