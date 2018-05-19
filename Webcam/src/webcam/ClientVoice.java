/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webcam;

/**
 *
 * @author user
 */
public class ClientVoice {
    public static boolean calling = false;
    public static boolean jawab = false;
    public static void main(String[] args) {
        // TODO code application logic here
        Client sv = new Client ();
        sv.setVisible(true);
    }
}
