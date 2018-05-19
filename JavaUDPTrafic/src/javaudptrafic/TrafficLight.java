/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaudptrafic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import javax.swing.Timer;
import javax.swing.ImageIcon;

/**
 *
 * @author TOSHIBA-97
 */
public class TrafficLight extends javax.swing.JFrame {

    /**
     * Creates new form TrafficLight
     */
    public TrafficLight() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lampu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Lampu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaudptrafic/hijau.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lampu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Lampu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Timer timer = new Timer(10, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String lampu;
                    int port =1997;
                    byte[] buffer = new byte[656];
                    DatagramPacket incoming = new DatagramPacket(buffer, buffer.length);
                    DatagramSocket ds = new DatagramSocket(port);
                    ds.receive(incoming);
                    byte[] data = incoming.getData();
                    lampu = new String(data, 0, data.length);
                    System.out.println("lampu = " + lampu);

                    ImageIcon merah = new ImageIcon("D:\\Documents\\merah.png");
                    ImageIcon kuning = new ImageIcon("D:\\Documents\\kuning.png");
                    ImageIcon hijau = new ImageIcon("D:\\Documents\\hijau.png");
                    lampu=lampu.trim();

                    switch(lampu){
                        case "merah":
                            Lampu.setIcon(merah);
                            break;
                        case "hijau":
                            Lampu.setIcon(hijau);
                            break;
                        case "kuning":
                            Lampu.setIcon(kuning);
                            break;
                        case "stop":
                            System.exit(0);
                            break;
                    }

                    ds.close();

                }catch (IOException e) {
                    System.err.println(e);
                }
            }
        });
        timer.start();
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TrafficLight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrafficLight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrafficLight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrafficLight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrafficLight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lampu;
    // End of variables declaration//GEN-END:variables

   
    
}
