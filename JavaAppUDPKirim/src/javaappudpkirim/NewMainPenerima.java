/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappudpkirim;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author TOSHIBA-97
 */
public class NewMainPenerima {
    public static void main(String[] args) {
        try {
            byte[] buffer = new byte[100];
            DatagramPacket incoming = new DatagramPacket(buffer,buffer.length);
            DatagramSocket ds = new DatagramSocket(2000);
            ds.receive(incoming);
            byte[] data = incoming.getData();
            String s = new String(data, 0, data.length);
//            System.out.println("Port " + incoming.getPort() + " on " + incoming.
//            getAddress() + " sent this message:");
            System.out.println(s);
            }catch (IOException e) {
            System.err.println(e);
}
    }
}
