package dames.socket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import dames.modele.PionM;
import main.JeuDeDames;

/**
 *
 * @author Mathias Van Borm
 */
public class Client {
	InetAddress localIP;
	PionM[] mesPions;
	PionM[] sesPions;
	private JeuDeDames jeudedames;
	private Socket socket;
	private ObjectOutputStream out;
	private ObjectInputStream in ;
        
    /**
     *
     * @param jeudedames
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Client(JeuDeDames jeudedames) throws IOException, ClassNotFoundException{
        int nbrPions = jeudedames.getControleur().getNbrPions();
        //int nombrePions = moi.
        mesPions= new PionM[nbrPions];
        for(int i = 0 ; i<nbrPions; i++){
            mesPions[i]=new PionM();
        }
        this.jeudedames = jeudedames;
        localIP = InetAddress.getLocalHost();
        socket = new Socket( localIP, 12346);
        out = new ObjectOutputStream(socket.getOutputStream());
        out.flush();
        in = new ObjectInputStream(socket.getInputStream());
        mesPions = jeudedames.getControleur().getMoi().getPionsM();   
        System.out.println(mesPions.length);
        out.writeObject(mesPions);
        out.flush();
        Object objetRecu = in.readObject();
        sesPions = (PionM[]) objetRecu;
        jeudedames.getControleur().getLautre().setPionsM(sesPions);
    }    

    /**
     *
     * @throws IOException
     */
    public void fermerServeur() throws IOException{
        socket.close();
    }
}
