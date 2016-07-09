/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.control;

import byui.cit260.escapeHashashin.exceptions.GameControlException;
import byui.cit260.escapeHashashin.model.Game;
import byui.cit260.escapeHashashin.model.Item;
import byui.cit260.escapeHashashin.model.Map;
import byui.cit260.escapeHashashin.model.Player;
import byui.cit260.escapeHashashin.model.Scene;
import byui.cit260.escapeHashashin.view.ErrorView;
import byui.cit260.escapeHashashin.view.GameMenuView;
import java.io.BufferedReader;
import java.io.PrintWriter;
import byui.cit260.escapeHashashin.view.View;
import escapehashashin.EscapeHashashin;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
        
        Item[] treasureList = GameControl.createTreasureList();
        game.setTreasures(treasureList);
        
        Item[] keyList = GameControl.createKeyList();
        game.setKey(keyList);

        Map map = MapControl.createMap(); // create and initialize new map
        game.setMap(map); // save map in game

        EscapeHashashin.setCurrentGame(game); // save in EscapeHashashin

    }

    public void startSavedGame(Game currentGame) {
        System.out.println("startSavedGame() called");
    }

    

    public static void searchRoom(Player player) {
        System.out.println("searchRoom() called in GameControl class");
    }

    public static void assignScenesToLocations(Map map, Scene[] scenes) {
        System.out.println("assignScenesToLocations() called");
    }

    public static void saveGame(Game currentGame, String filePath)
            throws GameControlException {
        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            Object game = null;
            

            output.writeObject(game); // write the game object out to file
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getSavedGame(String filePath)
            throws GameControlException {

        Game game = null;

        try (
                FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);

            game = (Game) input.readObject(); //read the game object from file

        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }

        //close the output file
        EscapeHashashin.setCurrentGame(game); // save in EscapeHashashin

    }

    public enum InventoryItem {
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
        
        Item[] treasures = new Item[4];
        
        Item kingsGoblet = new Item();
        kingsGoblet.setDescription("King's Goblet");
        kingsGoblet.setQuantityStock(0);
        treasures[TreasureInventory.kingsGoblet.ordinal()] = kingsGoblet;
        
        Item royalCrown = new Item();
        royalCrown.setDescription("Royal Crown");
        royalCrown.setQuantityStock(0);
        treasures[TreasureInventory.royalCrown.ordinal()] = royalCrown;
    
        Item crownJewels = new Item();
        crownJewels.setDescription("Crown Jewels");
        crownJewels.setQuantityStock(0);
        treasures[TreasureInventory.crownJewels.ordinal()] = crownJewels;
        
        Item florentineDiamond = new Item();
        florentineDiamond.setDescription("Florentine Diamond");
        florentineDiamond.setQuantityStock(0);
        treasures[TreasureInventory.florentineDiamond.ordinal()] = florentineDiamond;
    
        return treasures;
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
