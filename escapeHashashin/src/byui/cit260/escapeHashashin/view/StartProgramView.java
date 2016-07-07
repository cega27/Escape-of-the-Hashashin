/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.view;

import byui.cit260.escapeHashashin.control.GameControl;
import byui.cit260.escapeHashashin.model.Player;
import java.util.Scanner;

/**
 *
 * @author Garen
 */
public class StartProgramView extends View {

    public StartProgramView() {

        super("\nPlease enter your name");
        //display the banner when view is created
        this.displayBanner();
    }

    private void displayBanner() {
        this.console.println("\nWelcome to your world as an Assassin. Within history there have been\n"
                + "many assassins and this is your chance to partake in the killing. You are a\n"
                + "Hashashin. Hashashin is the word that our modern term assassin stems from.\n"
                + "Solve puzzles and escape the castle without being detected. Complete with the\n"
                + "most efficent and fastest time. Good Luck.");
    }

    public boolean doAction(String playersName) {

        if (playersName.length() < 2) {
            ErrorView.display(this.getClass().getName(),"\nInvlaid players name: " + "This name must be greater than one character in length");
            return false;
        }

        Player player = GameControl.createPlayer(playersName);

        if (player == null) {
            ErrorView.display(this.getClass().getName(),"Error creating the player.");
            return false;
        }
        this.displayNextView(player);

        /*
        if the length of the playersName < 2 then 
        display "Invalid name: The name must be > 1 character"
        return false

        create Player with specified name
        if unsuccessful then display "Invalid name: The name is too short"
        return false
        
      //  display customized welcome message
     
        display mainMenuView
        return true
         */
        return true;
    }

    private void displayNextView(Player player) {
        this.console.println("\n==================================="
                + "\n Welcome to the game " + player.getName()
                + "\n We hope you have a lot of fun!"
                + "\n=================================="
        );

        MainMenuView mainMenuView = new MainMenuView();

        mainMenuView.display();
    }
}

//END

