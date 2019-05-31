package further_practice.StudentsMgT;


public class Student_Object {

    Student_DB_API api = new Student_DB_API();
    private int admNo;
    private String studNames;
    private String form;
    private String stream;
    private String club;
    private String house;

    public Student_Object() {
    }//end of empty constructor

    public Student_Object(String studNames, String form, String stream, String club, String house) {
        this.studNames = studNames;
        this.form = form;
        this.stream = stream;
        this.club = club;
        this.house = house;
    }

    //create the setters

    public void setAdmNo(int admNo) {
        this.admNo = admNo;
    }

    public void setstudNames(String names) {
        this.studNames = names;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    //set the getters


    public int getAdmNo() {
        return admNo;
    }

    public String getstudNames() {
        return this.studNames;
    }

    public String getForm() {
        return form;
    }

    public String getStream() {
        return stream;
    }

    public String getClub() {
        return club;
    }

    public String getHouse() {
        return house;
    }

//    public boolean saveData(){
//        boolean weka = false;
//        api.save_Student(this.studNames, this.form, this.stream, this.club, this.house);
//        return weka;
//    }

}//end class
