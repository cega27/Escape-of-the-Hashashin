package byui.cit260.escapeHashashin.view;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Garen
 */
public class GameMenuView extends View {


   public GameMenuView() {
       super(
            "\n -----------------------------"
            +"\n| Game Menu                   "
            +"\n -----------------------------"
            +"\nA - Advance Forward"
            +"\nS - Go Back"
            +"\nD - Hide"
            +"\nF - Right Room"
            +"\nG - Left Room"
            +"\nH - Assassinate"
            +"\nJ - Map"
            +"\nK - Search Room"
            +"\nL - Save Game"
            +"\nZ - Weapons Inventory"
            +"\nX - Treasure Inventory"
            +"\nC - Key Inventory"
            +"\nQ - Quit"
            +"\n -----------------------------"
            + "\nPlease enter the Letter");
         
    
   }  
   
   @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "A": //create and start a new game
                this.advanceForward();
                break;
            case "S": //get and start an existing game
                this.goBack();
                break;
            case "D": // display the help menu
                this.playerHide();
                break;
            case "F": //save the current game
                this.rightRoom();
                break;
            case "G": //create and start a new game
                this.leftRoom();
                break;
            case "H": //get and start an existing game
                this.playerAssassinate();
                break;
            case "J": // display the help menu
                this.displayMap();
                break;
            case "K": //save the current game
                this.searchRoom();
                break;
            case "L": //get and start an existing game
                this.saveGame();
                break;
            case "Z": // display the help menu
                this.weaponsInventory();
                break;
            case "X": //save the current game
                this.treasureInventory();
                break;
            case "C": //sa
                this.keyInventory();
                break;
            default:  
                System.out.println("\nInvalid selection. Try again");
                break;
        }
        return true;
    
    
    }

    private void advanceForward() {
        System.out.println("\nadvanceForward() function called");
    }

    private void goBack() {
        System.out.println("\ngoBack() function called");
    }

    private void playerHide() {
       HideView hideView = new HideView();
        hideView.display();
    }

    private void rightRoom() {
        System.out.println("\nrightRoom() function called");
    }

    private void leftRoom() {
        System.out.println("\nleftRoom() function called");
    }

    private void playerAssassinate() {
        System.out.println("\nplayerAssassinate() function called");
    }

    private void displayMap() {
        System.out.println("\ndisplayMap() function called");
    }

    private void searchRoom() {
        System.out.println("\nsearchRoom() function called");
    }

    private void saveGame() {
        System.out.println("\nsaveGame() function called");
    }

    private void weaponsInventory() {
        System.out.println("\nweaponsInventory() function called");
    }

    private void treasureInventory() {
        System.out.println("\ntreasureInventory() function called");
    }

    private void keyInventory() {
        System.out.println("\nkeyInventory() function called");
    }

    public void displayGameMenuView() {
        System.out.println("\ndisplayGameMenuView");
    }
}
