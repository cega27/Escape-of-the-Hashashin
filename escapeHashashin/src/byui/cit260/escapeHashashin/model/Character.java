/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Garen
 */
public enum Character implements Serializable {
    
    King("He was once an evil king. Now he lies in a pool of his own blood."),
    Cook("Chubby in appearance, the gifted chef/baker can do wonders with spice."),
    Sir_Edmand("The heir to a crown north of the land who has brought his daughter to wed the prince."),
    General_Barathian("Head of the guard for the king."),
    Jaimie("In charge of relations of the kingdom. He makes his goal to meet as many people as possible."),
    Queen_Alice("The king's kind and mistreated wife. She may be kind and help you along");
    
    
    
    

    private final String description;

private final Point coordinates;



    Character(String description){
    this.description = description;
    coordinates = new Point (1,1); 

    }
   

    

    @Override
        public String toString() {
        return "Character{" + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + '}';
    }

    
    
    

    public String getDescription() {
        return description;
    }

    

    public double getCoordinates() {
        return coordinates;
    }

   
    
    
}
