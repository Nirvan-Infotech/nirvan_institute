/*
 * 1. Function without arguments & without return value
 * 2. Function with arguments & without return value
 * 3. Function without arguments & with return value
 * 4. Function with arguments & with return value
 */

public class Functions {
    // 1. Function without arguments & without return value
    static void sayMyName(){
        System.out.println("My name is _____.");
    }

    // 2. Function with arguments & without return value
    static void sayMyAge(int age){
        System.out.println("Age: " + age);
    }

    // 3. Function without arguments & with return value
    static boolean isLoggedIn(){
        if(true){
            return true;
        }
        else{
            return false;
        }
    }

    // 4. Function with arguments & with return value
    static String fullName(String fn, String ln){
        return fn+ln;
    }

    public static void main(String[] args) {
        sayMyName();
        sayMyAge(10);
        System.out.println(isLoggedIn());
        System.out.println(fullName("abc", "xyz"));
    }
}
