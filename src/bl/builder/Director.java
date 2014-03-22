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
public class Director {
    
    private BouquetBuilder bouquetBuilder;
    
    public void setBouquetBuilder(BouquetBuilder bb) {
        this.bouquetBuilder = bb;
    }
    
    public Bouquet getBouquet() {
        return this.bouquetBuilder.getBouquet();
    }
    
    public void constructBouquet() {
        bouquetBuilder.createNewBouquet();
        bouquetBuilder.buildDecorations();
        bouquetBuilder.buildFlowers();
    }
    
}
