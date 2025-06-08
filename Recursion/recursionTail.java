package Recursion;

public class recursionTail {

    public static void numbers(int x) {
        if(x > 0){
            System.out.print(x + " -- ");

            numbers(x-1);
        }
    }

    public static void main(String[] args) {
       int i = 5;
       numbers(i);
    }
}