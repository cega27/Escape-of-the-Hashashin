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
 * @author carlos
 */
public class lockControlTest {
    
    public lockControlTest() {
    }

    /**
     * Test of computeAnswer method, of class lockControl.
     */
    @Test
    public void testComputeAnswer() {
        System.out.println("Test Case 1");
        double voltage = 10.0;
        double resistance = 4.0;
        double uAnswer = 25;
        lockControl instance = new lockControl();
        String expResult = "Correct";
        String result = instance.computeAnswer(voltage, resistance, uAnswer);
        assertEquals(expResult, result);
        
    //Test Case # 2
        System.out.println("Test Case 2");
        voltage = 11.0;
        resistance = 5.0;
        uAnswer = 25;
        expResult = "Incorrect";
        result = instance.computeAnswer(voltage, resistance, uAnswer);
        assertEquals(expResult, result);
        
    //Test Case # 3
        System.out.println("Test Case 3");
        voltage = 9.0;
        resistance = 3.0;
        uAnswer = 1;
        expResult = "Error";
        result = instance.computeAnswer(voltage, resistance, uAnswer);
        assertEquals(expResult, result);
        
    //Test Case # 4
        System.out.println("Test Case 4");
        voltage =11.0;
        resistance = 0.0;
        uAnswer = 1;
        expResult = "Error";
        result = instance.computeAnswer(voltage, resistance, uAnswer);
        assertEquals(expResult, result);
        
        
    //Test Case # 5
        System.out.println("Test Case 5");
        voltage = 21.0;
        resistance = 3.0;
        uAnswer = 1;
        expResult = "Error";
        result = instance.computeAnswer(voltage, resistance, uAnswer);
        assertEquals(expResult, result);
        
    //Test Case # 6
        System.out.println("Test Case 6");
        voltage = 12.0;
        resistance = 11.0;
        uAnswer = 1;
        expResult = "Error";
        result = instance.computeAnswer(voltage, resistance, uAnswer);
        assertEquals(expResult, result);
        
    //Test Case # 7
        System.out.println("Test Case 7");
        voltage = 10.0;
        resistance = 10.0;
        uAnswer = 10;
        expResult = "Correct";
        result = instance.computeAnswer(voltage, resistance, uAnswer);
        assertEquals(expResult, result);
        
    //Test Case # 8
        System.out.println("Test Case 8");
        voltage = 20.0;
        resistance = 1.0;
        uAnswer =400;
        expResult = "Correct";
        result = instance.computeAnswer(voltage, resistance, uAnswer);
        assertEquals(expResult, result);
    }
    
}