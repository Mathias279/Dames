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
public class Joueur {
    private String pseudo;
    private int nombrePions;
    private Pion [] pionsJoueur ;
    private boolean blanc;
    private int points;

    /**
     *
     */
    public Joueur() {
        this.pseudo = "pas de pseudo";
        this.nombrePions = 0;
        this.pionsJoueur = new Pion[nombrePions];
        
        for(int i=0;i<this.nombrePions;i++){
            this.pionsJoueur[i] = new Pion();
            this.pionsJoueur[i].setBlanc(this.blanc);
        }
        
        this.blanc = true;
        this.points = 0;
    }

    /**
     *
     * @param nbrPions
     */
    public Joueur(int nbrPions) {
        this.pseudo = "pas de pseudo";
        this.nombrePions = nbrPions;
        this.pionsJoueur = new Pion[nombrePions];
        this.blanc = true;
        this.points = 0;
        
        for(int i=0;i<this.nombrePions;i++){
            this.pionsJoueur[i] = new Pion();
            this.pionsJoueur[i].setBlanc(this.blanc);
        }
        
    }

    /**
     *
     * @param pseudo
     * @param nombrePions
     * @param pionsJoueur
     * @param blanc
     * @param points
     */
    public Joueur(String pseudo, int nombrePions, Pion[] pionsJoueur, boolean blanc, int points) {
        this.pseudo = pseudo;
        this.nombrePions = nombrePions;
        this.pionsJoueur = pionsJoueur;
        this.blanc = blanc;
        this.points = points;
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
    public Pion[] getPionsJoueur() {
        return pionsJoueur;
    }
    
    /**
     *
     * @param n
     * @return
     */
    public Pion getPionJoueur(int n) {
        return pionsJoueur[n];
    }

    /**
     *
     * @return
     */
    public int getNombrePions() {
        return nombrePions;
    }

    /**
     *
     * @param pionsJoueur
     */
    public void setPionsJoueur(Pion[] pionsJoueur) {
        this.pionsJoueur = pionsJoueur;
    }

    
    
    
}
