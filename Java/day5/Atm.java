import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt, flag=1, amt, balance = 10000;
        System.out.println("1. Withdraw Money");
        System.out.println("2. Deposit Money");
        System.out.println("3. Show Balance");
        System.out.println("4. Exit");

        while(flag == 1){
            System.out.print("\nSelect Option: ");
            opt = sc.nextInt();

            if(opt == 1){
                System.out.print("\nWithdraw Money");
                System.out.print("\n***************\n");
                System.out.print("Enter amount to withdraw: ");
                amt = sc.nextInt();

                if(amt<balance){
                    if(amt%500==0){
                        System.out.println(amt + " withdrawed.");
                        balance -= amt;
                    }
                    else{
                        System.out.println("Only 500 notes available");
                    }
                }
                else{
                    System.out.println("Insufficient Balance");
                }
            }
            else if(opt == 2){
                System.out.print("\nDeposit Money");
                System.out.print("\n***************\n");
                System.out.print("Enter amount to deposit: ");
                amt = sc.nextInt();

                if(amt>=5000){
                    if(amt%500==0){
                        System.out.println(amt + " deposited.");
                        balance += amt;
                    }
                    else{
                        System.out.println("Only 500 notes available");
                    }
                }
                else{
                    System.out.println("Balance must be greaer than 5000");
                }
            }
            else if(opt == 3){
                System.out.print("Balance: "+ balance);
            }
            else if(opt == 4){
                System.out.print("Good Bye!!!");
                flag = 0;
                break;
            }
            else{
                System.out.println("Invalid Option");
            }
        }
    }
}
