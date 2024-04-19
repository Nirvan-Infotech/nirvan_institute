public class MaxThree {
    public static void main(String[] args) {
        int n1=40, n2=40, n3=50;

        if(n1 > n2 && n1 > n3){
            System.out.println("n1 is max " + n1);
        }
        else if(n2 > n1 && n2 > n3){
            System.out.println("n2 is max " + n2);
        }
        else if(n3 > n1 && n3 > n2){
            System.out.println("n3 is max " + n3);
        }
        else{
            System.out.println("All are equal.");
        }
    }
}
