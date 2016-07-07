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
public class GobletControlException extends Exception {

    public GobletControlException() {
    }

    public GobletControlException(String message) {
        super(message);
    }

    public GobletControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public GobletControlException(Throwable cause) {
        super(cause);
    }

    public GobletControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
