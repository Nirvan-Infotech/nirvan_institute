import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = {1,2,3,4,5,6,7,9,10};
        int marks[] = new int[5];
        int length=0;

        for(int i=0; i<5; i++){
            System.out.print("Enter marks of " + i + ": ");
            marks[i] = sc.nextInt();
            length++;
        }

        for(int i=0; i<5; i++){
            System.out.println("Marks["+i+"]: "+ marks[i]);
        }


        System.out.println("Length of array " + age.length);
        System.out.println("Length of array marks " + length);
    }
}
