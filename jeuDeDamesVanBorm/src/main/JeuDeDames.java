package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import dames.controleur.Partie;
        
/**
 *
 * @author Mathias Van Borm
 */
public class JeuDeDames {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
               
        System.out.println("Bienvenue");
        Partie controleur = new Partie(getGUI(args),getTaille(args));    
        
        
        
        
        //dames.modele.Partie partie = new damse.modele.Partie(taille);
        
        
        
        //
        
        
        
        //partie.plateau.mapConsole();
        
    }
           
        
    public static boolean getGUI(String[] args){
        
        if(args.length ==0){
            return false;
        }
        else if(Integer.parseInt(args[0])==1){
            return true;
        }
        else return false;
    }
         
    public static int getTaille(String[] args){
        
        if(args.length <2){
            return 10;
        }
        else if((Integer.parseInt(args[1])>4)
                &&((Integer.parseInt(args[1]))%2==0)){
            return Integer.parseInt(args[1]);
        }
        else return 10;
    }
                 
}
        
        
        
        
        