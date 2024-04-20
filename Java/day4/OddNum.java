import java.util.Scanner;

public class OddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting value: ");
        int start = sc.nextInt();

        System.out.println("Enter ending value: ");
        int end = sc.nextInt();

        if(start>end){
            for(int i = start; i>=end; i--){
                if(i%2!=0){
                    System.out.print(i + " ");
                }
            }
        }
        else{
            for(int i = start; i<=end; i++){
                if(i%2!=0){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
