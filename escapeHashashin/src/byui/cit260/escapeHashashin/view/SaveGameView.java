/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.view;

import byui.cit260.escapeHashashin.control.GameControl;
import escapehashashin.EscapeHashashin;

/**
 *
 * @author Garen
 */
public class SaveGameView extends View {

    public SaveGameView() {
    }

    @Override
    public boolean doAction(String value) {
        
        this.console.println("\n\nEnter the file path for the file where the game"
                + "is to be saved.");
        String filePath = this.getInput();
        
        try {
            //save the game to the specified file
            GameControl.saveGame(EscapeHashashin.getCurrentGame(), filePath);
        }
        catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }

        
    
        
        
        
        
        String getAnswer = this.getInput();
        if (getAnswer.toUpperCase().equals("Q")) {

         }    
    return true; // exit the game}
   
}
}