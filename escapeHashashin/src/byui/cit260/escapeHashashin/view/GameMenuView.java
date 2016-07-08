package byui.cit260.escapeHashashin.view;

import byui.cit260.escapeHashashin.control.GameControl;
import byui.cit260.escapeHashashin.control.MapControl;
import byui.cit260.escapeHashashin.model.Game;
import byui.cit260.escapeHashashin.model.Item;
import byui.cit260.escapeHashashin.model.Location;
import byui.cit260.escapeHashashin.model.Map;
import escapehashashin.EscapeHashashin;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Garen
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super(
                "\n -----------------------------"
                + "\n| Game Menu                   "
                + "\n -----------------------------"
                + "\nA - Advance Forward"
                + "\nS - Go Back"
                + "\nD - Hide"
                + "\nF - Right Room"
                + "\nG - Left Room"
                + "\nH - Assassinate"
                + "\nJ - Map"
                + "\nK - Search Room"
                + "\nL - Save Game"
                + "\nZ - Weapons Inventory"
                + "\nX - Treasure Inventory"
                + "\nC - Key Inventory"
                + "\nQ - Quit"
                + "\n -----------------------------"
                + "\nPlease enter the Letter");

    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
            case "A": //create and start a new game
                this.advanceForward();
                break;
            case "S": //get and start an existing game
                this.goBack();
                break;
            case "D": // display the help menu
                this.playerHide();
                break;
            case "F": //save the current game
                this.rightRoom();
                break;
            case "G": //create and start a new game
                this.leftRoom();
                break;
            case "H": //get and start an existing game
                this.playerAssassinate();
                break;
            case "J": // display the help menu
                this.displayMap();
                break;
            case "K": //save the current game
                this.searchRoom();
                break;
            case "L": //get and start an existing game
                this.saveGame();
                break;
            case "Z": // display the help menu
                this.Inventory();
                break;
            case "X": //save the current game
                this.treasureInventory();
                break;
            case "C": //sa
                this.keyInventory();
                break;
            default:
                System.out.println("\nInvalid selection. Try again");
                break;
        }
        return true;

    }

    private void advanceForward() {
        System.out.println("\nadvanceForward() function called");
    }

    private void goBack() {
        System.out.println("\ngoBack() function called");
    }

    private void playerHide() {
        HideView hideView = new HideView();
        hideView.display();
    }

    private void rightRoom() {
        System.out.println("\nrightRoom() function called");
    }

    private void leftRoom() {
        System.out.println("\nleftRoom() function called");
    }

    private void playerAssassinate() {
        System.out.println("\nplayerAssassinate() function called");
    }

    private void displayMap() {
        Game game = new Game();
        game = EscapeHashashin.getCurrentGame();

        Map map = new Map();
        map = EscapeHashashin.getCurrentGame().getMap();

        Location[][] locations = map.getLocations();
        System.out.print("\n Escape Of the Hashashin \n");
        System.out.printf("%-3.5s %-4.5s %-4.5s %-4.5s %-4.5s %-4.5s \n", " ", "0 ", "1 ", "2 ","3 ","4"); 
       
                
        for (int i = 0; i < locations.length; i++) {
            System.out.print("\n" + String.valueOf(i) + " | ");
            for(int k = 0; k < locations[i].length; k++) {
                
                System.out.print(locations[i][k].getScene().getDisplaySymbol() + " | ");
                
            }
            
            
            System.out.println(" ");
                    
            

        }

        //Location[] [] locations 
    }

    private void searchRoom() {

        SearchRoomView searchRoomView = new SearchRoomView();
        searchRoomView.display();
    }

    private void saveGame() {
        System.out.println("\nsaveGame() function called");
    }

    private void Inventory() {
        StringBuilder line;

        Game game = EscapeHashashin.getCurrentGame();
        Item[] inventory = game.getItems();

        System.out.println("\n Weapon Inventory Items");
        line = new StringBuilder("                                   ");
        line.insert(0, "Description");
        line.insert(20, "In Stock");
        System.out.println(line.toString());

        //for each inventory item
        for (Item item : inventory) {
            line = new StringBuilder("                                ");
            line.insert(0, item.getDescription());
            line.insert(23, item.getQuantityStock());

            // display the line
            System.out.println(line.toString());

        }

    }

    private void treasureInventory() {
        StringBuilder line;

        Game game = EscapeHashashin.getCurrentGame();
        Item[] treasure = game.getItems();

        System.out.println("\n Treasure Inventory Items");
        line = new StringBuilder("                                   ");
        line.insert(0, "Description");
        line.insert(20, "In Stock");
        System.out.println(line.toString());

        //for each inventory item
        for (Item item : treasure) {
            line = new StringBuilder("                                ");
            line.insert(0, item.getDescription());
            line.insert(23, item.getQuantityStock());

            // display the line
            System.out.println(line.toString());
               
        }
    }

    private void keyInventory() {
        System.out.println("\nkeyInventory() function called");
    }

    public void displayGameMenuView() {
        System.out.println("\ndisplayGameMenuView");
    }
}
