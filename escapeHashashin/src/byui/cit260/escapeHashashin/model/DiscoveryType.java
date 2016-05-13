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
public class DiscoveryType extends Scene implements Serializable{
    
    private String itemType;

    public DiscoveryType() {
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.itemType);
        return hash;
    }

    @Override
    public String toString() {
        return "DiscoveryType{" + super.toString() + "itemType=" + itemType + '}';
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
        final DiscoveryType other = (DiscoveryType) obj;
        if (!Objects.equals(this.itemType, other.itemType)) {
            return false;
        }
        return true;
    }   
    
}
