//21 - May - 2019
package Week3.Assignmentsweek3;

//I will use this class to create methods that I will get to post after the math has been completed


public class Assifnment1_methods {
    String reply1 = "The Answer of yout arithmetic operation is a whole number\n Meaning that it has no reminders";
    String reply2 = "The Answer of yout arithmetic operation is not a whole number\n Meaning that it has reminders";
    String resultingString;

    public String reply(int x){
        String r1 = new String();
        if (x == 0){//checking if the modulous is = to 0 meaning if true, there was no reminder
                r1 = "The answer is: " + x + " And\n" + reply1;
            }else if (x > 0){
                r1 = "The answer is: " + x + " And\n" + reply2;
        }//end if
        String res =r1;
        resultingString = res;
        return res;
    }//end reply

}//end class
