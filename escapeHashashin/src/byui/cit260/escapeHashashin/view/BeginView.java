/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.view;

/**
 *
 * @author Garen
 */
public class BeginView extends View {
    

    private void displayBanner() {
        this.console.println("\nCongratulations. You have killed the king."
                + "No one has heard you and you only have one option: go through the door "
                + "in front of you. This will lead you to the library which should be "
                + "empty and quiet right now. Leave the dead King and run.");
    }
    
   
    
    public BeginView() {
        
    
    super("\n -----------------------------"
                + "\n| Game Menu                  "
            + "\nZ- Display Map"
            + "\nX- Save Game"
            + "\nY- Weapons Inventory"
            + "\nW- Treasure Inventory"
            + "\nV- Key Inventory "
            + "\n -----------------------------"
                + "\n -----------------------------"
            +"\nBegin"
            +"\nCongratulations. You have killed the king."
                + "No one has heard you and you only have one option: go through the door "
                + "\nin front of you. This will lead you to the library which should be "
                + "\nempty and quiet right now. Leave the dead King and run."
                + "\nA - Library"
                + "\nQ - Quit"
                + "\n -----------------------------"
                + "\nPlease enter the Letter");
    
   
}
    
    











@Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
            case "A": //create and start a new game
                this.library();
                break;
        
               
            default:
                ErrorView.display(this.getClass().getName(), "\nInvalid selection. Try again");
                break;
        }
        return true;

    }

    

    private void library() {
        LibraryView libraryView = new LibraryView();
        libraryView.display();
    }
}