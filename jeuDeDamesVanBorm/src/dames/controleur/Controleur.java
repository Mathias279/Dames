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
 * @author Mathias Van Borm
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
    
    /**
     *
     */
    public Controleur(){
        moi = new JoueurM(jeudedames);
        lautre = new JoueurM(jeudedames);
    }
    
    /**
     *
     * @return
     */
    public Accueil getAccueil(){    
        return accueil;
    }

    /**
     *
     * @return
     */
    public int getNbrPions() {
        return nbrPions;
    }

    /**
     *
     * @return
     */
    public int getNbrPionsLautre() {
        return lautre.getNombrePions();
    }

    /**
     *
     * @return
     */
    public int getNbrPionsMoi() {
        return moi.getNombrePions();
    }

    /**
     *
     * @param nbrPions
     */
    public void setNbrPions(int nbrPions) {
        this.nbrPions = nbrPions;
    }
    
    /**
     *
     * @param jeudedames
     * @param joueur
     * @param blanc
     */
    public void getJoueurG(JeuDeDames jeudedames, String joueur,boolean blanc){
        joueurG= new JoueurG(jeudedames, joueur,blanc);
        joueurG.setVisible(true);
        jeudedames.getControleur().partieG.dispose();
    }
    
    /**
     *
     * @param taille
     */
    public void setTaille(int taille) {
        this.taille = taille;
    }

    /**
     *
     * @return
     */
    public int getTaille() {
        return taille;
    }
    
    /**
     *
     * @param jeudedames
     */
    public void getAccueil(JeuDeDames jeudedames){
        accueil = new Accueil(jeudedames);
        accueil.setVisible(true);

    }

    /**
     *
     * @param jeudedames
     */
    public void getPartieG(JeuDeDames jeudedames){
        System.out.println(this.taille);
        jeudedames.getControleur().moi.mettrePions(jeudedames);
        partieG = new PartieG(jeudedames);
        partieG.setVisible(true);
        jeudedames.getControleur().accueil.dispose();        
    }
    
    /**
     *
     * @param jeudedames
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void getServeur(JeuDeDames jeudedames) throws IOException, ClassNotFoundException{
        String joueur="joueur serveur";
        serveur = new Serveur(jeudedames);
        jeudedames.getControleur().getJoueurG(jeudedames,joueur,true);
    }
    
    /**
     *
     * @param jeudedames
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void getClient(JeuDeDames jeudedames) throws IOException, ClassNotFoundException{
        String joueur="joueur client";
        client = new Client(jeudedames);
        jeudedames.getControleur().getJoueurG(jeudedames,joueur,false);
    }

    /**
     *
     * @return
     */
    public JoueurM getMoi() {
        return moi;
    }

    /**
     *
     * @return
     */
    public JoueurM getLautre() {
        return lautre;
    }
    
    
}
