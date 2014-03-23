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
public class NatParams extends Params {
    
    private int expirationDays;
    
    public NatParams(int days) {
        expirationDays = days;
    }
    
    public NatParams() {
    }
    
    public int getExpirationDays() {
        return expirationDays;
    }
    
    public void setExpirationDays(int days) {
        expirationDays = days;
    }
}
