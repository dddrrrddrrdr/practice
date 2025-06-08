package Recursion;

public class recursionHead {

    public static void numbers(int x) {
        if(x > 0){
            numbers(x-1);

            System.out.print(x + " -- ");
        }
    }

    public static void main(String[] args) {
       int i = 5;
       numbers(i);
    }
}
