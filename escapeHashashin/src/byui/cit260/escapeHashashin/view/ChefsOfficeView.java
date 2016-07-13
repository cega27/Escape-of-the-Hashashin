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
class ChefsOfficeView extends View {
    
    public ChefsOfficeView(){
        
        super("\n -----------------------------"
                + "\n| Game Menu                  "
            + "\nZ- Display Map"
            + "\nX- Save Game"
            + "\nY- Weapons Inventory"
            + "\nW- Treasure Inventory"
            + "\nV- Key Inventory "
            + "\n -----------------------------"
                + "\n -----------------------------"
            +"\nChef's Office"
            +"\nThe biggest night of the year is on the shoulders of this man, the Head "
                + "chef. He is so preoccupied he won't look you in the face. This "
                + "prove useful in aquiring information."
                + "\nA - Converse with the Head Cook"
                + "\nQ - Quit"
                + "\n -----------------------------"
                + "\nPlease enter the Letter");
        
        
        
        
    }
    
    
    
    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
            case "A": //create and start a new game
                this.conversation4();
                break;
    
               
            default:
                ErrorView.display(this.getClass().getName(), "\nInvalid selection. Try again");
                break;
        }
        return true;
    
    }

    private void conversation4() {
        Conversation4View conversation4View = new Conversation4View();
        conversation4View.display();
    }

    
    
    
    
    
    
    
}
