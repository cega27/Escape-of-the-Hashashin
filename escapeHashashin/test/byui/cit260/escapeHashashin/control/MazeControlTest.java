/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.control;

import byui.cit260.escapeHashashin.exceptions.MazeControlException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Garen
 */
public class MazeControlTest {
    
    public MazeControlTest() {
    }

    /**
     * Test of calcMazeMath method, of class MazeControl.
     */
    @Test
    public void testCalcMazeMath() throws MazeControlException {
        System.out.println("Test Case 1");
        double userNumber = 22;
        double userAnswer = 14.83;
        MazeControl instance = new MazeControl();
        String expResult = "Correct";
        String result = instance.calcMazeMath(userNumber, userAnswer);
        assertEquals(expResult, result);
        
        
        System.out.println("Test Case 2");
        userNumber = -1;
        userAnswer = -1;
        expResult = "Error";
        result = instance.calcMazeMath(userNumber, userAnswer);
        assertEquals(expResult, result);
        
        
        System.out.println("Test Case 3");
        userNumber = 0;
        userAnswer = 0;
        expResult = "Error";
        result = instance.calcMazeMath(userNumber, userAnswer);
        assertEquals(expResult, result);
        
        
        System.out.println("Test Case 4");
        userNumber = 1;
        userAnswer = 3.15;
        expResult = "Error";
        result = instance.calcMazeMath(userNumber, userAnswer);
        assertEquals(expResult, result);
      
        
        System.out.println("Test Case 5");
        userNumber = 1;
        userAnswer = 3.16;
        expResult = "Correct";
        result = instance.calcMazeMath(userNumber, userAnswer);
        assertEquals(expResult, result);
        
        
        System.out.println("Test Case 6");
        userNumber = 50;
        userAnswer = 22.36;
        expResult = "Correct";
        result = instance.calcMazeMath(userNumber, userAnswer);
        assertEquals(expResult, result);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
