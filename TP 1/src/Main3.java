import java.io.IOException;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object o = new String("Bonjours");
		Fichier.ecrireObjetFichier(o);
		String s = "";
		try {
			s = (String) Fichier.afficherObjetFichier();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i<s.length(); i++) {
			System.out.println("");
		}

	}

}
