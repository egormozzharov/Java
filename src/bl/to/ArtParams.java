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
public class ArtParams extends Params {
    
    private boolean toxic;
    
    public ArtParams(boolean t) {
        toxic = t;
    }
    
    public ArtParams() {
    }
    
    public boolean getToxic() {
        return toxic;
    }
    
    public void setToxic(boolean t) {
        toxic = t;
    }
    
}
