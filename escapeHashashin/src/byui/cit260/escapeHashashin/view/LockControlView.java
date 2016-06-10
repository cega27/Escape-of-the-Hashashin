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
public class LockControlView {
    
  private String promptMessage;
    private String menu;
    public LockControlView() {
        this.displayBanner();
    }
        
         private void displayBanner() {
        System.out.println("\nThis door is locked, to be able to use the key you have, you must from 10 to 20\n"
                + "provide it with enough power for the lock to work. You will be promt for a number 'V' which\n"
                + "will represent the voltage, then another number 'R' from 1 to 10 which will represent the resistance.\n"
                + "Lastly the last number you will be prompted for is the answer 'P' of the equation using the numbers you have\n"
                + "selected. Use the following formula to solve the problem: P = V^2/R\n"
                + "If your formula is correct you will be able to open the door. GOOD LUCK!!!!\n");
    }
       this.promptVolt = 
             "\n ----------------------------------"
            +"\n| Use a number from 10 to 20       |"
            +"\n| Please enter the voltage 'V':    |"
            +"\n ----------------------------------\n";
               
       this.promptResist = 
             "\n ----------------------------------"
            +"\n| Use a number from 1 to 10        |"
            +"\n| Please enter the Resistance 'R': |"
            +"\n ----------------------------------\n";
       
       this.promptPower = 
             "\n ------------------------------"
            +"\n| Please enter the Power 'P': |"
            +"\n ------------------------------\n";

  
    }

    private static class promptVolt {

        public promptVolt() {
        }
    }

    private static class promptResist {

        public promptResist() {
        }
    }

    private static class promptPower {

        public promptPower() {
        }
    }
         
    
}