import java.util.Vector;

public class Producteur implements Runnable {
	static final int NbFile = 5;
    static final int NbMAX = 50;
    private Vector messages;
    private int nbMessage;
    private File f; 
    public Producteur (File f) {
    	this.f = f;
    }
    
    public void run(){
        try {
        	f.EcrireMessage();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
    
}
