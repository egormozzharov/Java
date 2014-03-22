/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bl.builder;

import entity.Bouquet;

/**
 *
 * @author Egor
 */
public abstract class BouquetBuilder {
    
    protected Bouquet bouquet;
    
    public Bouquet getBouquet() {
        return this.bouquet;
    }
    
    public void createNewBouquet() {
        this.bouquet = new Bouquet();
    }
    
    public abstract void buildFlowers();
    
    public abstract void buildDecorations();
    
}
