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
public class Partie {
    private Joueur joueur1;
    private Joueur joueur2;
    private int    tailleDamier;
    private Map    plateau;
    
    public Partie() {
        this.tailleDamier = 10;
        this.plateau = new Map(tailleDamier);
        this.joueur1.setBlanc(true);
        this.joueur2.setBlanc(false);
    }
    public Partie(int taille) {
        this.tailleDamier = taille;
        this.plateau = new Map(tailleDamier);
        this.plateau = new Map(tailleDamier);
        this.joueur1 = new Joueur(tailleDamier);
        this.joueur2 = new Joueur(tailleDamier);
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
