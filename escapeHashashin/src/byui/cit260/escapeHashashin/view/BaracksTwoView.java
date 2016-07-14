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
public class BaracksTwoView extends View {
    
     public BaracksTwoView(){
    
    
    super("\n -----------------------------"
                + "\n| Game Menu                  "
            + "\nZ- Display Map"
            + "\nX- Save Game"
            + "\nY- Weapons Inventory"
            + "\nW- Treasure Inventory"
            + "\nV- Key Inventory "
            + "\n -----------------------------"
                + "\n -----------------------------"
            +"\nBaracks"
            + "\n ---------------------------------------------------------------------"
            + "\n| You just accessed one of the main quarters where the guards reside. |"
            + "\n| Luckly for you all the guards are busy because of the banquet.      |"
            + "\n| You must leave immediately.                                         |"
            + "\n ---------------------------------------------------------------------\n"
                + "\nA - Main Hall"
                + "\nQ - Quit"
                + "\n -----------------------------"
                + "\nPlease enter the Letter");
    
    
}
    
     @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
            case "A": //create and start a new game
                this.mainHall();
                break;
            
               
            default:
                ErrorView.display(this.getClass().getName(), "\nInvalid selection. Try again");
                break;
        }
        return true;
    
    }

    private void mainHall() {
       MainHallView mainHallView = new MainHallView();
       mainHallView.display();
    }
    
}
