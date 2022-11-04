import java.util.Vector ;
 
class RProducteur implements Runnable {
    static final int NbFile = 5;
    static final int NbMAX = 50;
    private Vector messages;
    private int nbMessage;
 
    public RProducteur() {
        messages = new Vector();
         nbMessage = 0;
    }
    public void run(){
        try {
            while (nbMessage < NbMAX) {
                insererMessage();
                System.out.println("Message numéro "+nbMessage+" produit");
                nbMessage++;
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {}
    }
    private void insererMessage () {
        while (messages.size() == NbFile) {
            System.out.println("File pleine");
        }
 
        messages.addElement(new java.util.Date().toString());
    }
    public String recupererMessage() {
        while (messages.size() == 0) {
            System.out.println("File vide");
        }
        String message = (String)messages.firstElement();
        messages.removeElement(message);
        return message;
    }
}