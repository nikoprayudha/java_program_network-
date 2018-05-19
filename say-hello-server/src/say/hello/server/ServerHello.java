/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package say.hello.server;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.*;

/**
 *
 * @author okin97
 */
public class ServerHello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException, NotBoundException{
        int i=1;
        Registry registry = LocateRegistry.createRegistry(1099);
        ImplementsSayHello sh = new ImplementsSayHello(i);
        registry.rebind("sayHello", sh);
        System.out.println("server telah berjalan");
        i++;
        
        // TODO code application logic here
    }
    
}
