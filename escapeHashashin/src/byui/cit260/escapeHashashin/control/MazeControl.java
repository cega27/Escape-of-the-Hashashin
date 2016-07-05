/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.control;

import byui.cit260.escapeHashashin.exceptions.MazeControlException;

/**
 *
 * @author Garen
 */
public class MazeControl {
       
    public static String calcMazeMath(double userNumber, double userAnswer)
                            throws MazeControlException{
    
        if (userNumber < 1 || userAnswer < 3.16 || userNumber > 50) {
            throw new MazeControlException("Incorrect the number you entered is\n"
                                         + "invalid or is not the right answer. Please enter your number again.");
        }
        
        double multTen = userNumber * 10;
        double squareRt = Math.sqrt(multTen);
       double correctAnswer = Math.round(squareRt *100)/100.0;
          
        if (userAnswer == correctAnswer ){
            return "Correct";
            
        }
        else {
            return "Incorrect";
        
        }
        
        
                   
    }
    
}
