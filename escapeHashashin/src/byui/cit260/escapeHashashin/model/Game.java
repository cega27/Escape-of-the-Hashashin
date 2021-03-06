/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Garen
 */
public class Game implements Serializable {

    private double totalTime;
    private double totalKills;
    private Player player;
    private Character character;
    private Map map;
    private Item[] items;
    private Item[] treasures;
    private Item[] key; 
    private Item[] characters;

    public Item[] getCharacters() {
        return characters;
    }

    public void setCharacters(Item[] characters) {
        this.characters = characters;
    }

   
//    public class Map implements Serializable {
//
//        private int noOfRows;
//        private int noOfColumns;
//        private Location[][] locations;
//
//    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    
    

    public Game() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.totalKills) ^ (Double.doubleToLongBits(this.totalKills) >>> 32));
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.totalKills) != Double.doubleToLongBits(other.totalKills)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", totalKills=" + totalKills + '}';
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public double getTotalKills() {
        return totalKills;
    }

    public void setTotalKills(double totalKills) {
        this.totalKills = totalKills;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public Item[] getItems() {
        return items;
    }

    public Item[] getTreasures() {
        return treasures;
    }

    public void setTreasures(Item[] treasures) {
        this.treasures = treasures;
    }

    public Item[] getKey() {
        return key;
    }

    public void setKey(Item[] key) {
        this.key = key;
    }
    
    
    
    
}
