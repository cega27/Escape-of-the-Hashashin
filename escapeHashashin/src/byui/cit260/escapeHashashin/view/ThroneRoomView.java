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
class ThroneRoomView extends View {
    
    ThroneRoomView(){
        super("\n -----------------------------"
                + "\n| Game Menu                  "
            + "\nZ- Display Map"
            + "\nX- Save Game"
            + "\nY- Weapons Inventory"
            + "\nW- Treasure Inventory"
            + "\nV- Key Inventory "
            + "\n -----------------------------"
                + "\n -----------------------------"
            +"\nThrone Room"
            +"\nThe Royal court of the evil King. Many of your friends have died"
                + " unjustly in this chamber. Public beheadings and verocious dogs "
                + "used to publicly kill. You may leave this chamber or try your hand "
                + "with the puzzle to find the Holy Goblet."
                + "\nA - Kitchen"
                +"\nB - Hallway"
                +"\nC - Bathroom"
                + "\nD - Goblet"
                
                + "\nQ - Quit"
                + "\n -----------------------------"
                + "\nPlease enter the Letter");
}
   
    
    
    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
            case "A": //create and start a new game
                this.kitchen();
                break;
            case "B":
                this.hallway();
            case "C":
                this.bathroom();
            case "D":
                this.goblet();
        
                
            default:
                ErrorView.display(this.getClass().getName(), "\nInvalid selection. Try again");
                break;
        }
        return true;
    
}

    private void kitchen() {
        KitchenView kitchenView = new KitchenView();
        kitchenView.display();
    }

    private void hallway() {
        HallwayView hallwayView = new HallwayView();
        hallwayView.display();
        
    }

    private void bathroom() {
        BathroomView bathroomView = new BathroomView();
        bathroomView.display();
           
    }

    private void goblet() {
        GobletView gobletView = new GobletView();
        gobletView.display();
    }
    
  }   
    
    
    
    
