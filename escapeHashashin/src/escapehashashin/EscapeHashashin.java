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
import byui.cit260.escapeHashashin.model.Game;
import byui.cit260.escapeHashashin.model.Item;
import byui.cit260.escapeHashashin.model.LockType;

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
        
        Conversation conversationOne = new Conversation();
        conversationOne.setDescription("Descriptive Word Go Here");
        conversationOne.setChoice("He responded with a sword to the face");
        conversationOne.setResponse("The maiden was offended and storms off");
        
        String playerConvo = conversationOne.toString();
        System.out.println(playerConvo);
       
        Character characterOne = new Character();
        characterOne.setName("Willard");
        characterOne.setDescription("Silent and Deadly");
        characterOne.setCoordinates(15.16);
        
        String playerChar = characterOne.toString();
        System.out.println(playerChar);
        
        Game gameOne = new Game();
        gameOne.setTotalTime(13.00);
        gameOne.setTotalKills(2);
        
        String playerGame = gameOne.toString();
        System.out.println(playerGame);
        
        Item itemOne = new Item();
        itemOne.setInventoryType("Weapons");
        itemOne.setQuantityStock(4);
        
        String playerItem = itemOne.toString();
        System.out.println(playerItem);
        
        ConversationType conversationTypeOne = new ConversationType();
        conversationTypeOne.setInformation("Important information seem to be obtainable");
        
        String specificConvoType = conversationTypeOne.toString();
        System.out.println(specificConvoType);
        
        LockType lockTypeOne = new LockType();
        lockTypeOne.setItemUsed("Chef's Key");
        
        String lockItemUsed = lockTypeOne.toString();
        System.out.println(lockItemUsed);
        
    }
    
    
}
