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
public class HallwayTwoView extends View {
    
    public HallwayTwoView(){
        super("\n -----------------------------"
                + "\n| Game Menu                  "
            + "\nZ- Display Map"
            + "\nX- Save Game"
            + "\nY- Weapons Inventory"
            + "\nW- Treasure Inventory"
            + "\nV- Key Inventory "
            + "\n -----------------------------"
                + "\n -----------------------------"
            + "\n Hallway"
            + "\n| You silenty close the door behind you. Even with your soft hands  |"
            + "\n| the door makes a thundering sound in your ears. Did someone hear? |"
            + "\n| The hallway seems empty, advace to the next room and be careful   |"
            + "\n| not to make too much noise.                                       |"
            + "\n -------------------------------------------------------------------\n"
            + "\nA - Go back to the King's Quarters"
            + "\nB - Balcony"
            + "\nQ - Quit"
            + "\n -----------------------------"
            + "\nPlease enter the Letter");
}
        
    
    
    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
            case "A": //create and start a new game
                this.kingsRoom();
                break;
            case "B":
                this.balcony();
                break;
               
            default:
                ErrorView.display(this.getClass().getName(), "\nInvalid selection. Try again");
                break;
        }
        return true;
    
    }

    

    private void kingsRoom() {
        BeginView beginView = new BeginView();
        beginView.display();
    }

    private void balcony() {
        BalconyView balconyView = new BalconyView();
        balconyView.display();
    }

      
}

