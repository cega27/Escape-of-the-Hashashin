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
public class LockType extends Scene implements Serializable {

    public LockType() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.itemUsed);
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
        final LockType other = (LockType) obj;
        if (!Objects.equals(this.itemUsed, other.itemUsed)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LockType{" + super.toString() + "itemUsed=" + itemUsed + '}';
    }
    
    
    
    private String itemUsed;

    public String getItemUsed() {
        return itemUsed;
    }

    public void setItemUsed(String itemUsed) {
        this.itemUsed = itemUsed;
    }
    
    
    
}
