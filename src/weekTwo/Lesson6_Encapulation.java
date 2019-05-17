//17- May - 2019
package weekTwo;

public class Lesson6_Encapulation {
    /*
        To make sure that variables are hidden from outside access.
        Can only be accessed, updated through specific methods... this is encapsulation
        it controls how the
     */

    private String name;
    private int cost;
    private String county;

    public Lesson6_Encapulation(String name, int cost, String county) {
        this.name = name;
        this.cost = cost;
        this.county = county;
    }

    //getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    //you can create your own setters and getters e.g.
    public int myGetter(int i){
        return this.cost;
    }

    public String mySetter(){
        return this.county;
    }

}//end class
