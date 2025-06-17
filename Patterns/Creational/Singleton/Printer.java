package Patterns.Creational.Singleton;
// The Singleton Pattern ensures that a class has only one instance in the whole program and provides a way to access that single instance from anywhere.

public class Printer {
    
    // Singleton class to ensure only one instance of Printer exists
    private static Printer instance;

    // Private constructor to prevent instantiation from outside
    private Printer(){
        System.out.println("Printer instance created.");
    }

    // Public method to provide access to the single instance
    public static Printer getInstance(){
        if(instance == null){
            instance = new Printer();
        }
        return instance;
    }

    public void print(String message){
        System.out.println("Printing: " + message);
    }
}
