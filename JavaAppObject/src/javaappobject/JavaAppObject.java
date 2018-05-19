/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappobject;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 *
 * @author TOSHIBA-97
 */
public class JavaAppObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pegawai p1= new Pegawai("02", "Faiz", "Mahasiswa", true, 20, 5000000);
        p1.cetak();
        try {
            FileOutputStream fos=new FileOutputStream("E:\\nikoobject1.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p1);
            oos.close();
            fos.close();
        } catch (Exception e) {
        }
    }
    
}
