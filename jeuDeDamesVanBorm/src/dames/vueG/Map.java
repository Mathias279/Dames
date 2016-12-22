/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dames.vueG;

import javax.swing.*;
        
/**
 *
 * @author Lenovo
 */
public class Map extends JPanel {
    
    private int taille;
    private Case[][] tableauCases;
    
    
    public Map(int taille) {
        this.taille = taille;
        this.tableauCases = new Case[taille][taille];
        int i;
        int j;
        //Case tempCase = new Case(1,1);
        for(i=0;i<this.taille;i++){
            for(j=0;j<this.taille;j++){
                this.tableauCases[i][j] = new Case(i,j);
            }           
        }
    }
    
    
    
    public int getTaille() {
        return taille;
    }
    
            
}
