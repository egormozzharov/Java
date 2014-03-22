/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bl.factory.flower;

import entity.flower.Flower;
import entity.flower.Rose;

/**
 *
 * @author Egor
 */
public class RoseCreator extends FlowerCreator {
    
    @Override
    public Flower factoryMethod() {
        return new Rose();
    }
    
}
