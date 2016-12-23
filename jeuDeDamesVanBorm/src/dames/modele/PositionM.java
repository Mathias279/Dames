/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dames.modele;

import java.io.Serializable;

public class PositionM implements Serializable{
    private int axeX;
    private int axeY;

    public PositionM() {
        this.axeX = 0;
        this.axeY = 0;
    }

    public PositionM(int axeX, int axeY) {
        this.axeX = axeX;
        this.axeY = axeY;
    }

    public int getAxeX() {
        return axeX;
    }

    public void setAxeX(int axeX) {
        this.axeX = axeX;
    }

    public int getAxeY() {
        return axeY;
    }

    public void setAxeY(int axeY) {
        this.axeY = axeY;
    }

    
    public void setPosition(int axeX, int axeY) {
        this.axeX = axeX;
        this.axeY = axeY;
    }
    
    
}
