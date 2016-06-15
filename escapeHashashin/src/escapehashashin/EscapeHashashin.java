/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escapehashashin;

import byui.cit260.escapeHashashin.model.Conversation;
import byui.cit260.escapeHashashin.model.Player;
import byui.cit260.escapeHashashin.model.Character;
import byui.cit260.escapeHashashin.model.ConversationType;
import byui.cit260.escapeHashashin.model.DiscoveryType;
import byui.cit260.escapeHashashin.model.Game;
import byui.cit260.escapeHashashin.model.Item;
import byui.cit260.escapeHashashin.model.Location;
import byui.cit260.escapeHashashin.model.LockType;
import byui.cit260.escapeHashashin.model.Map;
import byui.cit260.escapeHashashin.model.PuzzleType;
import byui.cit260.escapeHashashin.model.Scene;
import byui.cit260.escapeHashashin.view.GameMenuView;
import byui.cit260.escapeHashashin.view.GobletView;
import byui.cit260.escapeHashashin.view.HelpMenuView;
import byui.cit260.escapeHashashin.view.StartProgramView;

/**
 *
 * @author Garen
 */
public class EscapeHashashin {

    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView();
        
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
        
        GobletView gobletView = new GobletView();
        gobletView.displayGobletView();
        
    }

    public static void setPlayer(Player player) {
        EscapeHashashin.player = player;
    }
    
    public static Player getPlayer(){
        return player;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        EscapeHashashin.currentGame = currentGame;
    }

    
    
    
}
