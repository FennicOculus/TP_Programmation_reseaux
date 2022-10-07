import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Fichier {
	
	private static String name = "test";
	
	
	
	public static void afficherFichier() throws FileNotFoundException{
		InputStream is;
		try {
			is = new FileInputStream(name);
			byte[] b = new byte[50];
			while (is.read(b) != -1) {
				System.out.println(new String (b));
			}
			is.close();
		}catch(IOException e){
			e.printStackTrace();
			
		}
	}
	
	public static void ecrireFichier(String s){
		OutputStream os;
		try {
			os = new FileOutputStream(name);
			s = s + "\n";
			os.write(s.getBytes());
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static Object afficherObjetFichier() throws FileNotFoundException, IOException {
		
		ObjectInputStream ois;
		
		
		try {
			ois = new ObjectInputStream(new FileInputStream(name));
			Object o;
			o = ois.readObject();
			System.out.println(o);
			ois.close();
			return o;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	

	public static void ecrireObjetFichier(Object o) {
		ObjectOutputStream oos;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(name));
			oos.writeObject(o);
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void copier(String s) {

	
	}
	
	
}
