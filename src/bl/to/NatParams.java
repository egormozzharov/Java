/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bl.to;

/**
 *
 * @author Egor
 */
public class NatParams implements IParams {
    
    private int expirationDays;
    
    public int getExpirationDays() {
        return expirationDays;
    }
    
    public void setExpirationDays(int days) {
        expirationDays = days;
    }
}
