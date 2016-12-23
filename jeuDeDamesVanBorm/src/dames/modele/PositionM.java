/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dames.modele;

import java.io.Serializable;

/**
 *
 * @author Mathias Van Borm
 */
public class PositionM implements Serializable{
    private int axeX;
    private int axeY;

    /**
     *
     */
    public PositionM() {
        this.axeX = 0;
        this.axeY = 0;
    }

    /**
     *
     * @param axeX
     * @param axeY
     */
    public PositionM(int axeX, int axeY) {
        this.axeX = axeX;
        this.axeY = axeY;
    }

    /**
     *
     * @return
     */
    public int getAxeX() {
        return axeX;
    }

    /**
     *
     * @param axeX
     */
    public void setAxeX(int axeX) {
        this.axeX = axeX;
    }

    /**
     *
     * @return
     */
    public int getAxeY() {
        return axeY;
    }

    /**
     *
     * @param axeY
     */
    public void setAxeY(int axeY) {
        this.axeY = axeY;
    }

    /**
     *
     * @param axeX
     * @param axeY
     */
    public void setPosition(int axeX, int axeY) {
        this.axeX = axeX;
        this.axeY = axeY;
    }
    
    
}
