import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        /*
         * Withdraw Money
         * -> amt < bal
         * -> 500 notes available
         */

         int amt, bal = 10000;
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter amount to withdraw: ");
         amt = sc.nextInt();

         if(amt < bal){
            if(amt%500==0){
                System.out.println(amt + " amount withdrawed.");
                bal -= amt;
                System.out.println(bal + " balance remaining.");
            }
            else{
                System.out.println("Only 500 notes are available.");
            }
         }
         else{
            System.out.println("Insufficient balance.\n" + bal + " balance available.");
         }

    }
}
