import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[2][2];
        // int[][] matrix = {{1,2},{3,4}};

        // take user input
        for(int row=0; row<2; row++){
            for(int col=0; col<2; col++){
                System.out.print("Enter value of matrix["+row+"]["+col+"]: ");
                matrix[row][col] = sc.nextInt();
            }
        }

        //  print matrix
        for(int row=0; row<2; row++){
            for(int col=0; col<2; col++){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.print("\n");
        }
    }
}
