/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.control;

/**
 *
 * @author carlos
 */
public class lockControl {
    public String computeAnswer(double voltage, double resistance, double uAnswer){
        
        if(voltage < 10 || resistance < 1 || voltage > 20 || resistance > 10){
            return "Error";
        }
        else{
            double voltageP = Math.pow(voltage, 2);
            double power = voltageP / resistance;
            double powerDecimals = Math.round(power*100)/100.0;
            
            if(powerDecimals != uAnswer){
                return "Incorrect";
            }   
            else{
                return "Correct";
            }
        }      
    }
}
