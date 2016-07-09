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
public class BathroomMenuView extends View{
         
    public BathroomMenuView() {
             super("\n -----------------------------------------------------------"
                + "\n| Wow! That was close! You almost got caught                 |"
                + "\n| Wait! There is a drunken man on the floor of the bathroom. |"
                + "\n| Seems like he wont be able to wake up for a few hours      |"
                + "\n| What do you want to do?                                    |"
                + "\n ------------------------------------------------------------"
                + "\nK - Kill the drunken man"
                + "\nC - Take his clothes"
                + "\nL - Leave the bathroom"
                + "\n -----------------------------"
                + "\nPlease enter the Letter");
    }
    
      @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
            case "K": //create and start a new game
                this.killDrunken();
                break;
            case "C": //get and start an existing game
                this.takeCLothes();
                break;
            case "L": //get and start an existing game
                this.leaveBathroom();
                break;
            default:
                ErrorView.display(this.getClass().getName(),"\nInvalid selection. Try again");
                break;
        }
        return false;
    }

    private void killDrunken() {
         System.out.println("\nkillDrunken() called");
    }

    private void takeCLothes() {
         System.out.println("\ntakeClothes() called");
    }

    private void leaveBathroom() {
         System.out.println("\nleaveBathroom() called");
    }
    
}
