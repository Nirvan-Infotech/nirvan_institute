import Parent;

package multilevel;
public class Child extends Parent{
    public Child(){
        System.out.println("This is a child class");
    }

    public static void main(String[] args) {
        Child c1 = new Child();
    }
}
