/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.control;

import byui.cit260.escapeHashashin.model.Game;
import byui.cit260.escapeHashashin.model.Item;
import byui.cit260.escapeHashashin.model.Map;
import byui.cit260.escapeHashashin.model.Player;
import byui.cit260.escapeHashashin.model.Scene;
import escapehashashin.EscapeHashashin;
import java.util.Collections;


/**
 *
 * @author Garen
 */
public class GameControl {

    public static Player createPlayer(String playersName) {
        if (playersName == null) {
            return null;
        }
        Player player = new Player();
        player.setName(playersName);

        EscapeHashashin.setPlayer(player);

        return player;
    }

    public static String getResponse(String responseNo) {
        System.out.println("\n *** getResponse() called ***");
        return "";
    }

    public static void createNewGame(Player player) {

        Game game = new Game(); // create new game
        game.setPlayer(player); // save player in game

        // create the inventory list and save in the game
        Item[] inventoryList = GameControl.createInventoryList();
        game.setItems(inventoryList);

        Map map = MapControl.createMap(); // create and initialize new map
        game.setMap(map); // save map in game

       
        EscapeHashashin.setCurrentGame(game); // save in EscapeHashashin

    }

    public static void startExistingGame(Game currentGame) {
        System.out.println("\nstartExistingGame() called");
    }

    public static void saveGame(Player player) {
        System.out.println("\nsaveGame() called");
    }

    public static void searchRoom(Player player) {
        System.out.println("searchRoom() called in GameControl class");
    }

    public static void assignScenesToLocations(Map map, Scene[] scenes) {
       System.out.println("assignScenesToLocations() called");
    }

    
    public enum InventoryItem{
    brokenGlass,
    dagger,
    arrowTip,
    heavyRock,
    smallChain;
    }
    
    

    public static Item[] createInventoryList() {
        // created array(list) of inventory items
        Item[] inventory = new Item[5];

        Item brokenGlass = new Item();
        brokenGlass.setDescription("Broken Glass");
        brokenGlass.setQuantityStock(0);
        inventory[InventoryItem.brokenGlass.ordinal()] = brokenGlass;

        Item dagger = new Item();
        dagger.setDescription("Dagger");
        dagger.setQuantityStock(0);
        inventory[InventoryItem.dagger.ordinal()] = dagger;

        Item arrowTip = new Item();
        arrowTip.setDescription("Arrow Tip");
        arrowTip.setQuantityStock(0);
        inventory[InventoryItem.arrowTip.ordinal()] = arrowTip;

        Item heavyRock = new Item();
        heavyRock.setDescription("Heavy Rock");
        heavyRock.setQuantityStock(0);
        inventory[InventoryItem.heavyRock.ordinal()] = heavyRock;

        Item smallChain = new Item();
        smallChain.setDescription("Small Chain");
        smallChain.setQuantityStock(0);
        inventory[InventoryItem.smallChain.ordinal()] = smallChain;
        
        

        return inventory;
        
    }
    public enum TreasureInventory{
    kingsGoblet,
    royalCrown,
    crownJewels,
    florentineDiamond;
    }
    
    public static Item[] createTreasureList(){
        
        Item[] treasure = new Item[4];
        
        Item kingsGoblet = new Item();
        kingsGoblet.setDescription("King's Goblet");
        kingsGoblet.setQuantityStock(0);
        treasure[TreasureInventory.kingsGoblet.ordinal()] = kingsGoblet;
        
        Item royalCrown = new Item();
        royalCrown.setDescription("Royal Crown");
        royalCrown.setQuantityStock(0);
        treasure[TreasureInventory.royalCrown.ordinal()] = royalCrown;
    
        Item crownJewels = new Item();
        crownJewels.setDescription("Crown Jewels");
        crownJewels.setQuantityStock(0);
        treasure[TreasureInventory.crownJewels.ordinal()] = crownJewels;
        
        Item florentineDiamond = new Item();
        florentineDiamond.setDescription("Florentine Diamond");
        florentineDiamond.setQuantityStock(0);
        treasure[TreasureInventory.florentineDiamond.ordinal()] = florentineDiamond;
    
        return treasure;
    }
    
    public enum KeyInventory{
     cooksKey;
     }
     
    public static Item[] createKeyList(){
     
        Item[] key = new Item[1];
        
        Item cooksKey = new Item();
        cooksKey.setDescription("Cook's Key");
        cooksKey.setQuantityStock(0);
        key[KeyInventory.cooksKey.ordinal()] = cooksKey;
        
        return key;
     }

}
