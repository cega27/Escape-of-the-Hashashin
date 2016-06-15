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
public class GobletView {

    private String promptMessage;

    public GobletView() {
        // promptMessage = "please enter your name"
        // display the banner when view is created
        //this.promptMessage = "\nPlease enter your name";
        //display the banner when view is created
        this.displayBanner();
    }

    private void displayBanner() {
        this.promptMessage = "\nAn assortment of Goblets lay before you. To ensure the safety"
                + "\nof the royal goblet, they have crafted many others that look just like it."
                + "\nYou have gained the knowledge of the secret formula to identify the correct"
                + "\ngoblet. You must pick any number of your choosing that is between 2-10. Take"
                + "\nthis number and find your number to the power of 5. You must then find the log"
                + "\nbased 10 of that number. Your correct answer will show the true goblet"
                + "\nEnter your desired number.";
    }

    public void displayGobletView() {

        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String getInput = this.getInput();
            if (getInput.toUpperCase().equals("Q")) {
                return; // exit the game
            }
            // do the requested action and display the next view
            done = this.doAction(getInput);

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

    private String getInput() {

        Scanner keyboard = new Scanner(System.in);

        System.out.println(this.promptMessage);
        String value = keyboard.nextLine();

        if (value.length() < 0) { // value is blank
            System.out.println("\nInvalid value: value can not be less than 2");

            double uNumber = Double.parseDouble(value);
        }
        
        return value; //return the value entered
    }

    private boolean doAction(String userNumber) {

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
