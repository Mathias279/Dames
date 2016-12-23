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
public class PartieM  {
    JoueurM joueurServer;
    JoueurM joueurClient;
    int    tailleDamier;
    int    nombrePions;

    /**
     *
     */
    public PartieM() {
        //this.joueurServer = new JoueurM();
        this.joueurServer.setBlanc(true);
        
        //this.joueurClient = new JoueurM();
        this.joueurClient.setBlanc(false);
        
        this.tailleDamier = 8;
        //this.plateau = new MapM(tailleDamier);
        this.nombrePions = 24;
    }
    
    /**
     *
     * @param taille
     */
    public PartieM(int taille) {
        this.tailleDamier = taille;
        //this.plateau = new MapM(tailleDamier);
        this.nombrePions = ((tailleDamier/2)*((tailleDamier/2)-1)*2);
        this.joueurServer = new JoueurM(nombrePions/2);
        this.joueurServer.setBlanc(true);
        this.joueurClient = new JoueurM(nombrePions/2);
        this.joueurClient.setBlanc(false);
    }
    

    
    
}
