public class ArrayProg {
    public static void main(String[] args) {
        // declare array
        int[] marks = new int[3];
        
        // assign value
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        
        // define array
        String cars[] = {"ms", "bmw", "audi"};

        for(int i=0; i<3; i++){
            System.out.println("Marks[" + i + "]: " + marks[i]);
            System.out.println("Cars[" + i + "]: " + cars[i]);
        }

    }
}
