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
public class SearchRoomView extends View {

    public SearchRoomView() {

        super("\nYou have a choice of the following to search."
                + "\n 1- Chest"
                + "\n 2- Closet"
                + "\n 3- Cabinet");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
            case "1": //create and start a new game
                this.chest();
                break;
            case "2": //get and start an existing game
                this.closet();
                break;
            case "3": // display the help menu
                this.cabinet();
                break;
            default:
                System.out.println("\nInvalid selection. Try again");
                break;
        }
        return true;

    }

    private void chest() {
        System.out.println("chest() function called");
    }

    private void closet() {
        System.out.println("closet() function called");
    }

    private void cabinet() {
        System.out.println("cabinet() function called");
    }

}
