package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
        
import dames.controleur.Controleur;
/**
 *
 * @author Mathias Van Borm
 */
public class JeuDeDames{
        private Controleur controleur = new Controleur();

    /**
     *
     * @return
     */
    public Controleur getControleur() {
            return controleur;
	}
        
    /**
     *
     * @param args
     */
    public static void main(String[] args){
        JeuDeDames jeudedames = new JeuDeDames();
        jeudedames.getControleur().getAccueil(jeudedames);
	}
}
           
