/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.control;

import byui.cit260.escapeHashashin.model.Game;
import byui.cit260.escapeHashashin.model.Player;
import escapehashashin.EscapeHashashin;

/**
 *
 * @author Garen
 */
public class GameControl {

    public static Player createPlayer(String playersName) {
        if (playersName == null){
            return null;
        }
     Player player = new Player();
     player.setName(playersName);
     
     EscapeHashashin.setPlayer(player);
     
     return player;
    }
    
   
        
        public static void createNewGame(Player player) {
        
                System.out.println("\ncreateNewGame stub function called");
        }

    public static void startExistingGame(Game currentGame) {
        
    }

    public static void saveGame(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    }

