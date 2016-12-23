/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dames.vueG;

import javax.swing.JFrame;
import dames.controleur.Controleur;
import dames.modele.PionM;
import dames.modele.PositionM;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JPanel;
import main.JeuDeDames;

/**
 *
 * @author Mathias Van Borm
 */
public class JoueurG extends JFrame{
            
    private String pseudo;
    private int nombrePionsMoi;
    private boolean blanc;
    private int points;
    private JeuDeDames jeudedames;
    private JPanel panel;
    private JButton[][] cases;

    /**
     *
     */
    public JoueurG() {
        this.pseudo = "pas de pseudo";
        this.nombrePionsMoi = 0;
        this.blanc = true;
        this.points = 0;
    }

    /**
     *
     * @param jeudedames
     * @param joueur
     * @param blanc
     */
    public JoueurG(JeuDeDames jeudedames, String joueur,boolean blanc) {
        this.pseudo = joueur;
        //this.nombrePions = nbrPions;
        this.blanc = blanc;
        this.points = 0;
        
        //Jframe
        this.setTitle("fenetre de "+pseudo);
        this.setSize(400,420);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton test = new JButton("test");
        //panel
        this.panel = new JPanel();
		//panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(new BorderLayout(0, 0));
        //panelHaut
        JPanel panelGauche = new JPanel();
        int taille=jeudedames.getControleur().getTaille();
	//panelHaut.setLayout(new BorderLayout(2,2));
        panelGauche.setLayout(new GridLayout(taille,taille,0,0));
        cases = new JButton [taille][taille];
        
	int i, j, a;
        int nLautre = jeudedames.getControleur().getNbrPionsLautre();
        int nMoi = jeudedames.getControleur().getNbrPionsMoi();
        PionM[] pionsLautre = new PionM[nLautre];
        pionsLautre = jeudedames.getControleur().getLautre().getPions();
        
        PionM[] pionsMoi = new PionM[nLautre];
        pionsMoi = jeudedames.getControleur().getMoi().getPions();
        
        PositionM posCase = new PositionM();
        PositionM posPion = new PositionM();
        boolean boutonBlanc = true;
        
        for(i=0;i<taille;i++){
            boutonBlanc=!boutonBlanc;
            for(j=0;j<taille;j++){
                boutonBlanc=!boutonBlanc;
                cases[i][j]= new JButton();
                if(boutonBlanc){
                    cases[i][j].setBackground(Color.WHITE);
                }
                else{
                    cases[i][j].setBackground(new Color(150,150,150));
                    //cases[i][j].setText("N");
                    //System.out.println(nLautre);
                    //System.out.println(nMoi);
                }
                posCase.setPosition(i,j);
                for(a=0;a<nLautre;a++){
                    posPion = pionsLautre[a].getPosition();
                    if(posCase == posPion)
                        if(blanc){
                            cases[i][j].setText("N");
                        }
                        else{
                            cases[i][j].setText("B");
                        }
                }
                for(a=0;a<nMoi;a++){
                    posPion = pionsMoi[a].getPosition();
                    if(posCase == posPion)
                        if(blanc){
                            cases[i][j].setText("B");
                        }
                        else{
                            cases[i][j].setText("n");
                        }
                }
                //cases[i][j].setEnabled(false);
                panelGauche.add(cases[i][j]);
            }
        }
        
        
        panel.add(panelGauche);
        JPanel panelBas = new JPanel();
        panelBas.setLayout(new GridLayout(1, 2));
        panel.add(panelBas,BorderLayout.SOUTH);
        //JPanel panelServeur = new JPanel();
        JButton boutonQuitter = new JButton("Quitter");
	boutonQuitter.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){		
            	System.exit(0); 
            }
	});
        //panelBas.add(panelServeur);
        panelBas.add(boutonQuitter);
        //panelClient
        //JPanel panelClient = new JPanel();
        JButton boutonJouer = new JButton("Jouer");
	boutonJouer.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){		
                
            }
        });
        panelBas.add(boutonJouer);
        this.add(panel);
    }

    /**
     *
     * @param pseudo
     * @param nombrePionsMoi
     * @param pionsJoueur
     * @param blanc
     * @param points
     */
    public JoueurG(String pseudo, int nombrePionsMoi, PionG[] pionsJoueur, boolean blanc, int points) {
        this.pseudo = pseudo;
        this.nombrePionsMoi = nombrePionsMoi;
        this.blanc = blanc;
        this.points = points;
    }

    /**
     *
     * @param blanc
     */
    public void setBlanc(boolean blanc) {
        this.blanc = blanc;
    }

    /**
     *
     * @return
     */
    public int getNombrePions() {
        return nombrePionsMoi;
    }
    
}
