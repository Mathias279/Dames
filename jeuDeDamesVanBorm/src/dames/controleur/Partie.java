/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dames.controleur;


/**
 *
 * @author Lenovo
 */
public class Partie {
    private dames.vueG.Partie partieVueG;
    private dames.vueC.Partie partieVueC;
    private dames.modele.Partie partieModele;

    public Partie(boolean interfaceG, int taille) {
        
        creerPartie(interfaceG,taille);
        
        this.partieModele.mettrePions();
        this.partieVueC.partieConsole();
    }
    
    
    
    
    
    final public void creerPartie(boolean interfaceG, int taille){
    
        if(interfaceG){
            this.partieVueG = new dames.vueG.Partie(taille);
        }
        else{
            this.partieVueC = new dames.vueC.Partie(taille);
        }
        this.partieModele = new dames.modele.Partie(taille);
        
        
        //dames.vueC.Map map = new dames.vueC.Map(taille);
        //map = this.partieVueC.getPlateau();
        //map.mapConsole();
        //this.partieVueC.getPlateau().
    }
}
