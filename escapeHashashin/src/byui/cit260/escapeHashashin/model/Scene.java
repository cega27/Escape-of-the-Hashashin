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
 * @author carlos
 */
public class Scene implements Serializable{
    
    private String description;
    private String blockedLocation;
    private String displaySymbol;
    private String hint;

    public Scene() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBlockedLocation() {
        return blockedLocation;
    }

    public void setBlockedLocation(String blockedLocation) {
        this.blockedLocation = blockedLocation;
    }

    public String getDisplaySymbol() {
        return displaySymbol;
    }

    public void setDisplaySymbol(String displaySymbol) {
        this.displaySymbol = displaySymbol;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.description);
        hash = 17 * hash + Objects.hashCode(this.blockedLocation);
        hash = 17 * hash + Objects.hashCode(this.displaySymbol);
        hash = 17 * hash + Objects.hashCode(this.hint);
        return hash;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", blockedLocation=" + blockedLocation + ", displaySymbol=" + displaySymbol + ", hint=" + hint + '}';
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.blockedLocation, other.blockedLocation)) {
            return false;
        }
        if (!Objects.equals(this.displaySymbol, other.displaySymbol)) {
            return false;
        }
        if (!Objects.equals(this.hint, other.hint)) {
            return false;
        }
        return true;
    }
    
    
}
