class Consommateur extends Thread {
	
	
    static final int NbMAX = 50;
    private int NbMess;
 
    Producteur producteur;
    Consommateur(Producteur p) {
            producteur = p ;
             NbMess++;
    }
 
    public void run(){
        try {
            while (NbMess < NbMAX) {
                String message = producteur.recupererMessage();
                System.out.println("Message numéro "+NbMess+" recu : " +message);
                NbMess++;
                sleep(2000);
            }
        }
        catch (InterruptedException e) {}
    }
}
