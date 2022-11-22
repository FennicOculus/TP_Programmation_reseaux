import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Client {

	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		  
        // Step 1:Create the socket object for
        // carrying the data.
        DatagramSocket socketS = new DatagramSocket();
        
        DatagramSocket socketC = new DatagramSocket(8000);
        DatagramPacket packetC = null;
        byte[] receive = new byte[256];
  
        InetAddress ip = InetAddress.getLocalHost();
        byte buf[] = null;
  
        while (true) {
        	System.out.println("(Client) Write your message:");
            String inp = sc.nextLine();
  
            // convert the String input into the byte array.
            buf = inp.getBytes();
  
            // Step 2 : Create the datagramPacket for sending
            // the data.
            DatagramPacket DpSend = new DatagramPacket(buf, buf.length, ip, 1234);
  
            // Step 3 : invoke the send call to actually send
            // the data.
            socketS.send(DpSend);
  
            // break the loop if user enters "bye"
            if (inp.equals("bye")) {
            	System.out.println("(Client) Client Exiting the chat");
            	break;
            }
            packetC = new DatagramPacket(receive, receive.length);
            socketC.receive(packetC);
            
            System.out.println("(Client) The serveur sent :-" + new String(receive));
                
        }
		
    }

}
