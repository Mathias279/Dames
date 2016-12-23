/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dames.modele;

/**
 *
 * @author Mathias Van Borm
 */
public class Pion {
    private boolean blanc;
    private Position position;
    private boolean dame;
    private boolean blocked;

    /**
     *
     * @param blanc
     * @param position
     * @param dame
     * @param blocked
     */
    public Pion(boolean blanc, Position position, boolean dame, boolean blocked) {
        this.blanc = blanc;
        this.position = position;
        this.dame = dame;
        this.blocked = blocked;
    }
    
    /**
     *
     */
    public Pion() {
        this.blanc = true;
        this.position = new Position();
        this.dame = false;
        this.blocked = false;
    }

    /**
     *
     * @return
     */
    public boolean isBlanc() {
        return blanc;
    }

    /**
     *
     * @param blanc
     */
    public void setBlanc(boolean blanc) {
        this.blanc = blanc;
    }

    /**
     *
     * @return
     */
    public Position getPosition() {
        return position;
    }

    /**
     *
     * @param position
     */
    public void setPosition(Position position) {
        this.position = position;
    }

    /**
     *
     * @return
     */
    public boolean isDame() {
        return dame;
    }

    /**
     *
     * @param dame
     */
    public void setDame(boolean dame) {
        this.dame = dame;
    }

    /**
     *
     * @return
     */
    public boolean isBlocked() {
        return blocked;
    }

    /**
     *
     * @param blocked
     */
    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    @Override
    public String toString() {
        return "Pion{" + "blanc=" + blanc + ", position=" + position + ", dame=" + dame + ", blocked=" + blocked + '}';
    }
    
    
    
}
