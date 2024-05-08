package multilevel;
public class GrandChild extends Child{
    public GrandChild(){
        System.out.println("This is a grand child class.");
    }

    public static void main(String[] args) {
        GrandChild gc = new GrandChild();
    }
}
