/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_ip_dns;

import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 *
 * @author TOSHIBA-97
 */
public class console_dns_ip {
     
    
    public static void main(String[] args) throws IOException{
       try {
String ipAddress = null;         
InetAddress inet1 = InetAddress.getLocalHost().getByName(ipAddress);

 System.out.println("IP Saya : " + InetAddress.getLocalHost());  // often returns "127.0.0.1"
    Enumeration<NetworkInterface> n = NetworkInterface.getNetworkInterfaces();
    for (; n.hasMoreElements();)
    {
        NetworkInterface e = n.nextElement();
        Enumeration<InetAddress> a = e.getInetAddresses();
    }

System.out.println("Sending Ping Request to " + ipAddress);
System.out.println(inet1.isReachable(5000) ? "Host is Konek" : "Host is NOT reachable");

// -----------------------------batas----------------   
Scanner input = new Scanner(System.in);
System.out.print("Masukkan IP teman: ");
ipAddress = input.nextLine();;
  inet1 = InetAddress.getByName(ipAddress);
    
System.out.println("Sending Ping Request to " + ipAddress);
System.out.println(inet1.isReachable(5000) ? "Host is Konek" : "Host is NOT reachable");

String ip = ipAddress;
runSystemCommand("ping " + ip);
    }
         
    catch(UnknownHostException uhe){
     uhe.printStackTrace();  
    }
  }
    
    private static void runSystemCommand(String command) {
       try {
			Process p = Runtime.getRuntime().exec(command);
			BufferedReader inputStream = new BufferedReader(
					new InputStreamReader(p.getInputStream()));

			String s = "";
			// reading output stream of the command
			while ((s = inputStream.readLine()) != null) {
				System.out.println(s);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}

