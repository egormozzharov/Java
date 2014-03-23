/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity.decorate;

import entity.decorate.Decoration;

/**
 *
 * @author Egor
 */
public class Ribbon extends Decoration {
    
    private int length;
    
    public Ribbon() {
    }
    
    public int getLength() {
        return this.length;
    }
    
    public void setLength(int length) {
        this.length = length;
    }
    


    
}
