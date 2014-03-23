/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity.flower;

/**
 *
 * @author Egor
 */
public abstract class Flower {
    
    protected String name = "Flower";
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getInfo() {
        String str = name.toString();
        return str;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
    
}
