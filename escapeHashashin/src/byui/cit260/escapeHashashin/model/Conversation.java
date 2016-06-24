/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Garen
 */
public enum Conversation implements Serializable {
    
    CookOne("This response will return a positive feedback"),
    CookTwo("This response will irritate the cook"),
    CookThree("This response will terminate the conversation"),
    GeneralOne("This response will return a clue"),
    GeneralTwo("This response will rise suspicious"),
    GeneralThree("This response will put you in trouble"),
    JaimeOne("This response will return a clue for the next scene"),
    JaimeTwo("This response will return a sarcastic response"),
    JaimeThree("This response might rise suspicious"),
    SirEdOne("This response will return a clue"),
    SirEdTwo("This response will end the conversation"),
    SirEdThree("This response will return a misleading clue"),
    QueenOne("This response will return a clue"),
    QueenTwo("This response will unuseful information"),
    QueenThree("This response will terminate the conversation");
    
    private final String description;
    private final String choice;
    private Character character;
    
    public Character getCharacter(){
        return character;
    }
    public void setChaaracter(Character character){
        this.character = character;
    }
    
    Conversation(String description){
        this.description = description;
        choice = new String();        
    }
    
    public String getDescription() {
        return description;
    }

    public String getChoice() {
        return choice;
    }

}
