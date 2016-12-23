package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
        
import dames.controleur.*;
import dames.modele.*;
import dames.vueC.PartieCons;
import dames.vueG.PartieG;
        
import dames.controleur.*;
import dames.vueG.Accueil;
import javax.swing.SwingUtilities;
/**
 *
 * @author Mathias Van Borm
 */
public class JeuDeDames{
        private Controleur controleur = new Controleur();
	public Controleur getControleur() {
            return controleur;
	}
        
    public static void main(String[] args){
        JeuDeDames jeudedames = new JeuDeDames();
        jeudedames.getControleur().getAccueil(jeudedames);
	}
}
           
