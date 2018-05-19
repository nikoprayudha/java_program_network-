/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatcp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author budi
 */
public class NewServerSocket {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(2000);
            Socket soc = ss.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String pesan = br.readLine();
            System.out.println(pesan);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
