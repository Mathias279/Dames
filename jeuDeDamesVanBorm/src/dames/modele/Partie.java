/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dames.modele;

import dames.modele.Position;
import javax.swing.JFrame;

/**
 *
 * @author Lenovo
 */
public class Partie extends JFrame {
    Joueur joueur1;
    Joueur joueur2;
    int    tailleDamier;
    public Map    plateau;
    int    nombrePions;

    public Partie() {
        this.joueur1 = new Joueur();
        this.joueur1.setBlanc(true);
        this.joueur2 = new Joueur();
        this.joueur1.setBlanc(false);
        this.tailleDamier = 8;
        this.plateau = new Map(tailleDamier);
        this.nombrePions = 24;
    }
    
    public Partie(int taille) {
        this.tailleDamier = taille;
        this.plateau = new Map(tailleDamier);
        this.nombrePions = ((tailleDamier/2)*((tailleDamier/2)-1)*2);
        this.joueur1 = new Joueur(nombrePions/2);
        this.joueur2 = new Joueur(nombrePions/2);
        this.joueur1.setBlanc(true);
        this.joueur1.setBlanc(false);
    }
    

    public void mettrePions(){
        
        int i,j,a=0,b=0;
        int ok ;
        int fin = this.nombrePions;
        
        Pion[] TempPionsJ1 = new Pion[fin/2];
        TempPionsJ1 = this.joueur1.getPionsJoueur();
        
        Pion[] TempPionsJ2 = new Pion[fin/2];
        TempPionsJ2 = this.joueur2.getPionsJoueur();
        
        Case[][] cases =this.plateau.getTableauCases();
        //Case TempCase = new Case();
        
        Position pos = new Position();
        
        for(i=0;i<(this.tailleDamier);i++){
            for(j=0;j<this.tailleDamier;j++){
                ok=(i+j)%2;
                if(ok==0){ 
                    pos.setPosition(i,j);
                    if (a<((fin/2)-1)){
                        //modif pionsJ1
                        TempPionsJ1[a].setPosition(pos);
                        a++;
                        //modif cases
                        cases[i][j].setOccupe(true);
                        cases[i][j].setOccupeParBlanc(true);
                }
                    else if(i>this.tailleDamier/2){      
                    //modif pionsJ2
                    TempPionsJ2[b].setPosition(pos);
                    b++;
                    //modif cases
                    cases[i][j].setOccupe(true);
                    cases[i][j].setOccupeParBlanc(false);
                    }
                }
            }
        }        
    }
    
    
    @Override
    public String toString() {
        return "Partie{"+"joueur1="+joueur1+", joueur2="+joueur2+", taille="+tailleDamier+'}';
    }

    
    
    
    
    
}
