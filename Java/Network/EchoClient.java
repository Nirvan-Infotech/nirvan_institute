package Network;

import java.net.*;
import java.io.*;

public class EchoClient {
    public static void main(String args[]){
        DatagramSocket clientSocket = null;
        try{
            clientSocket = new DatagramSocket();
            InetAddress serverAddress = InetAddress.getByName("localhost");
            int serverPort = 4444;
            
            String fileName = "D:\\test.jpg";
            byte[] sendData = fileName.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);
            clientSocket.send(sendPacket);
            
            // recive data
            byte[] receiveData = new byte[1024];
            DatagramPacket receivedPacket = new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivedPacket);
            
            FileOutputStream fos = new FileOutputStream(fileName);
            fos.write(receivedPacket.getData(), 0, receivedPacket.getLength());
            fos.close();
            
            System.out.println("Received file from server and wrote data in file " + fileName);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            if(clientSocket != null){
                clientSocket.close();
            }
        }
    }
}
