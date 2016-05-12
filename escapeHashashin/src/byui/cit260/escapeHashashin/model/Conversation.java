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
public class Conversation implements Serializable {
    
    private String description;
    private String choice;
    private String response;

    public Conversation() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.description);
        hash = 29 * hash + Objects.hashCode(this.choice);
        hash = 29 * hash + Objects.hashCode(this.response);
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
        final Conversation other = (Conversation) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.choice, other.choice)) {
            return false;
        }
        if (!Objects.equals(this.response, other.response)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conversation{" + "description=" + description + ", choice=" + choice + ", response=" + response + '}';
    }

    
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
    
    
}
