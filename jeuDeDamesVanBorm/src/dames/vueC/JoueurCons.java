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
public class JoueurCons {
    private String pseudo;
    private int nombrePions;
    private boolean blanc;
    private int points;

    public JoueurCons(boolean blanc) {
        this.pseudo = "pas de pseudo";
        this.nombrePions = 0;
        this.blanc = blanc;
        this.points = 0;
    }
    public JoueurCons(int nbrPions) {
        this.pseudo = "pas de pseudo";
        this.nombrePions = nbrPions;
        this.blanc = true;
        this.points = 0;   
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public int getNombrePions() {
        return nombrePions;
    }

    public void setNombrePions(int nombrePions) {
        this.nombrePions = nombrePions;
    }

    public boolean isBlanc() {
        return blanc;
    }

    public void setBlanc(boolean blanc) {
        this.blanc = blanc;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    
    
    public void joueurConsole(){
        System.out.print(this.pseudo+" est");
        if(this.blanc){
            System.out.println(" blanc");
        }
        else {
            System.out.println(" noir");}
        System.out.println("il a "+this.points+" points!");
        
    }
    
    
}
