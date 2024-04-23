import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        for(int i = 1; i<=num; i++){
            System.out.println("Table of " + i);
            for(int j=1; j<=10; j++){
                System.out.println(i + " * " + j + " = " + (i*j));
            }
        }
    }
}
