/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package say.hello.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import say.hello.api.InterfaceSayHello;

/**
 *
 * @author okin97
 */
class ImplementsSayHello extends UnicastRemoteObject implements InterfaceSayHello {
    int nama;
    public ImplementsSayHello(int i) throws RemoteException{
        this.nama = i ;
    }
    
    public int getNamaClient(){
        return this.nama;
    }
    public String cekBilanganPrima(int angka){
        System.out.println("Client Meminta Cek Bilangan : " +angka);
        if(angka==2 || angka==3||angka == 5||angka == 7){
            return ("----> "+angka+" adalah bilangan prima");
            
        }else if ((angka % 2 !=0) && (angka % 3 !=0) &&(angka % 5 !=0) && (angka % 7 !=0)){
        return ("----> "+angka+" bukan bilangan prima");
    }else{
            return ("----> " +angka+" bukan bilangan prima");
    }
    }
    
    public String cekLuasBalok(int angka1, int angka2, int angka3){
        System.out.println("Client meminta hasil luas balok : ("+angka1+","+angka2+","+angka3+")");
        double luas = (2*angka1*angka2)+(2*angka1*angka3)+(2*angka2*angka3);
        return "---->luas balok adalah : "+luas; 
    }
    
    public String cekVolumeBalok(int angka1, int angka2, int angka3){
        System.out.println("Client meminta hasil volume :("+angka1+","+angka2+","+angka3+")");
        int volume = angka1 * angka2 * angka3;
        return "----> Volume Balok adalah : "+volume;
    }
}
