/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bl.factory.flower;

import bl.to.Params;
import bl.to.NatParams;
import entity.flower.Flower;
import entity.flower.NatFlower;

/**
 *
 * @author Egor
 */
public class NatCreator extends FlowerCreator {

    public NatCreator(Params p) {
        super(p);
    }
    
    
    @Override
    public Flower factoryMethod() {
        NatFlower flower = new NatFlower();
        NatParams params = (NatParams)parameters;
        flower.setExpirationDays(params.getExpirationDays());
        flower.setName(params.getName());        
        return flower;
    }
    
}
