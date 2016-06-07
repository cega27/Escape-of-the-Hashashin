/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.view;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class ConversationMenuView {
    
      private String promptMessage;
    private String menu;
    public ConversationMenuView() {
       this.promptMessage = 
             "\n ------------------------------"
            +"\n| Conversation Menu                  |"
            +"\n ------------------------------"
            +"\nF - Response #1"
            +"\nS - Response #2"
            +"\nT - Response #3"
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
            case "F": //create and start a new game
                this.firstResponse();
                break;
            case "S": //get and start an existing game
                this.secondResponse();
                break;
            case "T": // display the help menu
                this.thirdResponse();
                break; 
            default:  
                System.out.println("\nInvalid selection. Try again");
                break;
        }
        return false;
    }
    
    private void firstResponse() {
        System.out.println("/nfirstResponse was called");
    }

    private void secondResponse() {
        System.out.println("/nsecondResponse was called");
    }

    private void thirdResponse() {
        System.out.println("/nthirdtResponse was called");
    }
    
}
