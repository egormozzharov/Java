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
public class RibParams extends Params {
    
    private int length;
    
    public RibParams(int l) {
        length = l;
    }
    
    public RibParams() {
    }
    
    public int getLength() {
        return length;
    }
    
    public void setLength(int l) {
        length = l;
    }
    
}
