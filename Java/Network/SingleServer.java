package Network;

import java.io.*;

import java.net.Socket;
import java.net.ServerSocket;

public class SingleServer {
    
    public static void main(String args[]){
        try{
            ServerSocket ss = new ServerSocket(4444);
            Socket s = ss.accept();

            DataInputStream dis = new DataInputStream(s.getInputStream()); 
            System.out.println("Connection successfull....");
            String msg = (String)dis.readUTF();
            System.out.println("Clent: "+msg);
            s.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Program executed successfully.");
        }
        
        
    }
}
