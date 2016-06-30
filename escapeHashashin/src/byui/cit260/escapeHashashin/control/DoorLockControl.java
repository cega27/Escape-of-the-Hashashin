/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.control;

import byui.cit260.escapeHashashin.exceptions.DoorLockControlException;

/**
 *
 * @author carlos
 */
public class DoorLockControl {
   
    public static String computeAnswer(double voltage, double resistance, double uAnswer)
                                    throws DoorLockControlException{
    
        if(voltage < 10 || resistance < 1 || voltage > 20 || resistance > 10){
            throw new DoorLockControlException("Error the Voltage or Resistance is invalid");
    }
        else{    
            double voltageP = Math.pow(voltage,2);
            double power = (voltageP/resistance);
            double cAnswer = Math.round(power *100)/100.0;
      
                if (cAnswer != uAnswer){
                    return "Incorrect";
                }
                else {
                    return "Correct";
                }
        }
    }

}
