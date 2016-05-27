/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Garen
 */
public class GobletControlTest {
    
    public GobletControlTest() {
    }

    /**
     * Test of calcGobletMath method, of class GobletControl.
     */
    @Test
    public void testCalcGobletMath() {
        System.out.println("Test Case 1");
        double userNumber = 6;
        double userAnswer = 3.89;
        GobletControl instance = new GobletControl();
        String expResult = "Correct";
        String result = instance.calcGobletMath(userNumber, userAnswer);
        assertEquals(expResult, result);
       
        
        System.out.println("Test Case 2");
        userNumber = 1;
        userAnswer = 0;
        expResult = "Error";
        result = instance.calcGobletMath(userNumber, userAnswer);
        assertEquals(expResult, result);
        
        
        System.out.println("Test Case 3");
        userNumber = 5;
        userAnswer = 6;
        expResult = "Error";
        result = instance.calcGobletMath(userNumber, userAnswer);
        assertEquals(expResult, result);
        
        
        System.out.println("Test Case 4");
        userNumber = 11;
        userAnswer = 5.21;
        expResult = "Error";
        result = instance.calcGobletMath(userNumber, userAnswer);
        assertEquals(expResult, result);
        
        
        System.out.println("Test Case 5");
        userNumber = 2;
        userAnswer = 1.51;
        expResult = "Correct";
        result = instance.calcGobletMath(userNumber, userAnswer);
        assertEquals(expResult, result);
        
        
        System.out.println("Test Case 6");
        userNumber = 10;
        userAnswer = 5;
        expResult = "Correct";
        result = instance.calcGobletMath(userNumber, userAnswer);
        assertEquals(expResult, result);
        
        
        
        
        
        
    }
    
}
