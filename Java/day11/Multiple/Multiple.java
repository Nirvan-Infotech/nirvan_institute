public class Multiple implements Parent1, Parent2{
    public void printParent1(){
        System.out.println("This is patent 1");
    }
    public void printParent2(){
        System.out.println("This is patent 2");
    }
    public static void main(String[] args) {
        Multiple m = new Multiple();
        m.printParent1();
        m.printParent2();
    }
}
