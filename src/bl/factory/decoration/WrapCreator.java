/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bl.factory.decoration;

import bl.to.Params;
import bl.to.RibParams;
import bl.to.WrapParams;
import entity.decorate.Decoration;
import entity.decorate.Wrapping;

/**
 *
 * @author Egor
 */
public class WrapCreator extends DecorCreator {
    
    public WrapCreator(Params p) {
        super(p);
    }
    
    @Override
    public Decoration factoryMethod() {
        Wrapping decoration = new Wrapping();
        WrapParams params = (WrapParams)parameters;
        decoration.setSquare(params.getSquare());
        decoration.setName(params.getName());
        return decoration;
    }
}
