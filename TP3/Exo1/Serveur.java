import java.io.*;
import java.net.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Serveur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner myObj = new Scanner(System.in);
		
			System.out.println("Saisssez le nombre de Messages");
			int P = myObj.nextInt();
			try {
				ServerSocket ss=new ServerSocket(6666);  
				Socket s=ss.accept();//establishes connection   
				DataOutputStream dout=new DataOutputStream(s.getOutputStream());
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
				for (int i = 0; i < P; i++) {
					LocalDateTime now = LocalDateTime.now();
					
					dout.writeUTF(dtf.format(now).toString());  
					dout.flush();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				dout.writeUTF("FIN EMMISION");  
				dout.flush();
				  
				dout.close();   
				ss.close();  
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		

	}

}
