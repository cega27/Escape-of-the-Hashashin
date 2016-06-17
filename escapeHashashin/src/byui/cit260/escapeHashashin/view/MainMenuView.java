/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.view;

import byui.cit260.escapeHashashin.control.GameControl;
import byui.cit260.escapeHashashin.control.HelpControl;
import escapehashashin.EscapeHashashin;
import java.util.Scanner;
import byui.cit260.escapeHashashin.view.GameMenuView;

/**
 *
 * @author carlos
 */
public class MainMenuView extends View {

    public MainMenuView() {

        super("\n -----------------------------"
                + "\n| Main Menu                   "
                + "\n -----------------------------"
                + "\nN - Start new game"
                + "\nG - Get and start saved game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save game"
                + "\nV - Goblet"
                + "\nL - Lock"
                + "\nQ - Quit"
                + "\n -----------------------------"
                + "\nPlease enter the Letter");

    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
            case "N": //create and start a new game
                this.startNewGame();
                break;
            case "G": //get and start an existing game
                this.startExistingGame();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
                break;
            case "S": //save the current game
                this.saveGame();
                break;
            case "V": // display goblet problem
                this.gobletMath();
                break;
            case "L": // display goblet problem
                this.lockMath();
                break;
            default:
                System.out.println("\nInvalid selection. Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {

        GameControl.createNewGame(EscapeHashashin.getPlayer());

        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        /*
        BEGIN
            create a new game
        
            create a new game menu viewhh
        
            display the game menu
        END
         */
    }

    private void startExistingGame() {
        System.out.println("startExistingGame() function called");
    }

    private void displayHelpMenu() {
        //      HelpControl.displayHelp(EscapeHashashin.getHelp());

        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        System.out.println("saveGame() function called");

    }

    private void gobletMath() {
        GobletView gobletView = new GobletView();
        gobletView.display();
    }

    private void lockMath() {
        LockControlView lockControlView = new LockControlView();
        lockControlView.display();

    }

}
