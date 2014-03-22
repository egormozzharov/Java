/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bl.builder;

import entity.decorate.Decoration;
import entity.decorate.Ribbon;
import entity.decorate.Wrapping;
import entity.flower.Astra;
import entity.flower.Dalia;
import entity.flower.Flower;
import entity.flower.Pansy;
import entity.flower.Tulip;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Egor
 */
public class SpringBouquetBuilder extends BouquetBuilder {
    
    @Override
    public void buildFlowers() {
        List<Flower> flowers = new ArrayList<>();
        flowers.add(new Tulip());
        flowers.add(new Tulip());
        flowers.add(new Pansy());
        this.bouquet.setFlowers(flowers);
    }
    
    @Override
    public void buildDecorations() {
        List<Decoration> decorations = new ArrayList<>();
        decorations.add(new Wrapping());
        this.bouquet.setDecoration(decorations);
    }
    
}
