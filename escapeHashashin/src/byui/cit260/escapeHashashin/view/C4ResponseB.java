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
class C4ResponseB extends View {
    
    public C4ResponseB(){
        
        super("\n -----------------------------"
                + "\n| Game Menu                  "
            + "\nZ- Display Map"
            + "\nX- Save Game"
            + "\nY- Weapons Inventory"
            + "\nW- Treasure Inventory"
            + "\nV- Key Inventory "
            + "\n -----------------------------"
                + "\n -----------------------------"
            +"\nResponse"
            +"\n'I have told him a thousand times! Yeast needs to be measured!!!'"
                + "He walks towards you and your hands slip into his apron as he "
                + "brushes past you. You slip a key from his pocket without him knowing. "
                + "You close the door and open his desk drawer, retrieving another key."
        
                + "\nA - Wine Cellar"
                +"\nB - Chef's Office"
                + "\nQ - Quit"
                + "\n -----------------------------"
                + "\nPlease enter the Letter");
        
        
        
    }
    
    
    
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
            case "A": //create and start a new game
                this.wineCellar();
                break;
            case "B":
                this.chefsOffice();
                break;
                
               
            default:
                ErrorView.display(this.getClass().getName(), "\nInvalid selection. Try again");
                break;
        }
        return true;
        
        
    }

    private void wineCellar() {
        WineCellarView wineCellarView = new WineCellarView();
        wineCellarView.display();
    }

    private void chefsOffice() {
        ChefsOfficeView chefsOfficeView = new ChefsOfficeView();
        chefsOfficeView.display();
    }
    
    
    
}


