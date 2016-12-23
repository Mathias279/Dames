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
public class MapM {
    final int taille;
    private CaseM[][] tableauCases;

    
    public MapM(int taille) {
        this.taille = taille;
        this.tableauCases = new CaseM[taille][taille];
        int i;
        int j;
        //Case tempCase = new CaseM(1,1);
        for(i=0;i<this.taille;i++){
            for(j=0;j<this.taille;j++){
                this.tableauCases[i][j] = new CaseM(i,j);
            }           
        }
    }
                      
          
    public MapM(int taille, CaseM[][] tableauCases) {
        this.taille = taille;
        this.tableauCases = tableauCases;
    } 
    
    public int getTaille() {
        return taille;
    }

    public CaseM[][] getTableauCases() {
        return tableauCases;
    }
    
    public CaseM getTableauCases(int x, int y) {
        return tableauCases[x][y];
    }

    
    
    
    //@Override
    //public String toString(int ) {
    //    return "MapM{" + "taille=" + this.taille + '}';
    //}
}
