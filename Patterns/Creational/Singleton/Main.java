package Patterns.Creational.Singleton;

public class Main {
    public static void main(String[] args){
        Printer user1 = Printer.getInstance();
        user1.print("Hello from User 1!");

        Printer user2 = Printer.getInstance();
        user2.print("Hello from User 2!");

        if(user1 == user2){
            System.out.println("Both users are using the same Printer instance.");
        } else {
            System.out.println("Different Printer instances were created.");
        }
    }
    
}
