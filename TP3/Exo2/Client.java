import java.io.*;
import java.net.*;
import java.time.LocalDateTime;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket sock=new Socket("localhost",6666);  
			DataInputStream dis=new DataInputStream(sock.getInputStream());  
			String  str = "";
			while(str.equals("FIN EMMISION") == false) {
				str =(String) dis.readUTF();  
				System.out.println("message= "+str);
			}
			sock.close(); 
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
