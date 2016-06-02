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
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView() {
         // promptMessage = "please enter your name"
         // display the banner when view is created
         this.promptMessage = "\nPlease enter your name";
         //display the banner when view is created
         this.displayBanner();
        }

    
        
        private void displayBanner() {
        System.out.println("\nWelcome to your world as an Assassin. Within history there have been\n"
                + "many assassins and this is your chance to partake in the killing. You are a\n"
                + "Hashashin. Hashashin is the word that our modern term assassin stems from.\n"
                + "Solve puzzles and escape the castle without being detected. Complete with the\n"
                + "most efficent and fastest time. Good Luck.");
    }

    
        
        public void displayStartProgramView() {
        
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) //user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(playersName);
            
        } while (!done);
        
        /*
        do
            Prompt for and get the players name
            if (playersName == "Q" then
                exit
            
            do the action and display the next view
        while the action is not successful
        */
      
    
       
        }

       private String getPlayersName() {
           
       Scanner keyboard = new Scanner (System.in); // get infile for keyboard
       String value = ""; // value to be returned
       boolean valid = false; // initialize to not valid
       
       while (!valid) { //loop while an invlid value is entered
           System.out.println("\n" + this.promptMessage);
           
           value = keyboard.nextLine(); // get next line typed on keyboard
           value = value.trim(); //trim off leading and trailing blanks
           
           if (value.length() < 1) { // value is blank
               System.out.println("\nInvalid value: value can not be blank");
               continue;
           }
           break; //end loop
       }
       return value; //return the value entered
    }

        private boolean doAction(String playersName) {
        
        

        if (playersName.length() < 2){
            System.out.println("\nInvlaid players name: " + "This name must be greater than one character in length");
            return false;
    }

        Player player = GameControl.createPlayer(playersName);

        if (player == null) {
        System.out.println("Error creating the player.");
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
        System.out.println("\n==================================="
                            + "\n Welcome to the game " + player.getName()
                            + "\n We hope you have a lot of fun!"
                            + "\n=================================="
                            );
        
        MainMenuView mainMenuView = new MainMenuView();
            
        mainMenuView.displayMainMenuView();
    }
}

         //END
    
