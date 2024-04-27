public class ArrayAdd {
   public static void main(String[] args) {
        int[][] matrix1 = {{1,2},{3,4}};
        int[][] matrix2 = {{1,2},{3,4}};
        int[][] total = new int[2][2];

        for(int row=0; row<2; row++){
            for(int col=0; col<2; col++){
                total[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }

        for(int row=0; row<2; row++){
            for(int col=0; col<2; col++){
                System.out.print(total[row][col] + " ");
            }
            System.out.print("\n");
        }
   } 
}
