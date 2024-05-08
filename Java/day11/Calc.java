public class Calc extends Maths {
    
    public Calc(int a, int b) {
        super(a, b);
    }

    public static void main(String args[]){
        Maths m = new Maths(10, 20);

        int nums[] = {10,20,30,40,50}; 
        System.out.println("Addition: " + m.sum());
        System.out.println("Subtraction: " + m.sub());
        System.out.println("Multipication: " + m.mul());
        System.out.println("Addition: " + m.sumArray(nums));
    }
}
