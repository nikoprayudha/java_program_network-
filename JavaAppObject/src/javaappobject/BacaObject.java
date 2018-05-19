/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappobject;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author TOSHIBA-97
 */
public class BacaObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("E:\\nikoobject.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Pegawai p1 = null;
            p1.cetak();
            p1=(Pegawai)ois.readObject();
            p1.cetak();
            fis.close();
            ois.close();
        } catch (Exception e) {
        }
    }

    void cetakBaca() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
