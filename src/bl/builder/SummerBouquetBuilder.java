/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bl.builder;

import entity.decorate.Decoration;
import entity.decorate.Ribbon;
import entity.flower.Astra;
import entity.flower.Dalia;
import entity.flower.Flower;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Egor
 */
public class SummerBouquetBuilder extends BouquetBuilder {
    
    @Override
    public void buildFlowers() {
        List<Flower> flowers = new ArrayList<>();
        flowers.add(new Dalia());
        flowers.add(new Dalia());
        flowers.add(new Astra());
        this.bouquet.setFlowers(flowers);
    }
    
    @Override
    public void buildDecorations() {
        List<Decoration> decorations = new ArrayList<>();
        decorations.add(new Ribbon());
        this.bouquet.setDecoration(decorations);
    }
    
}
