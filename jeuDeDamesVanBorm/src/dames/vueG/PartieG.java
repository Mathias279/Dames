/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dames.vueG;

import dames.vueG.MapG;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import main.JeuDeDames;

/**
 *
 * @author Mathias Van Borm
 */
public class PartieG extends JFrame {
    private int    tailleDamier;
    private MapG    plateau;
    private int    nombrePions;
    private JeuDeDames jeudedames;
    
    private JPanel panel;
    private JButton[][] cases;
    
    /**
     *
     * @param jeudedames
     */
    public PartieG(final JeuDeDames jeudedames) { 
        this.jeudedames=jeudedames;
        this.tailleDamier = jeudedames.getControleur().getTaille();
        
        //Jframe
        this.setTitle("Client ou serveur");
        this.setSize(400,420);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton test = new JButton("test");
        //panel
        this.panel = new JPanel();
		//panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(new BorderLayout(0, 0));
        //panelHaut
        JPanel panelHaut = new JPanel();
        
	//panelHaut.setLayout(new BorderLayout(2,2));
        panelHaut.setLayout(new GridLayout(tailleDamier,tailleDamier,0,0));
        cases = new JButton [tailleDamier][tailleDamier];
	int i, j;
        boolean blanc = true;
        for(i=0;i<tailleDamier;i++){
            blanc=!blanc;
            for(j=0;j<tailleDamier;j++){
                blanc=!blanc;
                cases[i][j]= new JButton();
                if(blanc){
                    cases[i][j].setBackground(Color.WHITE);
                }
                else{
                    cases[i][j].setBackground(new Color(150,150,150));
                }
                cases[i][j].setEnabled(false);
                panelHaut.add(cases[i][j]);
            }
        }
        
        
        panel.add(panelHaut);
        JPanel panelBas = new JPanel();
        panelBas.setLayout(new GridLayout(1, 2));
        panel.add(panelBas,BorderLayout.SOUTH);
        //JPanel panelServeur = new JPanel();
        JButton boutonServeur = new JButton("Serveur");
	boutonServeur.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){		
            	try {
                    jeudedames.getControleur().getServeur(jeudedames);
                } 
                catch (IOException e1) {
                    e1.printStackTrace();
		}
                catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
		}
            }
	});
        //panelBas.add(panelServeur);
        panelBas.add(boutonServeur);
        //panelClient
        //JPanel panelClient = new JPanel();
        JButton boutonClient = new JButton("Client");
	boutonClient.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){		
            	try {
                    boutonServeur.setEnabled(false);
                    jeudedames.getControleur().getClient(jeudedames);
                }
                catch (IOException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                }
            }
        });
        panelBas.add(boutonClient);
        //panelClient.add(test2);
        
        
        
        //panelDamier.add(TexteTaille);
        //panelDamier.add(tailleChoisie);
        //panelDamier.add(boutonJouer);
        
        //this.add(panelDamier);
        
        this.add(panel);
        
        //panelHaut.add(panelDamier);
        
        
        
        
        //this.plateau = new dames.vueG.MapG(tailleDamier);
        //this.nombrePions = ((tailleDamier/2)*((tailleDamier/2)-1)*2);
        
    }

    /**
     *
     * @return
     */
    public MapG getPlateau() {
        return plateau;
    }
    
    
    
    
    
}
