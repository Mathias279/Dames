/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dames.vueC;

/**
 *
 * @author Lenovo
 */
import dames.observeur.Observer;

public class PartieCons {
    private JoueurCons joueur1;
    private JoueurCons joueur2;
    private int    tailleDamier;
    private MapCons    plateau;
    
    public PartieCons() {
        this.tailleDamier = 10;
        this.plateau = new MapCons(tailleDamier);
        this.joueur1.setBlanc(true);
        this.joueur2.setBlanc(false);
    }
    public PartieCons(int taille) {
        this.tailleDamier = taille;
        this.plateau = new MapCons(tailleDamier);
        this.plateau = new MapCons(tailleDamier);
        this.joueur1 = new JoueurCons(tailleDamier);
        this.joueur2 = new JoueurCons(tailleDamier);
        this.joueur1.setBlanc(true);
        this.joueur2.setBlanc(false);
    }
    
    //todo partie console
    
    public void partieConsole(){
        
        this.joueur1.joueurConsole();
        System.out.println();
        this.joueur2.joueurConsole();
        this.plateau.mapConsole();
        
    }

    
}
