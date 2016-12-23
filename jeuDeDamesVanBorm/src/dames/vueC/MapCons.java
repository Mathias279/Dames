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
public class MapCons {
    private final int taille;
    private CaseCons[][] tableauCases;

    
    public MapCons(int taille) {
        this.taille = taille;
        this.tableauCases = new CaseCons[taille][taille];
        int i,j;
        boolean blanc=true;
        //Case tempCase = new CaseCons(1,1);
        for(i=0;i<this.taille;i++){
            for(j=0;j<this.taille;j++){
                this.tableauCases[i][j] = new CaseCons();
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

    public CaseCons[][] getTableauCases() {
        return tableauCases;
    }
    public CaseCons getTableauCases(int x, int y) {
        return tableauCases[x][y];
    }

    public void setTableauCases(CaseCons[][] tableauCases) {
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
