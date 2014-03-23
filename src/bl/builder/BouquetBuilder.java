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
    
    protected Bouquet bouquet;
    
    public Bouquet getBouquet() {
        return this.bouquet;
    }
    
    public void createNewBouquet() {
        this.bouquet = new Bouquet();
    }
    
    public void buildFlowers(List<Flower> list) {
        bouquet.setFlowers(list);
    }
    
    public void buildDecorations(List<Decoration> list) {
        bouquet.setDecoration(list);
    }
    
}
