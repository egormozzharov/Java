/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bl.factory.decoration;

import bl.to.Params;
import bl.to.RibParams;
import entity.decorate.Decoration;
import entity.decorate.Ribbon;

/**
 *
 * @author Egor
 */
public class RibCreator extends DecorCreator {

    public RibCreator(Params p) {
        super(p);
    }    
    
    @Override
    public Decoration factoryMethod() {
        Ribbon decoration = new Ribbon();
        RibParams params = (RibParams)parameters;
        decoration.setLength(params.getLength());
        decoration.setName(params.getName());
        return decoration;
    }
    
}
