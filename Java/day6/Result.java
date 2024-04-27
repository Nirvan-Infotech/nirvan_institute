import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        int total=0;
        double per;
        char grade=' ';

        for(int i=0; i<5; i++){
            System.out.print("Enter marks of " + i + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        per = total/marks.length;

        if(per >= 90){
            grade = 'A';
        }
        else if(per >= 70 && per < 90){
            grade = 'B';
        }
        else if(per >= 50 && per < 70){
            grade = 'C';
        }
        else if(per >= 35 && per < 50){
            grade = 'D';
        }
        else if(per < 35){
            grade = 'F';
        }

        for(int i=0; i<5; i++){
            System.out.println("Marks["+i+"]: "+ marks[i]);
        }
        System.out.println("Total Marks: "+total);
        System.out.println("Percentage: "+per);
        System.out.println("Grade: "+grade);
    }
}

