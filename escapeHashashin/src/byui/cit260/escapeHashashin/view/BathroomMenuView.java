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
         System.out.println("\n --------------------------------------------------"
                          + "\n| The man made too much nosie when you killed him. |"
                          + "\n| The noise alerted the gurdians, and now you are  |"
                          + "\n| dead. Thanks for playing, Please Try Again       |"
                          + "\n --------------------------------------------------");
        
         GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    private void takeCLothes() {
         System.out.println("\n -------------------------------------------------------------"
                          + "\n| As you take the man's clothes he seems to twich a little    |"
                          + "\n| but he has drunken a lot and doesn't seem to wake up.       |"
                          + "\n| With this new outfit you can walk around the castle with a  |"
                          + "\n| little more freedom. Make sure to act properly and avoid    |"
                          + "\n| getting caught. You can now go to the main hall and blend   |"
                          + "\n| in with the people there.                                   |"
                          + "\n -------------------------------------------------------------");
         
         MainHallView mainHallView = new MainHallView();
         mainHallView.display();
         
         
    }

    private void leaveBathroom() {
         System.out.println("\n ------------------------------------------------------"
                          + "\n| Oh no! It seems like you exited the bathroom too     |"
                          + "\n| soon. The guards see and inmediately point their     |"
                          + "\n| weapons at you leading to your surrending and        |"
                          + "\n| encarcelation. Thanks for playing, please try again! |"
                          + "\n ------------------------------------------------------");
         GameMenuView gameMenuView = new GameMenuView();
         gameMenuView.display();
    }
    
}
