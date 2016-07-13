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
                + "\nM - How to play"
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
            case "M": //get and start an existing game
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
        System.out.println("\n -------------------------GOAL OF THE GAME----------------------------------"
                         + "\n| The game starts at the King's room where your Hashashin just killed       |"
                         + "\n| the evil king.                                                            |"
                         + "\n| The Goal of the game is to help your Hashashin escape from the castle     |"
                         + "\n| without being caught and killed. You will interact with different people, |"
                         + "\n| and in every instance ypu will be given the opportunity choose what to do |"
                         + "\n| next. Be wise at choosing what to do next because every decision you make |"
                         + "\n| will either help you scape or  get you killed. Good Luck!                 |"
                         + "\n ---------------------------------------------------------------------------");
    }

    private void howToMove() {
        System.out.println("\n --------------------------HOW TO PLAY--------------------------"
                         + "\n| In the game you will be given different options to choose     |"
                         + "\n| what to do next. Each option will be represented by a letter  |"
                         + "\n| Read each option and choose the letter that                   |"
                         + "\n| represents your selection. The game is not case sensitive so  |"
                         + "\n| you can enter the letters in lower case or upper case.        |"
                         + "\n| Enjoy the game and good luck!                                 |"
                         + "\n ---------------------------------------------------------------");
    }

    private void complexPuzzles() {
        System.out.println("\n ------------------------COMPLEX PUZZLES------------------------"
                         + "\n| ");
    }

}
