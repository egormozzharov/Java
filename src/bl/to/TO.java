/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bl.to;

import entity.decorate.Decoration;
import entity.flower.Flower;
import java.util.List;

/**
 *
 * @author Egor
 */
public class TO {
    
    private List<String> flowers;
    
    private List<String> decoration;
    
    public List<String> getDecorations() {
        return decoration;
    }   
    
    public void setDecorations(List<String> d) {
        decoration = d;
    }
    
    public List<String> getFlowers() {
        return flowers;
    }
    
    public void setFlowers(List<String> f) {
        flowers = f;
    }
}
