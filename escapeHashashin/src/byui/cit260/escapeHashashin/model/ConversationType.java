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
public class ConversationType extends Conversation implements Serializable {

    public ConversationType(String information) {
        this.information = information;
    }

    public ConversationType() {
    }
    
    
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.information);
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
        final ConversationType other = (ConversationType) obj;
        if (!Objects.equals(this.information, other.information)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ConversationType{" + super.toString() + "information=" + information + '}';
    }
    
    
    
    private String information;

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
    
    
    
}
