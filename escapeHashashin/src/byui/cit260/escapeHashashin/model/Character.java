/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Garen
 */
public enum Character implements Serializable {
    
    
    Cook("Chubby in appearance, the gifted chef/baker can do wonders with spice."),
    Sir_Edmand("The heir to a crown north of the land who has brought his daughter to wed the prince."),
    General_Barathian("Head of the guard for the king."),
    Jaimie("In charge of relations of the kingdom. He makes his goal to meet as many people as possible."),
    Queen_Alice("The king's kind and mistreated wife. She may be kind and help you along");
    
    
    
    

    private final String description;
    private Conversation[] conversation;
    private Game game;
    private Player[] player;
    ArrayList<Location> location = new ArrayList<>();

    public Conversation[] getConversation() {
        return conversation;
    }

    public void setConversation(Conversation[] conversation) {
        this.conversation = conversation;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Player[] getPlayer() {
        return player;
    }

    public void setPlayer(Player[] player) {
        this.player = player;
    }

    public ArrayList<Location> getLocation() {
        return location;
    }

    public void setLocation(ArrayList<Location> location) {
        this.location = location;
    }
    
    

private final Point coordinates;



    Character(String description){
    this.description = description;
    this.coordinates = new Point (1,1); 

    }
   

    

    //@Override
   //     public String toString() {
    //    return "Character{" + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + '}';
   // }

    
    
    

    public String getDescription() {
        return description;
    }

    

    public Point getCoordinates() {
        return coordinates;
    }

   
    
    
}
