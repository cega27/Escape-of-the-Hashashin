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
public class MainHallView extends View {
    
    public MainHallView() {
            super("\n -----------------------------"
                + "\n| Game Menu                  "
            + "\nZ- Display Map"
            + "\nX- Save Game"
            + "\nY- Weapons Inventory"
            + "\nW- Treasure Inventory"
            + "\nV- Key Inventory "
            + "\n -----------------------------"
                + "\n -----------------------------"
            + "\n Main Hall"
            + "\n -------------------------------------------------------------------------------"
            + "\n| As you walk into the Main hall you realized that there is a big celebration   |"
            + "\n| going on. People see you walking in and politely node at you as to aknowledge |"
            + "\n| your presence. Your outfit makes them think that you are just one more of the |"
            + "\n| many guests of invited. Try to blend in while avoiding raising suspicious, be |"
            + "\n| respectuful and try to find your way out.                                     |"
            + "\n -------------------------------------------------------------------------------\n"
            + "\nA - Barracks"
            + "\nB - Dance with a Lady"
            + "\nC - Drink Wine"
            + "\nQ - Quit"
            + "\n -----------------------------"
            + "\nPlease enter the Letter");
}
    
@Override
 public boolean doAction(String value) {

        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
             case "A": //create and start a new game
                this.barracks();
                break;
            case "B": //create and start a new game
                this.dance();
                break;
            case "C": //get and start an existing game
                this.drink();
                break;
            default:
                ErrorView.display(this.getClass().getName(),"\nInvalid selection. Try again");
                break;
        }
        return false;
    }

 private void barracks() {
       BaracksTwoView baracksTwoView = new BaracksTwoView();
       baracksTwoView.display();
}

 private void dance() {
        LadyConversationView ladyConversationView = new LadyConversationView();
        ladyConversationView.display();
}

private void drink() {
     System.out.println("\n --------------------------------------------"
                      + "\n| Bad luck! There is no more wine left!      |"
                      + "\n| You wouldn't want to get drunk anyways.    |"
                      + "\n --------------------------------------------");
}

}
