/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappobject;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.*;



/**
 *
 * @author TOSHIBA-97
 */
public class BacaInsertData {
         public static void main(String[] args) {
        // TODO code application logic here
        String url= "jdbc:mysql://192.168.43.127:3306/pemrogjar";
        String username = "baru";
        String password = "1234";
      try {
        Connection conn = (Connection) DriverManager.getConnection(url, username, password);
        String sql = "SELECT * FROM simpan_object where id=4 ";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet resultSet = stmt.executeQuery();
        while (resultSet.next()) {
            byte[] st = (byte[]) resultSet.getObject("data");
            ByteArrayInputStream bi= new ByteArrayInputStream(st);
            ObjectInputStream ois = new ObjectInputStream(bi);
            Pegawai pl = (Pegawai) ois.readObject();
            pl.cetak();
            bi.close();
            ois.close();
            //System.out.println();

        }
        conn.close();  
          } catch (Exception e) {
          System.out.println(e);
          }
    }
}



