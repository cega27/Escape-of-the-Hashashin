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
class C4ResponseC extends View {
    
    public C4ResponseC(){
        
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
            +"\n'More wine?! I swear the King will die of alcohol poisoning tonight.'"
                + "He reaches in and gives you a key. He immediately leaves and as you "
                + "turn to go you see another key on his desk. You take that just for "
                + "good measure."
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