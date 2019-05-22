package week1;//9th may 2019

public class lesson4D_Arrays2 {
    public static void main(String [] args){
        //Multidimentional Arrays
        int num[][] = {{34,56,67}, {32,76,89,45}, {23,56,87,90,89}};
        System.out.println(num[1][1]);

        for(int i=0; i<num.length;i++){
            System.out.println("");
            for (int x=0; x<num[i].length;x++){
                System.out.print(num[i][x]+"\t");
            }
        }//justpaste.it/1xfmm
//palindrome program
    }
}
