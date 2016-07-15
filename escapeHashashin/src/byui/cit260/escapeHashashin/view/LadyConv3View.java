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
public class LadyConv3View extends View{
    
     public LadyConv3View(){
        
        super("\n -----------------------------"
                + "\n| Game Menu                  "
            + "\nZ- Display Map"
            + "\nX- Save Game"
            + "\nY- Weapons Inventory"
            + "\nW- Treasure Inventory"
            + "\nV- Key Inventory "
            + "\n -----------------------------"
                + "\n -----------------------------"
            +"\nResponse"
                + "\n ------------------------------------------------------------"
                + "\n| Miss Ives looks at you with a sarcastic look and says:     |"
                + "\n| 'I'm sorry, but I am not looking for a husband'            |"
                + "\n| As she walsk away she bumps into someone dropping a set of |"
                + "\n| keys on the floor without she even noticing it.            |"
                + "\n| You pick up the key and only hope one of them is the key   |"
                + "\n| to the Rotal gardens.                                      |"
                + "\n ------------------------------------------------------------"
                + "\nA - Royal Gardens"
                +"\nB - Barracks"
                + "\nQ - Quit"
                + "\n -----------------------------"
                + "\nPlease enter the Letter");
        
        
        
    }
    
    
    
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
            case "A": //create and start a new game
                this.royalGardens();
                break;
            case "B":
                this.barracks();
                break;
                
               
            default:
                ErrorView.display(this.getClass().getName(), "\nInvalid selection. Try again");
                break;
        }
        return true;
        
        
    }

    private void royalGardens() {
        GardenView gardenView = new GardenView();
        gardenView.display();
    }

    private void barracks() {
           System.out.println("\n ---------------------------------------------------"
                      + "\n| You were not that lucky this time. There were guards at |"
                      + "\n| the barracks this time. They thought yu were a spy from |"
                      + "\n| the west kingdom so you have been put in prison.        |"
                      + "\n| Game Over, Please try again.                            |"
                      + "\n ---------------------------------------------------------");
    
      GameMenuView gameMenuView = new GameMenuView();
         gameMenuView.display();
    }
    
    
}
