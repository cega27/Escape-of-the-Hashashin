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
class OutsideGateView extends View {
    
    public OutsideGateView() {
        
        super("\n -----------------------------"
                + "\n| Game Menu                  "
            + "\nZ- Display Map"
            + "\nX- Save Game"
            + "\nY- Weapons Inventory"
            + "\nW- Treasure Inventory"
            + "\nV- Key Inventory "
            + "\n -----------------------------"
                + "\n -----------------------------"
            +"\nOutside the Walls"
            +"\nCold fresh air fill your lungs as you emerge. You are not safe yet. "
                + "You take the helm of a small boat and sale the short distance off "
                + "the island and onto main land."
                + "\nA - Escape"
                + "\nQ - Tunnel"
                + "\n -----------------------------"
                + "\nPlease enter the Letter");
        
        
    }
    
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
            case "A": //create and start a new game
                this.escapeTheKingdom();
                break;
            case "B":
                this.tunnel();
                break;
                
               
            default:
                ErrorView.display(this.getClass().getName(), "\nInvalid selection. Try again");
                break;
        }
        return true;
    
}

    private void escapeTheKingdom() {
        EscapeTheKingdomView escapeTheKingdomView = new EscapeTheKingdomView();
        escapeTheKingdomView.display();
    }

    private void tunnel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}