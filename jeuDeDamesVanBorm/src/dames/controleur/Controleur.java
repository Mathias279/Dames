/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dames.controleur;

import dames.socket.*;
import dames.vueG.*;
import dames.modele.*;
import java.io.IOException;
import main.JeuDeDames;

/**
 *
 * @author Lenovo
 */
public class Controleur {
    
    private Accueil  accueil;
    private PartieG  partieG;
    private JoueurG  joueurG;
    private int taille = 10;
    private int nbrPions;
    //private MapG     plateau;
    
    JoueurM moi;
    JoueurM lautre;
    
    private JeuDeDames jeudedames;
    
    Controleur controleur;
    
    Client client;
    Serveur serveur;
    
    public Controleur(){
        moi = new JoueurM(jeudedames);
        lautre = new JoueurM(jeudedames);
    }
    
    public Accueil getAccueil(){    
        return accueil;
    }

    public int getNbrPions() {
        return nbrPions;
    }

    public int getNbrPionsLautre() {
        return lautre.getNombrePions();
    }

    public int getNbrPionsMoi() {
        return moi.getNombrePions();
    }

    public void setNbrPions(int nbrPions) {
        this.nbrPions = nbrPions;
    }
    
    
    public void getJoueurG(JeuDeDames jeudedames, String joueur,boolean blanc){
        joueurG= new JoueurG(jeudedames, joueur,blanc);
        joueurG.setVisible(true);
        jeudedames.getControleur().partieG.dispose();
    }
    
    public void setTaille(int taille) {
        this.taille = taille;
    }

    public int getTaille() {
        return taille;
    }
    
    public void getAccueil(JeuDeDames jeudedames){
        accueil = new Accueil(jeudedames);
        accueil.setVisible(true);

    }
    public void getPartieG(JeuDeDames jeudedames){
        System.out.println(this.taille);
        jeudedames.getControleur().moi.mettrePions(jeudedames);
        partieG = new PartieG(jeudedames);
        partieG.setVisible(true);
        jeudedames.getControleur().accueil.dispose();        
    }
    
    
    public void getServeur(JeuDeDames jeudedames) throws IOException, ClassNotFoundException{
        String joueur="joueur serveur";
        serveur = new Serveur(jeudedames);
        jeudedames.getControleur().getJoueurG(jeudedames,joueur,true);
    }
    
    public void getClient(JeuDeDames jeudedames) throws IOException, ClassNotFoundException{
        String joueur="joueur client";
        client = new Client(jeudedames);
        jeudedames.getControleur().getJoueurG(jeudedames,joueur,false);
    }

    public JoueurM getMoi() {
        return moi;
    }

    public JoueurM getLautre() {
        return lautre;
    }
    
    
}
