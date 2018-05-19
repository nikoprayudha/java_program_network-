/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatserver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 *
 * @author TOSHIBA-97
 */
public class ChatClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
        // TODO code application logic here
        MulticastSocket chat = new MulticastSocket(1234);
    
    InetAddress group = InetAddress.getByName("234.5.6.7");
    chat.joinGroup(group);
    String msg = "";
    System.out.println("Type a message for the server:");
    BufferedReader br = new BufferedReader(new
    InputStreamReader(System.in));
    msg = br.readLine();
    DatagramPacket data = new DatagramPacket(msg.getBytes(),
    0, msg.length(), group, 1234);
    chat.send(data);
    chat.close();    
    }
}
