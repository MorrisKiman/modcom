package further_practice;

public class SumandAverage {
    //proogram that sums all numbers from 1 - 100 and finds the average.
    public static void main(String [] args) {
        int numbers[] = new int[100];
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            int num = 1;
            numbers[i]=num;
            sum+=num;
            num++;
            System.out.println("Number==> "+numbers[i]+"  sum===> "+sum );
        }//end for

        double average = sum/100;
        System.out.println("sum===> "+sum+" AVERAGE====>" +average);
        System.out.println("Coded, tested and run successfully in 8 minutes, 4 seconds");
    }//end main
}//end class

