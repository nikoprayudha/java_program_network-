/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lampu;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 *
 * @author Faiz
 */
public class JavaUDPKirim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String x = "";
        Scanner input=new Scanner(System.in);
        while (!x.equals("berhenti")){
            try {
                InetAddress ia = InetAddress.getByName("localhost");
                int Port = 2000;
                System.out.println("Pesan = ");
                x = input.nextLine();
                byte[] y = x.getBytes();
                DatagramPacket dp = new DatagramPacket(y, y.length, ia, Port);
                DatagramSocket sender = new DatagramSocket();
                sender.send(dp);
            } catch (Exception e) {
            }
        }
    }
    
}
