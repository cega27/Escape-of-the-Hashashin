/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.view;

/**
 *
 * @author carlos
 */
public class ShoreView extends View{
    
     public ShoreView(){
        
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
                + "\n| Great! You made it through the maze and outside the walls   |"
                + "\n| without been cought. Now there is a boat in front of you.   |"
                + "\n| You need to get to your ship that is waiting for you at the |"
                + "\n| sea ready to sail.                                          |"
                + "\n --------------------------------------------------------------------"
        + "\nGarden Gate"
                + "\nA - Get in the boat and padle away"
                + "\nB - Get in the water and swim to your ship"
                + "\nQ - Quit"
                + "\n -----------------------------"
                + "\nPlease enter the Letter");
        
        
        
    }
    
    
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
            case "A": //create and start a new game
                this.keys();
                break;
            case "B":
                this.rock();
                break;
            default:
                ErrorView.display(this.getClass().getName(), "\nInvalid selection. Try again");
                break;
        }
        return true;
    
    
    
    
    
}

    private void keys() {
        ShipView shipView = new ShipView();
        shipView.display();
    }

    private void rock() {
        System.out.println("\n -----------------------------------------------------"
                         + "\n| You decided to start swiming but the ship was too   |"
                         + "\n| far away from the shore. You have drowned. You were |"
                         + "\n| so close."
                         + "\n -----------------------------------------------------");
    
    }
}
