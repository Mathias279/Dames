/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dames.modele;

import java.io.Serializable;
import main.JeuDeDames;

/**
 *
 * @author Lenovo
 */
public class JoueurM implements Serializable {
    private String pseudo;
    private int nombrePions;
    private PionM [] pions ;
    private boolean blanc;
    private int points;
    public MapM    plateau;
    private JeuDeDames jeudedames;

    public JoueurM(JeuDeDames jeudedames) {
        this.jeudedames = jeudedames;
        //this.pseudo = "pas de pseudo";
        
        //this.nombrePions = 0;
        //this.pions = new PionM[nombrePions];
        
        //for(int i=0;i<this.nombrePions;i++){
         //   this.pions[i] = new PionM();
        //    this.pions[1].setBlanc(this.blanc);
        //}
        
        this.blanc = true;
        this.points = 0;
    }
    public JoueurM(int taille) {
        this.pseudo = "pas de pseudo";
        this.nombrePions = 0;
        this.pions = new PionM[nombrePions];
        this.blanc = true;
        this.points = 0;
        
        for(int i=0;i<this.nombrePions;i++){
            this.pions[i] = new PionM();
            this.pions[i].setBlanc(this.blanc);
        }
        
    }

    
    
    public JoueurM(String pseudo, int nombrePions, PionM[] pionsJoueur, boolean blanc, int points) {
        this.pseudo = pseudo;
        this.nombrePions = nombrePions;
        this.pions = pionsJoueur;
        this.blanc = blanc;
        this.points = points;
    }

    public void setBlanc(boolean blanc) {
        this.blanc = blanc;
    }

    public PionM[] getPions() {
        return pions;
    }

    public void setPions(PionM[] pions) {
        this.pions = pions;
    }
    
    public PionM getPion(int n) {
        return pions[n];
    }

    public int getNombrePions() {
        return nombrePions;
    }

    public void mettrePions(JeuDeDames jeudedames){
        
        int taille = jeudedames.getControleur().getTaille();
        this.nombrePions = ((taille/2)*(taille/2)-1);
        System.out.println(taille);
        jeudedames.getControleur().setNbrPions(nombrePions);
        this.pions = new PionM[nombrePions];
        
        for(int i=0;i<this.nombrePions;i++){
            this.pions[i] = new PionM();
        }
        int i,j,a=0;
        int ok ;
        int fin = this.nombrePions;
        
        
        PositionM pos = new PositionM();
        
        for(i=0;i<(taille);i++){
            for(j=0;j<taille;j++){
                ok=(i+j)%2;
                if(ok==0){ 
                    pos.setPosition(i,j);
                    if (a<(fin-1)){
                        //modif pionsJ1
                        pions[a].setPosition(pos);
                        a++;
                        //modif cases
                        //cases[i][j].setOccupe(true);
                        //cases[i][j].setOccupeParBlanc(true);
                    }   
                    //modif cases
                    //cases[i][j].setOccupe(true);
                    //cases[i][j].setOccupeParBlanc(false);
                }
            }
        }
    }

    public void inverserCoordonnées(PionM[] pion){
        int taille = jeudedames.getControleur().getTaille();
        int nbrPieces = pion.length+1;
        int x,y;
        for(int i=0;i<nbrPieces;i++){
            x=pion[i].getPosition().getAxeX();
            x=taille-1-x;
            y=pion[i].getPosition().getAxeY();
            y=taille-1-y;
            pion[i].getPosition().setAxeX(x);
            pion[i].getPosition().setAxeY(y);
        }
    }
    
    public PionM[] getPionsM() {
        return this.pions;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setPionsM(PionM[] sesPions) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
    