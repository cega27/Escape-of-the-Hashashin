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
public class MazeControlException extends Exception {

    public MazeControlException() {
    }

    public MazeControlException(String message) {
        super(message);
    }

    public MazeControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public MazeControlException(Throwable cause) {
        super(cause);
    }

    public MazeControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
