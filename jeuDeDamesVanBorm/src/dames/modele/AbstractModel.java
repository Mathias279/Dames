/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dames.modele;


import dames.observeur.Observer;
import dames.observeur.Observable;
import java.util.ArrayList;
//import opencrcalculettemvc.Observable;
//import opencrcalculettemvc.Observer;

public abstract class AbstractModel implements Observable{
    JoueurM joueur1;
    JoueurM joueur2;
    int    tailleDamier;
    public MapM    plateau;
    int    nombrePions;

    public abstract void mettrePions();
    
      
}