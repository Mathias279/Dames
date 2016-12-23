/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dames.vueG;

import dames.vueG.Map;
import javax.swing.JFrame;

/**
 *
 * @author Mathias Van Borm
 */
public class Partie{
    Joueur joueur1;
    Joueur joueur2;
    int    tailleDamier;

    /**
     *
     */
    public Map    plateau;
    int    nombrePions;

    /**
     *
     * @param taille
     */
    public Partie(int taille) {
        this.tailleDamier = taille;
        this.plateau = new dames.vueG.Map(tailleDamier);
        this.nombrePions = ((tailleDamier/2)*((tailleDamier/2)-1)*2);
        this.joueur1 = new Joueur(nombrePions/2);
        this.joueur2 = new Joueur(nombrePions/2);
        this.joueur1.setBlanc(true);
        this.joueur1.setBlanc(false);
        
        joueur1.setVisible(true);
        joueur2.setVisible(true);
    }

    /**
     *
     * @return
     */
    public Map getPlateau() {
        return plateau;
    }
    
    
    
    @Override
    public String toString() {
        return "Partie{"+"joueur1="+joueur1+", joueur2="+joueur2+", taille="+tailleDamier+'}';
    }

    
    
    
    
    
}
