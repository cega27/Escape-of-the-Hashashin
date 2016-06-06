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
public class HelpMenuView {
    
    private String promptMessage;
    private String menu;
    public HelpMenuView() {
       this.promptMessage = 
             "\n ------------------------------"
            +"\n| Help Menu                  |"
            +"\n ------------------------------"
            +"\nG - What is the goal of the game?"
            +"\nM - How to move"
            +"\nE - Using objects"
            +"\nR - Complex puzzles"
            +"\n -----------------------------"
            + "\nPlease enter the Letter";
         
    
   }
    

    public void displayHelpMenuView() {
        
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
                System.out.println("\nInvalid selection. Try again");
                break;
        }
        return false;
    }

    private void goalOfGame() {
       System.out.println("/ngoaGame was called");
    }

    private void howToMove() {
        System.out.println("/nhowToMove was called");
    }

    private void complexPuzzles() {
        System.out.println("/ncomplexPuzzles was called");
    } 
    
}
