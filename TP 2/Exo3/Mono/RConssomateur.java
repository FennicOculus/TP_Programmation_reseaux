class RConsommateur implements Runnable {
	
	
    static final int NbMAX = 50;
    private int NbMess;
 
    RProducteur producteur;
    RConsommateur(RProducteur p) {
            producteur = p ;
             NbMess++;
    }
 
    public void run(){
        try {
            while (NbMess < NbMAX) {
                String message = producteur.recupererMessage();
                System.out.println("Message numéro "+NbMess+" recu : " +message);
                NbMess++;
                Thread.sleep(2000);
            }
        }
        catch (InterruptedException e) {}
    }
}
