package Recursion;

public class recursion {
    public static Long fibonacci(long x){
        if(x <= 1){
            return x;
        }
        else{
            return fibonacci(x-1) + fibonacci(x-2); 
        }
    }

    public static void main(String[] args) {
        int i = 50;
        System.out.println("fibonacci(" + i + ") = " + fibonacci(i));
    }
}


