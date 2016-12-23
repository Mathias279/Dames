/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dames.vueG;

import dames.controleur.Controleur;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
        
/**
 *
 * @author Lenovo
 */
public class MapG extends JPanel {
    Controleur controleur;
    
    private int taille;
    private CaseG[][] tableauCases;
    
    
    public MapG(int taille) {
        this.taille = taille;
        this.tableauCases = new CaseG[taille][taille];
        int i;
        int j;
        //Case tempCase = new CaseG(1,1);
        for(i=0;i<this.taille;i++){
            for(j=0;j<this.taille;j++){
                this.tableauCases[i][j] = new CaseG(i,j);
            }           
        }
    }
    
    
    private JPanel buildContentPane(Controleur controleur){
        this.controleur=controleur;
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1, 0, 0));		
        JLabel label = new JLabel("Fin du jeu");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(label);				
        JButton bouttonQuitter = new JButton();
        bouttonQuitter.setText("Quitter jeu");
        bouttonQuitter.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){		
                System.exit(0);           	
            }
        });
        panel.add(bouttonQuitter);
		return panel;
    }
    
    public int getTaille() {
        return taille;
    }
    
            
}
