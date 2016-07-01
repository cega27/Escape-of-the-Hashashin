/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.exceptions;

/**
 *
 * @author carlos
 */
public class DoorLockControlException extends Exception {

    public DoorLockControlException() {
    }

    public DoorLockControlException(String message) {
        super(message);
    }

    public DoorLockControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public DoorLockControlException(Throwable cause) {
        super(cause);
    }

    public DoorLockControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
