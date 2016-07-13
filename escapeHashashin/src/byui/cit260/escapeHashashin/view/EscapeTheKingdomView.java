/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.view;

/**
 *
 * @author Garen
 */
class EscapeTheKingdomView extends View {
    
    public EscapeTheKingdomView(){
        
        super("You hear the alarms being sound. You hear the cries of guards and the sceems"
                + " of party guests. You have escaped without anyone knowing. "
                + "Excellent Work.");
        
        
        
    }

    
    
    @Override
    public boolean doAction(String value) {
        this.console.print("The End");
     
return true;
    
    }
    
    
}
