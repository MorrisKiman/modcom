package weekTwo.week2Assignments.InheritanceAssigno;

public class Appointment {
    //object for an appoint ment

    String names; //who the appointment is with
    String day; //day of the week where the thing is
    double time; //time of the appointment

    //getters
    public String getNames() {
        return names;
    }

    public String getDay() {
        return day;
    }


    public double getTime() {
        return time;
    }


    //setters
    public void setNames(String names) {
        this.names = names;
    }


    public void setDay(String day) {
        this.day = day;
    }


    public void setTime(double time) {
        this.time = time;
    }
}
