/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dames.vueG;

import javax.swing.JFrame;

/**
 *
 * @author Mathias Van Borm
 */
public class Joueur extends JFrame{
        
        //Map plateau = new Map(taille);
        
        //plateau.mapConsole();
        
        //plateau.initialisation(taille);
        
        //plateau.mapConsole();
        
    
    private String pseudo;
    private int nombrePions;
    private boolean blanc;
    private int points;

    /**
     *
     */
    public Joueur() {
        this.pseudo = "pas de pseudo";
        this.nombrePions = 0;
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
        this.blanc = true;
        this.points = 0;
        
        this.setSize(400,400);
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
    public int getNombrePions() {
        return nombrePions;
    }
    
}
