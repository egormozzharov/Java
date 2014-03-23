/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bl.factory.decoration;

import bl.to.Params;
import entity.decorate.Decoration;

/**
 *
 * @author Egor
 */
public abstract class DecorCreator {
    
    public DecorCreator(Params p) {
        parameters = p;
    }
    
    protected Params parameters;
    
    public abstract Decoration factoryMethod();
    
}
