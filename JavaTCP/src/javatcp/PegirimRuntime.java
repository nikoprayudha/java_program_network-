/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatcp;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author budi
 */
public class PegirimRuntime {
    public static void main(String[] args) throws IOException {
        String sentence;
        while (true) {       
            BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
            Socket clientSocket = new Socket("192.168.230.176", 2000);
            DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());

            sentence = inFromUser.readLine();
            outToServer.writeBytes(sentence);

            System.out.println("FROM SERVER: " + sentence);
            clientSocket.close();
        }
    }
}
