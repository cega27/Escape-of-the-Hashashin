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
                + "\nG - Start saved game"
                + "\nH - Get help on how to play the game"
                + "\nV - Goblet"
                + "\nL - Lock"
                + "\nM - Maze"
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
                this.startSavedGame();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
                break;
            
            case "V": // display goblet problem
                this.gobletMath();
                break;
            case "L": // display Door Lock problem
                this.lockMath();
                break;
            case "M": // display Maze problem
                this.mazeMath();
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

    private void startSavedGame() {
        //prompt for and get the name of the file to sae the game in
        this.console.println("\n\nEnter the file path for the file where the game"
                + "is to be saved.");
        
        String filePath = this.getInput();
        
        try{
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        

    }

    private void displayHelpMenu() {
        //      HelpControl.displayHelp(EscapeHashashin.getHelp());

        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    

    private void gobletMath() {
        GobletView gobletView = new GobletView();
        gobletView.display();
    }

    private void lockMath() {
        LockControlView lockControlView = new LockControlView();
        lockControlView.display();
    }

     private void mazeMath() {
        MazeControlView mazeControlView = new MazeControlView();
        mazeControlView.display();
    }
}
