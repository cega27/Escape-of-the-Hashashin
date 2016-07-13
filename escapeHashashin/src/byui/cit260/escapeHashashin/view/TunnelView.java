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
class TunnelView extends View {
    
    public TunnelView(){
        
        super("\n -----------------------------"
                + "\n| Game Menu                  "
            + "\nZ- Display Map"
            + "\nX- Save Game"
            + "\nY- Weapons Inventory"
            + "\nW- Treasure Inventory"
            + "\nV- Key Inventory "
            + "\n -----------------------------"
                + "\n -----------------------------"
            +"\nTunnel"
            +"\nYour height is to tall for the passage as you hunch down. The tunnel "
                + "is pitch black and you feel your way down the passage. After "
                + "a long journey you feel a wood door and see moonlight behind it."
                + "\nA - Outside Gate"
                + "\nB - Wine Cellar"
                + "\nQ - Quit"
                + "\n -----------------------------"
                + "\nPlease enter the Letter");
        
        
    }
    
    
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
            case "A": //create and start a new game
                this.outsideGate();
                break;
            case "B":
                this.wineCellar();
                break;
                
               
            default:
                ErrorView.display(this.getClass().getName(), "\nInvalid selection. Try again");
                break;
        }
        return true;
    
}

    private void outsideGate() {
        OutsideGateView outsideGateView = new OutsideGateView();
        outsideGateView.display();
    }

    private void wineCellar() {
        WineCellarView wineCellarView = new WineCellarView();
        wineCellarView.display();
    }
}
