/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappobject;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author TOSHIBA-97
 */
public class InsertData {
   
  public static void main(String[] args) throws Exception {
    String url = "jdbc:mysql://192.168.43.127:3306/pemrogjar";
        String user = "baru";
        String password = "1234";
 
        String filePath = "E:\\nikoobject1.txt";
 
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            
            String sql = "INSERT INTO simpan_object (id, keterangan, data) values (?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, 6);
            statement.setString(2, "File Pegawai");
            InputStream inputStream = new FileInputStream(new File(filePath));
 
            statement.setBlob(3, inputStream);
            int row = statement.executeUpdate();
            if (row > 0) {
                System.out.println("Suskes Insert data");
            }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
  }
}
