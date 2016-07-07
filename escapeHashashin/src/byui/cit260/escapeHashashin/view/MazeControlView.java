/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.view;

import byui.cit260.escapeHashashin.control.MazeControl;
import byui.cit260.escapeHashashin.exceptions.MazeControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlos
 */
 
public class MazeControlView extends View{
    
    private String promptNumber;
    private String promptUserAnswer;
    public MazeControlView() {
      
        this.console.println("\nWelcome to the Royal Gardens!\n"
                         + "In front of you there is the Grand Maze believed to be the\n"
                         + "most difficult maze ever created. But don't give up just yet.\n"
                         + "At the entrance of the maze, there is a chest with a map to the\n"
                         + "maze inside. To get the map you must solve the matematical\n"
                         + "problem given to you. If you get the right answer you will get the\n"
                         + "map that will lead you through the maze and outside the walls of\n"
                         + "the castle. Good luck!\n");
        
        this.promptNumber
                = "   ----------------------------------"
                + "\n| Use a number from 1 to 50        |"
                + "\n| Please enter your number to be   |"
                + "\n| multiplied by 10:                |"
                + "\n ----------------------------------\n";

        this.promptUserAnswer
                = "\n ----------------------------------------"
                + "\n| Your number has been multiplied by 10. |"
                + "\n| Enter the square root of your number   |"
                + "\n| after it's been multiplied by 10:      |"
                + "\n ----------------------------------------\n";
        
        this.displayMessage = this.promptNumber;
    
}

    @Override
    public boolean doAction(String number){
         //Get their volt
        double userNumber = Double.parseDouble(number);
        
        this.displayMessage = this.promptUserAnswer;
        String getAnswer = this.getInput();
        
        double userAnswer;
        userAnswer = Double.parseDouble(getAnswer);
        

        
        try {
            if (MazeControl.calcMazeMath(userNumber, userAnswer) == "Correct"){
                return true;
            }
            else if (MazeControl.calcMazeMath(userNumber, userAnswer) == "Incorrect") {
                return false;   
            }
        } catch (MazeControlException ex) {
           this.console.println(ex.getMessage());
        }  
        return true;   
    }
    
}
