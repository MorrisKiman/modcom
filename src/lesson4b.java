public class lesson4b {
    public static void main(String [] args){
        //do...while loop
        //Normally, stay away from the do while. Use it only when other control structures

        int counter = 1;
        do{
            System.out.println("Doing......" + counter);
        } while(counter > 1000);//condition is false but it still runs; only to find that it is impossible. It is the pitfall of do while

        System.out.print("\nThe right loop\n");
        do{
            System.out.println("Doing......" + counter);
            counter++;
        } while(counter < 1000);

    }
}
