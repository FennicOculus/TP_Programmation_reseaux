import java.io.IOException;

public class main2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
			
			try {
				Object o = new String ("toto");
				Fichier.ecrireObjetFichier(o);
				String s;
				s = (String) Fichier.afficherObjetFichier();
				System.out.println(s);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		
		
	}

}
