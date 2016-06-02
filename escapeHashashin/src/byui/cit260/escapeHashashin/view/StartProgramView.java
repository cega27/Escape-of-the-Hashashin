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
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView() {
         // promptMessage = "please enter your name"
         // display the banner when view is created
         this.promptMessage = "\nPlease enter your name";
         //display the banner when view is created
         this.displayBanner();
        }

    private void displayBanner() {
        System.out.println("\nWelcome to your world as an Assassin. Within history there have been"
                + "many assassins and this is your chance to partake in the killing. You are a"
                + "Hashashin. Hashashin is the world that our modern term assassin stems from. "
                + "Solve puzzles and escape the castle without being detected. Complete with the"
                + "most efficent and fastest time. Good Luck.");
    }
        }
    


