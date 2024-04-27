public class Oop {
    static void sum(){
        int a=10, b=20;

        System.out.println("Total: " + (a+b));
    }

    static void sum(int a, int b){
        System.out.println("Sum: " + (a+b));
    }

    public static void main(String[] args) {
        sum();
        sum(10,4);
    }
}
