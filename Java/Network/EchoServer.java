//UDP File Share

package Network;

import java.net.*;
import java.io.*;

public class EchoServer {
    public static void main(String args[]){
        DatagramSocket serverSocket = null;
        try{
            serverSocket = new DatagramSocket(4444);
            byte[] receivedData = new byte[1024];
            
            while(true){
                DatagramPacket receivedPacket = new DatagramPacket(receivedData, receivedData.length);
                serverSocket.receive(receivedPacket);
                String fileName = new String(receivedPacket.getData(), 0, receivedPacket.getLength());
                File audioFile = new File(fileName);
                FileInputStream fis = new FileInputStream(audioFile);
                byte[] audioData = new byte[(int)audioFile.length()];
                fis.read(audioData);
                
                fis.close();
                
                InetAddress clientAddress = receivedPacket.getAddress();
                int clientPort = receivedPacket.getPort();
                
                DatagramPacket sendPacket = new DatagramPacket(audioData, audioData.length, clientAddress, clientPort);
                serverSocket.send(sendPacket);
                
                System.out.println("Send audio file contents for file " + fileName);  
            }   
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            if(serverSocket != null){
                serverSocket.close();
            }
        }
    }
}
