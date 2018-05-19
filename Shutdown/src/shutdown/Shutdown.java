/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shutdown;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author user
 */
public class Shutdown {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        try{
            ServerSocket server = new ServerSocket(2000);
            Socket socket = server.accept();
            BufferedReader buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String message = buffer.readLine();
            System.out.println(message);
            
            if (message.equals("shutdown")){
                Runtime runtime = Runtime.getRuntime();
                Process proses = runtime.exec("shutdown /s");
                System.exit(0);
            }
            
            else if (message.equals("restart")){
                Runtime runtime = Runtime.getRuntime();
                Process proses = runtime.exec("shutdown /r");
                System.exit(0);
        }
        } catch (Exception e){
            System.err.println(e);
        }
    
    }
}
