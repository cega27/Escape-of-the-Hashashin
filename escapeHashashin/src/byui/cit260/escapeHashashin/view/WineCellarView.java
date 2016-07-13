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
class WineCellarView extends View {
    
    public WineCellarView(){
    
    super("\n -----------------------------"
                + "\n| Game Menu                  "
            + "\nZ- Display Map"
            + "\nX- Save Game"
            + "\nY- Weapons Inventory"
            + "\nW- Treasure Inventory"
            + "\nV- Key Inventory "
            + "\n -----------------------------"
                + "\n -----------------------------"
            +"\nWine Cellar"
            +"\nWine Cellars are notorious for silent and cold spaces. You feel "
            + "the hope of escape as this feeling reminds you of outside. You comb"
            + " past racks full of bottles. Nothing. You check barrels at the very "
            + "end but fail. You feel all is lost as you slide down the wall and sit "
            + "on the cold ground. Through a gap you see a large crack in the wall. You "
            + "investigate and pull the barrels out. You have found the lock."
                + "\nA - Tunnel"
            + "\nB - Chef's Office"
            + "\nC - Lock"
                + "\nQ - Quit"
                + "\n -----------------------------"
                + "\nPlease enter the Letter");
        
        
        
    }
    
    
    
        
    
    
    
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
            case "A": //create and start a new game
                this.tunnel();
                break;
            case "B":
                this.chefsOffice();
                break;
            case "C":
                this.lock();
                break;
                
               
            default:
                ErrorView.display(this.getClass().getName(), "\nInvalid selection. Try again");
                break;
        }
        return true;
        
        
    }

    private void tunnel() {
        TunnelView tunnelView = new TunnelView();
        tunnelView.display();
    }

    private void chefsOffice() {
       ChefsOfficeView chefsOfficeView = new ChefsOfficeView();
        chefsOfficeView.display();
    }

    private void lock() {
        LockControlView lockControlView = new LockControlView();
        lockControlView.display();
    }
}