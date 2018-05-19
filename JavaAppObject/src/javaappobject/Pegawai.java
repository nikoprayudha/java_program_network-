/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappobject;

import java.io.Serializable;

/**
 *
 * @author TOSHIBA-97
 */
public class Pegawai implements Serializable{
    String id,nama,jabatan;
    boolean jk;
    int umur,gaji;

    public Pegawai(String id, String nama, String jabatan, boolean jk, int umur, int gaji) {
        this.id = id;
        this.nama = nama;
        this.jabatan = jabatan;
        this.jk = jk;
        this.umur = umur;
        this.gaji = gaji;
    }

  public void cetak(){
      System.out.println("Id nya :"+this.id);
      System.out.println("Nama nya :"+this.nama);
      System.out.println("Jabatanya nya :"+this.jabatan);
      System.out.println("Umur nya :"+this.umur);
      System.out.println("JK nya :"+this.jk);
      System.out.println("Gaji nya :"+this.gaji);
  }
    
    
}
