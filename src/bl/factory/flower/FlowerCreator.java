/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bl.factory.flower;

import bl.to.Params;
import entity.flower.Flower;

/**
 *
 * @author Egor
 */
public abstract class FlowerCreator {
    
    public FlowerCreator(Params p) {
        parameters = p;
    }
    
    protected Params parameters;
    
    public abstract Flower factoryMethod();
    
}
