/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bl.factory.flower;

import bl.to.ArtParams;
import bl.to.Params;
import bl.to.NatParams;
import entity.flower.ArtFlower;
import entity.flower.Flower;
import entity.flower.NatFlower;

/**
 *
 * @author Egor
 */
public class ArtCreator extends FlowerCreator {
    
    public ArtCreator(Params p) {
        super(p);
    }
    
    @Override
    public Flower factoryMethod() {
        ArtFlower flower = new ArtFlower();
        ArtParams params = (ArtParams)parameters;
        flower.setName(params.getName());
        flower.setToxic(params.getToxic());
        return flower;
    }
    
}
