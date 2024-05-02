public class Bike{
    int price;
    String name;
    int speed;
    double average;

    // default constructor
    public Bike(){
        this.price = 0;
        this.name = "none";
        this.speed = 0;
        this.average = 0.0;
    }

    // parameterised constructor
    public Bike(int price, String name, int speed, double average){
        this.price = price;
        this.name = name;
        this.speed = speed;
        this.average = average;
    }

    void printData(){
        System.out.println("Name: " + (this.name));
        System.out.println("Price: " + (this.price));
        System.out.println("Speed: " + (this.speed));
        System.out.println("Average: " + (this.average));
    }
    public static void main(String args[]){
            Bike b1 = new Bike();
            Bike honda = new Bike(12000, "Honda", 90, 60.20);
            b1.printData();
            honda.printData();
    }
}