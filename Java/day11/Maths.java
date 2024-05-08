public class Maths {
    public double PI = 3.14;
    int num1, num2;
    public Maths(int a, int b){
        num1 = a;
        num2 = b;
    }

    public int sum(){
        return num1+num2;
    }

    public int sumArray(int nums[]){
        int total=0;
        for(int i=0; i<nums.length; i++){
            total += nums[i];
        }

        return total;
    }

    public int sub(){
        return num1-num2;
    }

    public int mul(){
        return num1*num2;
    }
}
