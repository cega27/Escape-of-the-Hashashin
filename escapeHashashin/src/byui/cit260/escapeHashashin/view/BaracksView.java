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
class BaracksView extends View {
    
    public BaracksView(){
    
    
    super("\n -----------------------------"
                + "\n| Game Menu                  "
            + "\nZ- Display Map"
            + "\nX- Save Game"
            + "\nY- Weapons Inventory"
            + "\nW- Treasure Inventory"
            + "\nV- Key Inventory "
            + "\n -----------------------------"
                + "\n -----------------------------"
            +"\nBaracks"
            +"\nYou have stumbled into a hornets nest. These are the sleeping quarters "
            + "belonging to the royal guard. You're in luck, however. All guard detail "
            + "is being used tonight. Leave immediately."
                + "\nA - Kitchen"
                + "\nQ - Quit"
                + "\n -----------------------------"
                + "\nPlease enter the Letter");
    
    
}
    
     @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
            case "A": //create and start a new game
                this.kitchen();
                break;
            
               
            default:
                ErrorView.display(this.getClass().getName(), "\nInvalid selection. Try again");
                break;
        }
        return true;
    
    }

    private void kitchen() {
       KitchenView kitchenView = new KitchenView();
       kitchenView.display();
    }
    
}
