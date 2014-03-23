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
public class NatFlower {
    
    private int expirationDays;
    
    public void setExpirationDays(int days) {
        expirationDays = days;
    }
    
    public int getDangerous() {
        return expirationDays;
    }
    
}
