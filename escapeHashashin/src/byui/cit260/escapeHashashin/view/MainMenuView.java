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
public class MainMenuView{

    
    private String promptMessage;
    private String menu;
   public MainMenuView() {
       this.promptMessage = 
            "\n -----------------------------"
            +"\n| Main Menu                   "
            +"\n -----------------------------"
            +"\nN - Start new game"
            +"\nG - Get and start saved game"
            +"\nH - Get help on how to play the game"
            +"\nS - Save game"
            +"\nQ - Quit"
            +"\n -----------------------------"
            + "\nPlease enter the Letter";
         
    
   }
    

    public void displayMainMenuView() {
        
        boolean done = false;
        do {
            //prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return; // exit the game
            
            //do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);
    }

    private String getMenuOption() {
       Scanner keyboard = new Scanner (System.in); // get infile for keyboard
       String value = ""; // value to be returned
       boolean valid = false; // initialize to not valid
       
       while (!valid) { //loop while an invlid value is entered
           System.out.println("\n" + this.promptMessage);
           
           value = keyboard.nextLine(); // get next line typed on keyboard
           value = value.trim(); //trim off leading and trailing blanks
         

         
           if (value.length() < 0) { // value is blank
               System.out.println("\nInvalid value: value can not be blank");
               continue;
           }
           break; //end loop
       }
       return value; //return the value entered
    }
    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice) {
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
            default:  
                System.out.println("\nInvalid selection. Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {
        
        GameControl.createNewGame(EscapeHashashin.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
        /*
        BEGIN
            create a new game
        
            create a new game menu view
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
        helpMenu.displayHelpMenuView();
    }

    private void saveGame() {
       System.out.println("saveGame() function called");
        

    }

   
    
}
