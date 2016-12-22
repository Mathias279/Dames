/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dames.modele;

/**
 *
 * @author Lenovo
 */
public class Joueur {
    private String pseudo;
    private int nombrePions;
    private Pion [] pionsJoueur ;
    private boolean blanc;
    private int points;

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

    
    
    public Joueur(String pseudo, int nombrePions, Pion[] pionsJoueur, boolean blanc, int points) {
        this.pseudo = pseudo;
        this.nombrePions = nombrePions;
        this.pionsJoueur = pionsJoueur;
        this.blanc = blanc;
        this.points = points;
    }

    public void setBlanc(boolean blanc) {
        this.blanc = blanc;
    }

    public Pion[] getPionsJoueur() {
        return pionsJoueur;
    }
    
    public Pion getPionJoueur(int n) {
        return pionsJoueur[n];
    }

    public int getNombrePions() {
        return nombrePions;
    }

    public void setPionsJoueur(Pion[] pionsJoueur) {
        this.pionsJoueur = pionsJoueur;
    }

    
    
    
}
