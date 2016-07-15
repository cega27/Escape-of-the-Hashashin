/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.view;

/**
 *
 * @author carlos
 */
public class ShipView extends View{
    
        public ShipView(){
        
        super("\n ------------------------------------------"
            + "\n| As you padle away and get on the ship,   |"
            + "\n| You hear the alarms being sound. You     |"
            + "\n| hear the cries of guards and the sceems  |"
            + "\n| of party guests.                         |"
            + "\n| You have escaped without anyone knowing. |"
            + "\n| Excellent Work.                          |"
            + "\n ------------------------------------------\n");
        
        
        
    }

    
    
    @Override
    public boolean doAction(String value) {
        this.console.print("The End");
     
return true;
    
    }
    
    
}
