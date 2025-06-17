package Patterns.Creational.Factory;

//Extends means that the class inherits from another class, in this case, Dialog.

public class WebDialog extends Dialog{
    public Button createButton() {
        return new WebButton(); // Returns a new instance of WebButton
    }
}
