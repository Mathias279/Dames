package dames.socket;

import dames.modele.MapM;
import dames.modele.PionM;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import main.JeuDeDames;

public class Serveur {
	private ServerSocket s ;
	private JeuDeDames jeudedames;
	PionM[] mesPions;
	PionM[] sesPions;
	private Socket socket;
	private ObjectOutputStream out;
	private ObjectInputStream in;
	
        
	public Serveur(JeuDeDames jeudedames) throws IOException, ClassNotFoundException{
	
            int nbrPions = jeudedames.getControleur().getNbrPions();
            mesPions= new PionM[nbrPions];
            for(int i = 0 ; i<nbrPions; i++){
                mesPions[i]=new PionM();
            }
            this.jeudedames=jeudedames;
            s = new ServerSocket(12346);
            socket = s.accept();
            out = new ObjectOutputStream(socket.getOutputStream());
            out.flush();	 
            in = new ObjectInputStream(socket.getInputStream());      
            mesPions = jeudedames.getControleur().getMoi().getPions();
            out.writeObject(mesPions);
            out.flush();       
            Object objetRecu = in.readObject();
            sesPions = (PionM[]) objetRecu;
            jeudedames.getControleur().getLautre().setPions(sesPions);
            //in.close();
            //out.close();
            
        }
    public void fermerServeur() throws IOException{
        socket.close();
    }
}
