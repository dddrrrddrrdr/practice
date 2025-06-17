package Patterns.Creational.Factory;

public class Main {
    public static void main(String[] args){

        // This is the main method where the program starts execution.
        // It creates an instance of WindowsDialog and calls the show method.
        Dialog dialog;

        String platform = "windows"; // This variable determines which dialog to create.
        if(platform.equals("web")){
            dialog = new WebDialog();
        }
        else{
            dialog = new WindowsDialog();
        }

        dialog.show(); // Calls the show method on the dialog instance, which will render the button.
    }
}
