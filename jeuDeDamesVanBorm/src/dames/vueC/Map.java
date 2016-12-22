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
public class Map {
    private final int taille;
    private Case[][] tableauCases;

    
    public Map(int taille) {
        this.taille = taille;
        this.tableauCases = new Case[taille][taille];
        int i,j;
        boolean blanc=true;
        //Case tempCase = new Case(1,1);
        for(i=0;i<this.taille;i++){
            for(j=0;j<this.taille;j++){
                this.tableauCases[i][j] = new Case();
                if(blanc){
                    this.tableauCases[i][j].setApparence('O');
                }
                else {
                    this.tableauCases[i][j].setApparence('X');
                }
                blanc=!blanc;
            }           
        }
    }

    public Case[][] getTableauCases() {
        return tableauCases;
    }
    public Case getTableauCases(int x, int y) {
        return tableauCases[x][y];
    }

    public void setTableauCases(Case[][] tableauCases) {
        this.tableauCases = tableauCases;
    }
     
    
    public void mapConsole(){
        
        int i,j;
        for(i = 0;i<2*(this.taille)+3;i++){            
            System.out.print("#");
        } 
        System.out.println();         
        for(i=0;i<this.taille;i++){
            System.out.print("# ");
            for(j=0;j<this.taille;j++){
                //System.out.print("i:"+i+" j="+j);             
                System.out.print(this.getTableauCases(i,j).getApparence());
                //System.out.print(dieze+" ");
                System.out.print(" ");//dieze);      
            }
                
            System.out.print('#');
            System.out.println();   
        }
        
        for(i = 0;i<(2*this.taille)+3;i++){            
            System.out.print('#');
        }
        
        System.out.println();   
        
    }
    
    
}
