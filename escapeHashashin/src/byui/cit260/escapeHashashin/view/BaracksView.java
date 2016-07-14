/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.view;

import byui.cit260.escapeHashashin.control.GameControl;
import byui.cit260.escapeHashashin.model.Game;
import byui.cit260.escapeHashashin.model.Item;
import byui.cit260.escapeHashashin.model.Location;
import byui.cit260.escapeHashashin.model.Map;
import escapehashashin.EscapeHashashin;

/**
 *
 * @author Garen
 */
class BaracksView extends View {

    public BaracksView() {

        super("\n -----------------------------"
                + "\n| Game Menu                  "
                + "\nZ- Display Map"
                + "\nX- Save Game"
                + "\nY- Weapons Inventory"
                + "\nW- Treasure Inventory"
                + "\nV- Key Inventory "
                + "\n -----------------------------"
                + "\n -----------------------------"
                + "\nBaracks"
                + "\nYou have stumbled into a hornets nest. These are the sleeping quarters "
                + "\nbelonging to the royal guard. You're in luck, however. All guard detail "
                + "\nis being used tonight. Leave immediately."
                + "\nA - Kitchen"
                + "\nQ - Quit"
                + "\n -----------------------------"
                + "\nPlease enter the Letter");

    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
            
            
            case "Z": //create and start a new game
                this.displayMap();
                break;
            case "X": //create and start a new game
                this.saveGame();
                break;
            case "Y": //create and start a new game
                this.Inventory();
                break;
            case "W": //create and start a new game
                this.treasureInventory();
                break;
            case "V": //create and start a new game
                this.keyInventory();
                break;
            
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

    private void displayMap() {
        Game game = new Game();
        game = EscapeHashashin.getCurrentGame();

        Map map = new Map();
        map = EscapeHashashin.getCurrentGame().getMap();

        Location[][] locations = map.getLocations();
        this.console.print("\n Escape Of the Hashashin \n");
        this.console.printf("%-3.5s %-4.5s %-4.5s %-4.5s %-4.5s %-4.5s \n", " ", "0 ", "1 ", "2 ", "3 ", "4");

        for (int i = 0; i < locations.length; i++) {
            this.console.print("\n" + String.valueOf(i) + " | ");
            for (int k = 0; k < locations[i].length; k++) {

                this.console.print(locations[i][k].getScene().getDisplaySymbol() + " | ");

            }

            this.console.println(" ");

        }

        //Location[] [] locations 
    }

    private void saveGame() {
        //prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for the file where the game"
                + "is to be saved.");
        String filePath = this.getInput();

        try {
            //save the game to the specified file
            GameControl.saveGame(EscapeHashashin.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }

    }

    private void Inventory() {
        StringBuilder line;

        Game game = EscapeHashashin.getCurrentGame();
        Item[] inventory = game.getItems();

        this.console.println("\n Weapon Inventory Items");
        line = new StringBuilder("                                   ");
        line.insert(0, "Description");
        line.insert(20, "In Stock");
        this.console.println(line.toString());

        //for each inventory item
        for (Item item : inventory) {
            line = new StringBuilder("                                ");
            line.insert(0, item.getDescription());
            line.insert(23, item.getQuantityStock());

            // display the line
            this.console.println(line.toString());

        }

    }

    private void treasureInventory() {
        StringBuilder line;

        Game game = EscapeHashashin.getCurrentGame();
        Item[] treasures = game.getTreasures();

        System.out.println("\n Treasure Inventory Items");
        line = new StringBuilder("                                   ");
        line.insert(0, "Description");
        line.insert(20, "In Stock");
        System.out.println(line.toString());

        //for each inventory item
        for (Item item : treasures) {
            line = new StringBuilder("                                ");
            line.insert(0, item.getDescription());
            line.insert(23, item.getQuantityStock());

            // display the line
            System.out.println(line.toString());

        }
    }

    private void keyInventory() {
        StringBuilder line;

        Game game = EscapeHashashin.getCurrentGame();
        Item[] key = game.getKey();

        this.console.println("\n Key Inventory Items");
        line = new StringBuilder("                                   ");
        line.insert(0, "Description");
        line.insert(20, "In Stock");
        System.out.println(line.toString());

        //for each inventory item
        for (Item item : key) {
            line = new StringBuilder("                                ");
            line.insert(0, item.getDescription());
            line.insert(23, item.getQuantityStock());

            // display the line
            System.out.println(line.toString());
        }

    }
}
