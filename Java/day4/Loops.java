public class Loops {
    public static void main(String[] args) {
        /*
         * Loops
         *  1. Number based loop
         *      -> for loop
         *  2. Condition based loop
         *      -> while loop
         *      -> do...while loop
         */

        //  for(init; condition; inc/dec){logic;}

        // for(int i=1; i<=10; i++){
        //     System.out.println(i);
        // }
        int start=12, end=30, steps=2;
        for(int i=start; i<=end; i+=steps){
            System.out.println(i);
        }
    }
}
