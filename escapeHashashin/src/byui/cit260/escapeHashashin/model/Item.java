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
public class Item implements Serializable {

    private String inventoryType;
    private double quantityStock;
    private String description;
    private Game game;
    private Location[] location;
    private Character[] character;
    private String spot;

    public String getSpot() {
        return spot;
    }

    public void setSpot(String spot) {
        this.spot = spot;
    }

    public Character[] getCharacter() {
        return character;
    }

    public void setCharacter(Character[] character) {
        this.character = character;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Location[] getLocation() {
        return location;
    }

    public void setLocation(Location[] location) {
        this.location = location;
    }
    
    

    public Item() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.inventoryType);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.quantityStock) ^ (Double.doubleToLongBits(this.quantityStock) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (Double.doubleToLongBits(this.quantityStock) != Double.doubleToLongBits(other.quantityStock)) {
            return false;
        }
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "inventoryType=" + inventoryType + ", quantityStock=" + quantityStock + '}';
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public String getDescription() {
        return description;
    }

    public double getQuantityStock() {
        return quantityStock;
    }

    public void setQuantityStock(double quantityStock) {
        this.quantityStock = quantityStock;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

}
