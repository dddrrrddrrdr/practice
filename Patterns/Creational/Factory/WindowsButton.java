package Patterns.Creational.Factory;

// implements is used to make sure that the class adheres to the Button interface.
public class WindowsButton implements Button{
    public void render(){
        System.out.println("Rendering a Windows button.");
    }
}
