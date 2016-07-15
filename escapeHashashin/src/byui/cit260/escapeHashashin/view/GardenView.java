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
public class GardenView extends View{
    
       public GardenView(){
        
        super("\n -----------------------------"
                + "\n| Game Menu                  "
            + "\nZ- Display Map"
            + "\nX- Save Game"
            + "\nY- Weapons Inventory"
            + "\nW- Treasure Inventory"
            + "\nV- Key Inventory "
            + "\n -----------------------------"
                + "\n -----------------------------"
            +"\n"
                + "\n| A great gate protects the Royal Gardens from any unautorized |"
                + "\n| visitors. you have a set of keys that hopefully one of them  |"
                + "\n| is the key to open this great gate.                          |"
                + "\n --------------------------------------------------------------------"
        + "\nGarden Gate"
                + "\nA - Use keys"
                + "\nB - Use a rock to break the Lock"
                + "\nQ - Quit"
                + "\n -----------------------------"
                + "\nPlease enter the Letter");
        
        
        
    }
    
    
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
            case "A": //create and start a new game
                this.keys();
                break;
            case "B":
                this.rock();
                break;
            default:
                ErrorView.display(this.getClass().getName(), "\nInvalid selection. Try again");
                break;
        }
        return true;
    
    
    
    
    
}

    private void keys() {
        MazeControlView mazeControlView = new MazeControlView();
        mazeControlView.display();
    }

    private void rock() {
        System.out.println("\n ----------------------------------------------------"
                         + "\n| The lock is way to strong to be broken with a rock |"
                         + "\n| You might want to try the key instead              |"
                         + "\n ----------------------------------------------------");
    }
}
