/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dames.modele;


/**
 *
 * @author Lenovo
 */
public class Map {
    final int taille;
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
                      
          
    public Map(int taille, Case[][] tableauCases) {
        this.taille = taille;
        this.tableauCases = tableauCases;
    } 
    
    public int getTaille() {
        return taille;
    }

    public Case[][] getTableauCases() {
        return tableauCases;
    }
    
    public Case getTableauCases(int x, int y) {
        return tableauCases[x][y];
    }

    
    
    
    //@Override
    //public String toString(int ) {
    //    return "Map{" + "taille=" + this.taille + '}';
    //}
}
