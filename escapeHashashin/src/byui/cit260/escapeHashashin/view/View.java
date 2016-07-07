/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.view;

import escapehashashin.EscapeHashashin;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

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
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid

        while (!valid) { //loop while an invlid value is entered
            System.out.println("\n" + this.displayMessage);

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

}
