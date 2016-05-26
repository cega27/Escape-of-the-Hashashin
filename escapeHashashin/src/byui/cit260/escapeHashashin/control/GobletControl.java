/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.control;

/**
 *
 * @author Garen
 */
public class GobletControl {
    
    public String calcGobletMath(double userNumber, double userAnswer){
    
        if(userNumber < 2 || userAnswer > userNumber || userNumber > 10)
            return "Error";
        
    //    double powAnswer = Math.pow(userNumber, 5);
      //  double logAnswer = Math.log(powAnswer);
      //  double correctAnswer = Math.round(logAnswer*100)/100.0;
        
        double powAnswer = Math.pow(userNumber,5);
        double logAnswer = Math.log10(powAnswer);
       double correctAnswer = Math.round(logAnswer *100)/100.0;
      
      
      
        if (userAnswer == correctAnswer){
            return "Correct";
                    }
        else {
            return "Incorrect";
        }
        }
    }

