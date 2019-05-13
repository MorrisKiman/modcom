//9th may 2019
public class ArrayTask {
    public static void main(String [] args){
        //given an array of 4 ints,
        //find Max
        int[] num = {56,67,64,54};
        int largest = 0;
        for (int x = 0; x < num.length; x++){
            if (num[x] > largest){
                largest = num[x];
            }else{

            }
        }//end for loop
        System.out.println(largest);

    }//end main
}
