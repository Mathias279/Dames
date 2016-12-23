/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dames.modele;

import java.io.Serializable;

/**
 *
 * @author Lenovo
 */
public class PionM implements Serializable{
    private boolean blanc;
    private PositionM position;
    private boolean dame;
    private boolean blocked;

    public PionM(boolean blanc, PositionM position, boolean dame, boolean blocked) {
        this.blanc = blanc;
        this.position = position;
        this.dame = dame;
        this.blocked = blocked;
    }
    
    public PionM() {
        this.blanc = true;
        this.position = new PositionM();
        this.dame = false;
        this.blocked = false;
    }

    public boolean isBlanc() {
        return blanc;
    }

    public void setBlanc(boolean blanc) {
        this.blanc = blanc;
    }

    public PositionM getPosition() {
        return position;
    }

    public void setPosition(PositionM position) {
        this.position = position;
    }

    public boolean isDame() {
        return dame;
    }

    public void setDame(boolean dame) {
        this.dame = dame;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    
    
}
