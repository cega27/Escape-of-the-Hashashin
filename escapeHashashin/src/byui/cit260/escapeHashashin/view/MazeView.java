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
public class MazeView extends View{
 
    public MazeView() {
      
                     super("\n -----------------------------"
                + "\n| Game Menu                  "
                + "\nZ- Display Map"
                + "\nX- Save Game"
                + "\nY- Weapons Inventory"
                + "\nW- Treasure Inventory"
                + "\nV- Key Inventory "
                + "\n -----------------------------"
                + "\n -----------------------------"
                         + "\nWelcome to the Royal Gardens!\n"
                         + "| In front of you there is the Grand Maze believed to be the         |\n"
                         + "| most difficult maze ever created. But don't give up just yet.      |\n"
                         + "| At the entrance of the maze, there is a chest with a map to the    |\n"
                         + "| maze inside. To get the map you must use a key to open the chest   |\n"
                         + "| problem given to you. If you use the right key you will get the    |\n"
                         + "| map that will lead you through the maze and outside the walls of   |\n"
                         + "| the castle. Good luck!                                             |\n"
                         + " -------------------------------------------------------------------- \n"
                         + "\nA - Use Miss Ives' keys"
                         + "\nB - Look Around"
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
         System.out.println("\n ----------------------------------------------------"
                         + "\n| Great! After trying different keys, you found the   |"
                         + "\n| right one! You have the map now and with it getting |"
                         + "\n| through the maze will be easy.                      |"
                         + "\n ----------------------------------------------------");
        
         ShoreView shoreView = new ShoreView();
         shoreView.display();
    }

    private void rock() {
        System.out.println("\n -----------------------------------------------------"
                         + "\n| You walked around without any succes in finding the |"
                         + "\n| key. You only have one option now.                  |"
                         + "\n ----------------------------------------------------");
    }
    
}
