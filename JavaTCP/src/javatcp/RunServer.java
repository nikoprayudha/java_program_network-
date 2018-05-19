/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatcp;

import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author TOSHIBA-97
 */
public class RunServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        for (int i=1;i<255;i++){
        try {
            if (true) {
                
            }else {
                Socket sc = new Socket("192.168.43."+i,1000);
            DataOutputStream dos = new DataOutputStream(sc.getOutputStream());
            Scanner input = new Scanner(System.in);
            System.out.println("Masukan Sebuah Perintah : ");
            String pesan=input.next();
            dos.writeBytes(pesan);
            sc.close();
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
        
        
        
      
    }
}
