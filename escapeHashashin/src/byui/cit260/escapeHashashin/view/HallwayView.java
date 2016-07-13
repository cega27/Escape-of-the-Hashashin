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
class HallwayView extends View {
    
    public HallwayView(){
        super("\n -----------------------------"
                + "\n| Game Menu                  "
            + "\nZ- Display Map"
            + "\nX- Save Game"
            + "\nY- Weapons Inventory"
            + "\nW- Treasure Inventory"
            + "\nV- Key Inventory "
            + "\n -----------------------------"
                + "\n -----------------------------"
            +"\nLibrary"
            +"\nThis is the King's Study. All the knowledge in the"
        + "\nland are within these walls. If you had the time you could "
        + "\nlearn a great deal about the secrets of the Kingdom. Yet this" 
        +"\nroom is of no use to you. The single door in front of you is to"
        + "\nthe hallway."
                + "\nA - Throne Room"
                +"\nB - Library"
                + "\nQ - Quit"
                + "\n -----------------------------"
                + "\nPlease enter the Letter");
}
        
    
    
    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
            case "A": //create and start a new game
                this.throneRoom();
                break;
            case "B":
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
    
    
    
    
    


    private void throneRoom() {
        ThroneRoomView throneRoomView = new ThroneRoomView();
        throneRoomView.display();
    }

    

   
      
}
