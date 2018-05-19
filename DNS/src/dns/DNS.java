/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dns;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author TOSHIBA-97
 */
public class DNS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try {
InetAddress inet1 = InetAddress.getByName("www.polinema.ac.id");
             System.out.println("HostAddress : "+inet1.getHostAddress());
InetAddress inet2 = InetAddress.getByName("172.16.17.27");
             System.out.println("HostName : "+inet2.getHostName());
             if(inet1.equals(inet2))
                 System.out.println("Alamat Sama !");
             else System.out.println("Alamat Tidak Sama");
    }
    catch(UnknownHostException uhe){
     //uhe.printStackTrace();
        System.err.println("Hore tidak ketemu");
    }
 }
}

