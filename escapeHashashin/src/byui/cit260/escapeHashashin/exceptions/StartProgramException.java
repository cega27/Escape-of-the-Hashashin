/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.exceptions;

/**
 *
 * @author Garen
 */
public class StartProgramException extends Exception {

    public StartProgramException() {
    }

    public StartProgramException(String message) {
        super(message);
    }

    public StartProgramException(String message, Throwable cause) {
        super(message, cause);
    }

    public StartProgramException(Throwable cause) {
        super(cause);
    }

    public StartProgramException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
