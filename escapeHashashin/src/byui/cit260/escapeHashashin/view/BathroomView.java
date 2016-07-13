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
class BathroomView extends View {
    
    public BathroomView() {
        
        
         super("\n -----------------------------"
                + "\n| Game Menu                  "
            + "\nZ- Display Map"
            + "\nX- Save Game"
            + "\nY- Weapons Inventory"
            + "\nW- Treasure Inventory"
            + "\nV- Key Inventory "
            + "\n -----------------------------"
                + "\n -----------------------------"
            +"\nBathroom"
            +"\nThe bathroom is a safe place to gather your bearings. There is a drunk "
                 + "party guest who couln't handle his liquor. You ignore him and slip "
                 + "out as soon as a group of guards pass."
                + "\nA - Throne Room"
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
            
               
            default:
                ErrorView.display(this.getClass().getName(), "\nInvalid selection. Try again");
                break;
        }
        return true;
    
    }

    private void throneRoom() {
        ThroneRoomView throneRoomView = new ThroneRoomView();
        throneRoomView.display();
    }
    
    
    
    
}
