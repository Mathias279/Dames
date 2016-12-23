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
public class Case {
    private Position position ;
    private boolean blanc ;
    private boolean occupe;
    private boolean occupeParBlanc; 
    private boolean occupeParDame;
        
    /**
     *
     */
    public Case(){
        
    }
            
    /**
     *
     * @param x
     * @param y
     */
    public Case(int x, int y) {
        this.position = new Position(x,y);
        this.occupe = false;    
        this.occupeParBlanc = false;
        this.occupeParDame = false;
        if((x+y) % 2 ==0){
            this.blanc=true;
        }
        else{
            this.blanc=false;
        }  
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
    public boolean isOccupe() {
        return occupe;
    }

    /**
     *
     * @return
     */
    public boolean isOccupeParBlanc() {
        return occupeParBlanc;
    }

    /**
     *
     * @return
     */
    public boolean isOccupeParDame() {
        return occupeParDame;
    }

    /**
     *
     * @param occupe
     */
    public void setOccupe(boolean occupe) {
        this.occupe = occupe;
    }

    /**
     *
     * @param occupeParBlanc
     */
    public void setOccupeParBlanc(boolean occupeParBlanc) {
        this.occupeParBlanc = occupeParBlanc;
    }

    @Override
    public String toString() {
        return "Case{" + "position=" + position +
                ", blanc=" + blanc + ", occupe=" + 
                occupe + ", occupeParBlanc=" +
                occupeParBlanc + ", occupeParDame=" +
                occupeParDame + '}';
    }

    
}
