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
public class NatFlower extends Flower {
    
    private int expirationDays;
    
    public void setExpirationDays(int days) {
        expirationDays = days;
    }
    
    public int getDangerous() {
        return expirationDays;
    }
    
    @Override
    public String getInfo() {
        String str = name + " " + "expiraion days = " + expirationDays;
        return str;
    }
}
