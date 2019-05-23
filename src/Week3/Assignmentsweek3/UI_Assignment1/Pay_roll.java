package Week3.Assignmentsweek3.UI_Assignment1;

public class Pay_roll {
    private  String names;
    private int hrsWorked;
    public Pay_roll() {

    }
    public Pay_roll(String names, int hrsWorked) {
        this.names = names;
        this.hrsWorked = hrsWorked;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getHrsWorked() {
        return hrsWorked;
    }

    public void setHrsWorked(int hrsWorked) {
        this.hrsWorked = hrsWorked;
    }

}
