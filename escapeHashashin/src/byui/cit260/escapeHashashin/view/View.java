/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.view;

import escapehashashin.EscapeHashashin;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Garen
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;
    
    protected final BufferedReader keyboard = EscapeHashashin.getInFile();
    protected final PrintWriter console = EscapeHashashin.getOutFile();

    public View() {
    }

    public View(String message) {
        this.displayMessage = message;

    }

    @Override
    public void display() {

        boolean done = false;
        do {
            //prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) {
                return; // exit the game
            }
            //do the requested action and display the next view
            done = this.doAction(value);

        } while (!done);
    }

    @Override
    public String getInput() {
     
        String value = null; // value to be returned
        boolean valid = false; // initialize to not valid

        while (!valid) { //loop while an invlid value is entered
            this.console.println("\n" + this.displayMessage);

            try {
                value = this.keyboard.readLine(); // get next line typed on keyboard
            } catch (IOException ex) {
                this.console.println(ex.getMessage());
            }
            value = value.trim(); //trim off leading and trailing blanks

            if (value.length() < 1) { // value is blank
                ErrorView.display(this.getClass().getName(),"\nInvalid value: value can not be blank");
                continue;
            }
            break; //end loop
        }
        return value; //return the value entered
    }

}
