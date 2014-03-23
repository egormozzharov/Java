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
public class WrapParams extends Params {
    
    private int square;
    
    public WrapParams(int s) {
        square = s;
    }
    
    public WrapParams() {
    }
    
    public int getSquare() {
        return square;
    }
    
    public void setSquare(int s) {
        square = s;
    }
    
}
