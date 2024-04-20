import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean key = true;
        System.out.print("1. Square\n2. Cube\n3. Exit\n");

        
        while(true){
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            if(ch == 1){
                System.out.println("Square");
            }
            else if(ch == 2){
                System.out.println("Cube");
            }
            else if(ch == 3){
                System.out.println("Good Bye");
                // key = false;
                break;
            }
        }
    }
}   
