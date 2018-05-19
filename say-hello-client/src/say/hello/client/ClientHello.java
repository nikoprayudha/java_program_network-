/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package say.hello.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import say.hello.api.InterfaceSayHello;
import java.io.*;

/**
 *
 * @author okin97
 */
public class ClientHello {
    static String inputan;
    static int pil=0;
    
    static String inputan(){
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try{
            inputan = input.readLine();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return inputan;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        String masukan ="";
        String respone ="";
        int angka1, angka2,angka3 = 0;
        int client = 0;
        InterfaceSayHello is = (InterfaceSayHello) Naming.lookup("rmi://localhost/sayHello");
        System.out.println("Client berhasil terkoneksi");
        
        do{
            System.out.println("Menu");
            System.out.println("1, cek Bilangan prima");
            System.out.println("2, cek Luas Balok");
            System.out.println("3, cek Volume Balok");
            System.out.println("4, Exit");
            System.out.println("-------------------");
            System.out.print("Masukkan pilihan anda :");
            String pilihan = inputan();
            pil = Integer.parseInt(pilihan);
            
            switch(pil){
//                pilhan pertama
                case 1 : System.out.print("Masukkan Bilangan:");
                masukan=inputan();
                angka1 = Integer.parseInt(masukan);
                respone =is.cekBilanganPrima(angka1);
                System.out.println(respone);
                System.out.println("=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=");
                break;
//                pilihan kedua
                case 2 : System.out.print("Masukkan Panjang:");
                masukan=inputan();
                angka1 = Integer.parseInt(masukan);
                System.out.print("Masukkan Lebar:");
                masukan=inputan();
                angka2 = Integer.parseInt(masukan);
                System.out.print("Masukkan Panjang:");
                masukan=inputan();
                angka3 = Integer.parseInt(masukan);
                respone = is.cekLuasBalok(angka1, angka2, angka3);
                System.out.println(respone);
                System.out.println("=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=");
                break;
//                pilhan ketiga
                case 3 : System.out.print("Masukkan Panjang:");
                masukan=inputan();
                angka1 = Integer.parseInt(masukan);
                System.out.print("Masukkan Lebar:");
                masukan=inputan();
                angka2 = Integer.parseInt(masukan);
                System.out.print("Masukkan Tinggi:");
                masukan=inputan();
                angka3 = Integer.parseInt(masukan);
                respone = is.cekVolumeBalok(angka1, angka2, angka3);
                System.out.println(respone);
                System.out.println("=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=");
                break; 
                
                
                default: System.out.println("Harap pilih dengan benar:");
                break;
        }}
        while(pil!=4);
   }
}

    



