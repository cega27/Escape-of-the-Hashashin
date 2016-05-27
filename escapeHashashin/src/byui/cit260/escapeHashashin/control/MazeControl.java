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
public class MazeControl {
       
    public String calcMazeMath(double userNumber, double userAnswer){
    
        if (userNumber < 1 || userAnswer < 3.16 || userNumber > 50) {
            return "Error";
        }
        
        double multTen = userNumber * 10;
        double squareRt = Math.sqrt(multTen);
       double correctAnswer = Math.round(squareRt *100)/100.0;
        
        //double almostCorrect = Math.sqrt((10*userNumber));
        
        //double correctAnswer = Math.round(almostCorrect/100.0)*100.0;
        
   //     double almostAnswer = Math.sqrt((userNumber*2));
   //     double correctAnswer = Math.round((almostAnswer/100)*100.0);
        
        
        if (userAnswer == correctAnswer ){
            return "Correct";
            
        }
        else {
            return "Incorrect";
        
        }
        
        
                   
    }
    
}
