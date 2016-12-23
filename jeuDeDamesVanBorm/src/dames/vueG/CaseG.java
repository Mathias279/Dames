/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dames.vueG;
import dames.modele.PositionM;

/**
 *
 * @author Lenovo
 */
public class CaseG {

    private PositionM position ;
    private boolean blanc;
    private boolean occupe;    
    private boolean occupeParBlanc; 
    private boolean occupeParDame;

    
    
        
    public CaseG(int x, int y) {
        this.position = new PositionM(x,y);
        this.occupe = false;    
        this.occupeParBlanc = false;
        this.occupeParDame = false;
        if((x+y) % 2 ==0){
            this.blanc=true;
        }
        else{
            this.blanc=false;
        }  
    }
    
    
    
    
    
    
    
    public boolean isOccupe() {
        return occupe;
    }

    public boolean isOccupeParBlanc() {
        return occupeParBlanc;
    }

    public boolean isOccupeParDame() {
        return occupeParDame;
    }
        
    
    public String caseConsole(){
     
        String affiche = "";
        if(!this.isOccupe()){
            
            int posX = this.position.getAxeX();
            int posY = this.position.getAxeY();
            int somme = posX +posY; 
        
            if(somme % 2 ==0){
                affiche = "O";
            }
            else{
                affiche = "X";
            }  
        }
        else if(this.isOccupeParBlanc()){
            affiche = "b";
            if(this.isOccupeParDame()){
                affiche = "B";
            }
        }
        else if(this.isOccupeParDame()){
            affiche = "N";
        }
        else {
            affiche = "n";
        }
    return affiche;
    }
}
