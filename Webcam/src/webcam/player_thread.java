/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webcam;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.SourceDataLine;

/**
 *
 * @author user
 */

    
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.SourceDataLine;

/**
 *
 * @author user
 */
public class player_thread extends Thread {
    public DatagramSocket din;
    public SourceDataLine audio_out;
    byte[] buffer = new byte [512];
    public void run(){
        DatagramPacket incoming = new DatagramPacket(buffer, buffer.length);
        while (ClientVoice.calling) {            
            
                try {
                    din.receive(incoming);
                    buffer = incoming.getData();
                    audio_out.write(buffer, 0, buffer.length);
                } catch (IOException ex) {
                    Logger.getLogger(player_thread.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } 
        audio_out.close();
        audio_out.drain();
        System.out.println("stop");
        }
    }
