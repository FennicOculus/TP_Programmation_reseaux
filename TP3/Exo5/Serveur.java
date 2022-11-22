import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Serveur {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Step 1 : Create a socket to listen at port 1234
		System.out.println("SERVER IS ON");
		String[] DNS = {"D1", "D2", "D3"};
		String[] DNSAdr = {"100", "200", "300"};
		Boolean sent = false;
        DatagramSocket socketS = new DatagramSocket(1234);
        DatagramPacket packetR = null;
        
        DatagramSocket socketC = new DatagramSocket();
        DatagramPacket packetS = null;
        Scanner sc = new Scanner(System.in);
        byte buf[] = null;
        
        byte[] receive = new byte[256];
        String message;
        
        while (true){
        	sent = false;
            // Step 2 : create a DatgramPacket to receive the data.
            packetR = new DatagramPacket(receive, receive.length);
  
            // Step 3 : revieve the data in byte buffer.
            socketS.receive(packetR);
  
            System.out.println("(Serveur) the Client sent :-" + new String(receive));
  
            // Exit the server if the client sends "bye"

            if (data(receive).toString().equals("end"))
            {
                System.out.println("(Serveur) Serveur exiting the chat");
                break;
            }
            // Clear the buffer after every message.
            
            for (int i = 0; i<DNS.length; i++) {
            	System.out.println(data(receive).toString());
            	if (DNS[i].equals(data(receive).toString())){
            		sent = true;
            		buf = DNSAdr[i].getBytes();
                    packetS = new DatagramPacket(buf, buf.length, InetAddress.getLocalHost(), 8000);
                    socketC.send(packetS);
                    break;
            	}
            }
            if (sent == false) {
            	buf = "No DNS FOUND".getBytes();
                packetS = new DatagramPacket(buf, buf.length, InetAddress.getLocalHost(), 8000);
                socketC.send(packetS);
            }
            
            receive = new byte[256];
        }
        socketC.close();
        socketS.close();
	}
	
	public static StringBuilder data(byte[] a)
    {
        if (a == null)
            return null;
        StringBuilder ret = new StringBuilder();
        int i = 0;
        while (a[i] != 0)
        {
            ret.append((char) a[i]);
            i++;
        }
        return ret;
    }

}
