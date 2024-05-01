public class Car {
    int price = 10000;
    String name;
    public Car(String name){
        this.name = name;
    }
    void printCar(){
        System.out.println("This is my car." + this.name);
    }
}


