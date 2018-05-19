/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatcp;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author budi
 */
public class NewClientSocket {
    public static void main(String[] args) {
        while(true) {            
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                Socket cs = new Socket("localhost", 2000);
                DataOutputStream dos = new DataOutputStream(cs.getOutputStream());
                System.out.print("Masukkan pesan: ");
                String pesan = br.readLine();
                dos.writeBytes(pesan);
                cs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}
