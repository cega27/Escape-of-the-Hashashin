/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeHashashin.model;

import java.io.Serializable;

/**
 *
 * @author carlos
 */
public class PuzzleType implements Serializable{
    
    private double math;

    public PuzzleType() {
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.math) ^ (Double.doubleToLongBits(this.math) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "PuzzleType{" + "math=" + math + '}';
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
        final PuzzleType other = (PuzzleType) obj;
        if (Double.doubleToLongBits(this.math) != Double.doubleToLongBits(other.math)) {
            return false;
        }
        return true;
    }
    
    
}
