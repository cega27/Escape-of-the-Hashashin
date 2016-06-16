/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.view;

import byui.cit260.escapeHashashin.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class ConversationMenuView extends View {

    public ConversationMenuView() {
       super("\n ------------------------------"
            +"\n| Conversation Menu           |"
            +"\n ------------------------------"
            +"\nF - Response #1"
            +"\nS - Response #2"
            +"\nT - Response #3"
            +"\nQ - Exit Conversation"  
            +"\n -----------------------------"
            + "\nPlease enter the Letter");       
    
   }

    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "F": //create and start a new game
                this.displayResponse(value);
                break;
            case "S": //get and start an existing game
                this.displayResponse(value);
                break;
            case "T": // display the help menu
                this.displayResponse(value);
                break; 
            default:  
                System.out.println("\nInvalid selection. Try again");
                break;
        }
        return false;
    }
    
    private void displayResponse(String responseNo) {
        String message = GameControl.getResponse(responseNo);
        System.out.println("\n" + message);
    }    
}
