/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.view;

import byui.cit260.escapeHashashin.control.GameControl;
import escapehashashin.EscapeHashashin;
import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class HelpMenuView extends View{

    public HelpMenuView() {
             super("\n ------------------------------"
                + "\n| Help Menu                  |"
                + "\n ------------------------------"
                + "\nG - What is the goal of the game?"
                + "\nM - How to move"
                + "\nE - Using objects"
                + "\nR - Complex puzzles"
                +     "\nQ - Quit"
                + "\n -----------------------------"
                + "\nPlease enter the Letter");

    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
            case "G": //create and start a new game
                this.goalOfGame();
                break;
            case "E": //get and start an existing game
                this.howToMove();
                break;
            case "R": // display the help menu
                this.complexPuzzles();
                break;
            default:
                ErrorView.display(this.getClass().getName(),"\nInvalid selection. Try again");
                break;
        }
        return false;
    }

    private void goalOfGame() {
        System.out.println("\ngoalOfGame() called");
    }

    private void howToMove() {
        System.out.println("\nhowToMove() called");
    }

    private void complexPuzzles() {
        System.out.println("\ncomplexPuzzles() called");
    }

}
