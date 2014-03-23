/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bl.builder;

import entity.Bouquet;
import entity.decorate.Decoration;
import entity.flower.Flower;
import java.util.List;

/**
 *
 * @author Egor
 */
public class BouquetBuilder {
    
    private List<Flower> flowers;
    
    private List<Decoration> decorations;
    
    protected Bouquet bouquet;
    
    public BouquetBuilder(List<Flower> f, List<Decoration> d) {
        flowers = f;
        decorations = d;
    }
    
    public Bouquet getBouquet() {
        return this.bouquet;
    }
    
    public void createNewBouquet() {
        this.bouquet = new Bouquet();
    }
    
    public void buildFlowers() {
        bouquet.setFlowers(flowers);
    }
    
    public void buildDecorations() {
        bouquet.setDecoration(decorations);
    }
    
}
