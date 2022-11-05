
public class Consomateur implements Runnable {

	static final int NbMAX = 50;
    private int NbMess = 0;
 
    File f;
    Consomateur(File f) {
            this.f = f ;
    }
 
    public void run(){
        try {
            while (NbMess < NbMAX) {
                String message = f.recupererMessage();
                System.out.println("Message numéro "+NbMess+" recu : " +message);
                NbMess++;
                Thread.sleep(2000);
            }
        }
        catch (InterruptedException e) {}
        System.out.println("FIN");
    }
}
