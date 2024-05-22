package Network;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String args[]) throws IOException{
        Socket s = new Socket("localhost", 4444);
        DataOutputStream os = new DataOutputStream(s.getOutputStream());
        
        os.writeUTF("Hello server");
        os.flush();
        os.close();
    }
}
