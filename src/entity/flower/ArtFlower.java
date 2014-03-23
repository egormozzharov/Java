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
public class ArtFlower extends Flower {
 
    private boolean toxic;
    
    public void setToxic(boolean t) {
        toxic = t;
    }
    
    public boolean getToxic() {
        return toxic;
    }
    
    
    @Override
    public String getInfo() {
        String str = name + " " + "is toxic = " + toxic;
        return str;
    }
    
}
