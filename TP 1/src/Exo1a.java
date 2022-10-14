import java.io.FileNotFoundException;

public class Exo1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Fichier.ecrireFichier("Bonjours");
			Fichier.afficherFichier();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}