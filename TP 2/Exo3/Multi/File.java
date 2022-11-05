import java.util.Vector;

public class File {
	private Vector messages;
	private static int nbMessage;
	static final int NbMAX = 50;
	private int FileSize;
			
	public File(int fileSize) {
		FileSize = fileSize;
		messages = new Vector();
        nbMessage = 0;
	}


	public synchronized void insererMessage () {
        while (messages.size() == FileSize) {
            System.out.println("File pleine Thread "+Thread.currentThread().getId());
            try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
 
        messages.addElement(new java.util.Date().toString());
        notify();
        nbMessage++;
    }
	
	public synchronized String recupererMessage() {
        while (messages.size() == 0) {
            System.out.println("File vide Thread "+Thread.currentThread().getId());
            try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        String message = (String)messages.firstElement();
        messages.removeElement(message);
        notify();
        return message;
    }

	public void EcrireMessage() {
		while (nbMessage < NbMAX) {

            	insererMessage();
                System.out.println("Message numéro "+nbMessage+" produit par le thread "+Thread.currentThread().getId());
                
                
        }
	}
	
}
