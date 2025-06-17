package Patterns.Creational.Factory;

public class WindowsDialog extends Dialog{
    public Button createButton() {
        return new WindowsButton(); // Returns a new instance of WindowsButton
    }
    
}
