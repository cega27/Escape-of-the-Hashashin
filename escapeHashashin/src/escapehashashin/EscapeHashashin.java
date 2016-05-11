/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escapehashashin;

import byui.cit260.escapeHashashin.model.Player;

/**
 *
 * @author Garen
 */
public class EscapeHashashin {

    
    
    public static void main(String[] args) {
        
        Player playerOne = new Player();
        playerOne.setName("Tiny Tim");
        playerOne.setBestTime(11.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }
    
    
}
