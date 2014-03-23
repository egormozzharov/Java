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
public class Wrapping extends Decoration {
    
    private int square;
    
    public Wrapping() {
        this.name = "Wrapping";
    }
    
    public int getSquare() {
        return this.square;
    }
    
    public void setSquare(int square) {
        this.square = square;
    }
}
