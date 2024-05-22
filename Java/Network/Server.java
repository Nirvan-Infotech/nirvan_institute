package Network;

import java.io.*;

import java.net.Socket;
import java.net.ServerSocket;

public class Server {
    
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ServerSocket ss = new ServerSocket(4444);
        
        while(true){
            Socket s = ss.accept();
            
            System.out.println("Connection successfull....");
            
            PrintStream pr = new PrintStream(s.getOutputStream());
            
            String msg = br.readLine();
            pr.println("Server: "+msg);

            
            s.close();
        }
    }
    
}
