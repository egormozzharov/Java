/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bl.factory.flower;

import entity.flower.Astra;
import entity.flower.Dalia;
import entity.flower.Flower;

/**
 *
 * @author Egor
 */
public class DaliaCreator extends FlowerCreator {
    
    @Override
    public Flower factoryMethod() {
        return new Dalia();
    }
    
}
