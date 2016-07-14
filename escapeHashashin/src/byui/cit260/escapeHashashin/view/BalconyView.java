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
public class BalconyView extends View{
    
    public BalconyView(){
        super("\n -----------------------------"
                + "\n| Game Menu                  "
            + "\nZ- Display Map"
            + "\nX- Save Game"
            + "\nY- Weapons Inventory"
            + "\nW- Treasure Inventory"
            + "\nV- Key Inventory "
            + "\n -----------------------------"
                + "\n -----------------------------"
            + "\n Balcony"
                + "\n --------------------------------------------------------"
                + "\n| Oh no! It seems like someone is coming!!!               |"
                + "\n| There is not time to loose, you must hide now!          |"
                + "\n| You have two options, choose quickly and wisely.        |"
                + "\n ---------------------------------------------------------"
                + "\nA - Hallway"
                + "\nB - Bathroon"
                + "\nC - Closet"
                + "\nQ - Quit Game"
                + "\n -----------------------------"
                + "\nPlease enter the Letter");
}

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
             case "A": //create and start a new game
                this.hallway();
                break;
            case "B": //create and start a new game
                this.bathroom();
                break;
            case "C": //get and start an existing game
                this.closet();
                break;
            default:
                ErrorView.display(this.getClass().getName(),"\nInvalid selection. Try again");
                break;
        }
        return false;
    }

    private void hallway() {
        HallwayTwoView hallwayTwoView = new HallwayTwoView();
        hallwayTwoView.display();
    }
    
    private void bathroom() {
        BathroomMenuView bathroomMenuView = new BathroomMenuView();
        bathroomMenuView.display();
    }

    private void closet() {
     System.out.println("\n --------------------------------------------"
                      + "\n| Bad luck it seems like the door is locked! |"
                      + "\n --------------------------------------------");
    }
}
    
