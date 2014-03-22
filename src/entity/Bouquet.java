
package entity;

import entity.decorate.Decoration;
import entity.flower.Flower;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Egor
 */
public class Bouquet {
    
    private List<Flower> flowers = new ArrayList<>();
    
    private List<Decoration> decorations = new ArrayList<>();
    
    public String getBouquetInfo() {
        String info = new String();
        info += "Bouquet info\n";
        info += "Flowers:\n";
        for (Flower currFlower : flowers) {
            info += currFlower.getName() + " ";
        }   
        info += "\nDecorations:\n";
        for (Decoration decor : decorations) {
            info += decor.getName() + " ";
        }
        info += "\n";
        return info;
    }
    
    public void setFlowers(List<Flower> list) {
        this.flowers = list;
    }
    
    public void setDecoration(List<Decoration> decorations) {
        this.decorations = decorations;
    }
    
}
