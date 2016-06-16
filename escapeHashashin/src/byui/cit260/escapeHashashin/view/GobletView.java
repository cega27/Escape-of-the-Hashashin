/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.view;

import byui.cit260.escapeHashashin.control.GobletControl;
import escapehashashin.EscapeHashashin;
import java.util.Scanner;

/**
 *
 * @author Garen
 */
public class GobletView extends View {

    

    public GobletView() {
        // promptMessage = "please enter your name"
        // display the banner when view is created
        //this.promptMessage = "\nPlease enter your name";
        //display the banner when view is created
        super("\nAn assortment of Goblets lay before you. To ensure the safety"
                + "\nof the royal goblet, they have crafted many others that look just like it."
                + "\nYou have gained the knowledge of the secret formula to identify the correct"
                + "\ngoblet. You must pick any number of your choosing that is between 2-10. Take"
                + "\nthis number and find your number to the power of 5. You must then find the log"
                + "\nbased 10 of that number. Your correct answer will show the true goblet"
                + "\nEnter your desired number.");
    }

    private String promptMessage;

    public boolean doAction(String userNumber) {

        //Get their userAnswer
        this.promptMessage = "Enter your Answer";

        String getAnswer = this.getInput();
        if (getAnswer.toUpperCase().equals("Q")) {

            return true; // exit the game}

        }
        double uAnswer = Double.parseDouble(getAnswer);

        //Call control function to compare the correct answer with their answer
        GobletControl.calcGobletMath(0, uAnswer);

        //Print out message of either "correct" return True
        //Else "incorrect" return false
        //if (uAnswer == GobletControl.calcGobletMath(uAnswer, uAnswer) )
        //   return "Correct";
        //else if {
        //  return "Incorrect"
        return true;

    }

}
