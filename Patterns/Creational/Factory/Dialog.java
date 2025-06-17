package Patterns.Creational.Factory;

//Abstract class is a class that cannot be direclty created using the 'new' keyword,  
public abstract class Dialog {
    public void show(){
        Button okbutton = createButton();
        okbutton.render();
    }

    public abstract Button createButton(); // Abstract method that must be implemented by subclasses
    
}
