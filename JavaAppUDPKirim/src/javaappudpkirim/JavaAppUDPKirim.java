/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappudpkirim;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 *
 * @author TOSHIBA-97
 */
public class JavaAppUDPKirim {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) throws IOException{
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        while(true)
        {
            InetAddress ia = InetAddress.getByName("192.168.43.157");
            int Port = 2001;

                    System.out.println("Masukan : ");
                    String s = input.nextLine();
                    byte[] b = s.getBytes();
                    DatagramPacket dp = new DatagramPacket(b, b.length, ia, Port);
                    DatagramSocket sender = new DatagramSocket();
                    sender.send(dp);
                     if(s.equals("Berhenti"))
                     {
                        break;
                     }
                    
        }      
           
    }
    
}
