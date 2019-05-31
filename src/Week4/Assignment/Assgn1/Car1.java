package Week4.Assignment.Assgn1;

public class Car1 {
    DB_API db_api = new DB_API();
    private String regNo;
    private int yearOfMake;
    private String modelNumber;
    private String make;

    public Car1() {
    }

    public Car1(String regNo, int yearOfMake, String modelNumber, String make) {
        this.regNo = regNo;
        this.yearOfMake = yearOfMake;
        this.modelNumber = modelNumber;
        this.make = make;
    }

    //setting the setters

    public void setRegNo1(String regNo) {
        this.regNo = regNo;
    }

    public void setYearOfMake1(int yearOfMake) {
        this.yearOfMake = yearOfMake;
    }

    public void setModelNumber1(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public void setMake1(String make) {
        this.make = make;
    }


    //set the getters

    public String getRegNo() {
        return regNo;
    }

    public int getYearOfMake() {
        return yearOfMake;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public String getMake() {
        return make;
    }

    public boolean fill(){
        boolean j = false;
        db_api.insertCars();
        return j;
    }

}
