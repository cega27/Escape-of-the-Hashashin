/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.view;

import byui.cit260.escapeHashashin.control.DoorLockControl;
import java.util.Scanner;

import byui.cit260.escapeHashashin.control.HelpControl;
import escapehashashin.EscapeHashashin;
import java.util.Scanner;
import byui.cit260.escapeHashashin.view.GameMenuView;

/**
 *
 * @author carlos
 */
public class LockControlView extends View {

    private String promptVolt;
    private String promptResist;
    private String promptPower;
    

    public LockControlView() {
      
        System.out.println("\nThis door is locked, to be able to use the key you have, you must from select a number from 10 to \n"
                + "provide it with enough power for the lock to work. You will be promt for a number 'V' which\n"
                + "will represent the voltage, then another number 'R' from 1 to 10 which will represent the resistance.\n"
                + "Lastly the last number you will be prompted for is the answer 'P' of the equation using the numbers you have\n"
                + "selected. Use the following formula to solve the problem: P = V^2/R\n"
                + "If your formula is correct you will be able to open the door. GOOD LUCK!!!!\n");

        
        this.promptVolt
                = "\n ----------------------------------"
                + "\n| Use a number from 10 to 20       |"
                + "\n| Please enter the voltage 'V':    |"
                + "\n ----------------------------------\n";

        this.promptResist
                = "\n ----------------------------------"
                + "\n| Use a number from 1 to 10       |"
                + "\n| Please enter the Resistance 'R': |"
                + "\n ----------------------------------\n";

        this.promptPower
                = "\n ----------------------------------"
                + "\n|Enter Power:                      |"
                + "\n ----------------------------------\n";

        this.displayMessage = this.promptVolt;
    }

    @Override
    public boolean doAction(String volt) {
         //Get their userAnswer
        double voltage = Double.parseDouble(volt);
        
        this.displayMessage = this.promptResist;
        String getResist = this.getInput();
        
        double resistance = Double.parseDouble(getResist);
        
        this.displayMessage = this.promptPower;

        String getPower = this.getInput();
        double Answer = Double.parseDouble(getPower);
       
        String result = DoorLockControl.computeAnswer(voltage, resistance, Answer);
        return true;
    }  
}
