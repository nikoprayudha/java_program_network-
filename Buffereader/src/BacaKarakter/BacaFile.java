/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BacaKarakter;
import java.io.*;
/**
 *
 * @author TOSHIBA-97
 */
public class BacaFile {
    public static void main(String[] args) {
        try {
            
            FileReader f = new FileReader("E:\\KULIAH\\SEMESTER 5\\PEMROGRAMAN JARINGAN\\a.txt");
            BufferedReader r = new BufferedReader(f);
            String s = null;
            while((s=r.readLine())!=null){
                System.out.println(s);
            }
            r.close();
            f.close();
        } catch(FileNotFoundException e){
        System.out.println("File Not Found !");
        System.exit(1);
        } catch (Exception e) {
        }
    }
}
