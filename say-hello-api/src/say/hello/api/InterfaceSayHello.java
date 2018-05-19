/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package say.hello.api;

/**
 *
 * @author okin97
 */

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author user
 */
public interface InterfaceSayHello extends Remote {
    public String cekBilanganPrima(int angka) throws RemoteException;
    public String cekLuasBalok(int angka1, int angka2, int angka3) throws RemoteException;
    public String cekVolumeBalok(int angka1, int angka2, int angka3) throws RemoteException;
    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
    
}
