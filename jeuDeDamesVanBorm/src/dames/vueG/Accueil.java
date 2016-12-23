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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.*;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import main.JeuDeDames;

/**
 *
 * @author Lenovo
 */
public class Accueil extends JFrame {
    private JeuDeDames jeudedames;
    private int taille;

        
        
    public Accueil(JeuDeDames jeudedames) {              
        JTextField tailleChoisie = new JTextField(5);   
        JLabel TexteTaille = new JLabel("quelle taille de damier? (8 - 10 - 12)");  
        JButton boutonJouer = new JButton("Jouer");     
        this.jeudedames = jeudedames;
        JPanel panel = new JPanel();
        //int tailleDuPlateau = 6;
        this.setTitle("Jeu De Dames");
        this.setSize(500,100); 
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel.add(TexteTaille);
        panel.add(tailleChoisie);
        panel.add(boutonJouer);
        
        this.add(panel);
        boutonJouer.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){	
                setTaille(Integer.parseInt(tailleChoisie.getText()));
            	//jeudedames.getControleur().setTaille(taille);
            	jeudedames.getControleur().getPartieG(jeudedames);
                System.out.println(tailleChoisie.getText());
                System.out.println(jeudedames.getControleur().getTaille());
            }});
        
    }
    //public int getTaille(){
    //    return Integer.pparseInt(tailleChoisie.getText());
    //}
    
    public void setTaille(int taille){
        this.taille = taille;
        jeudedames.getControleur().setTaille(taille);
    }
}
