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
public class HideView extends View{
    
     public HideView() {
             super("\n --------------------------------------------------------"
                + "\n| Oh no! It seems like someone is coming!!!               |"
                + "\n There is not time to loose, you must hide now!           |"
                + "\n| You have two options, choose quickly and wisely.        |"
                + "\n ---------------------------------------------------------"
                + "\nB - Bathroon"
                + "\nC - Closet"
                + "\n -----------------------------"
                + "\nPlease enter the Letter");
}

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
            case "B": //create and start a new game
                this.bathroom();
                break;
            case "C": //get and start an existing game
                this.closet();
                break;
            default:
                System.out.println("\nInvalid selection. Try again");
                break;
        }
        return false;
    }

    private void bathroom() {
          BathroomMenuView bathroomMenuView = new BathroomMenuView();
        bathroomMenuView.display();
    }

    private void closet() {
     System.out.println("\ncloset() called");
    }
}