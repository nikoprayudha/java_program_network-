/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BacaKarakter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author TOSHIBA-97
 */
public class tugas {
    public static void main(String[] args) {
        int a = 0,b = 0,c =0 ,d=0,e=0;
         try {
            
            FileReader f = new FileReader("E:\\KULIAH\\SEMESTER 5\\PEMROGRAMAN JARINGAN\\a.txt");
            BufferedReader r = new BufferedReader(f);
            String s = null;
            while((s=r.readLine())!=null){
                System.out.println(s);    
                String output = s.toLowerCase();
//                perulangan
                for (int i = 0; i < s.length(); i++) {
                    if (output.charAt(i)=='a'){
                        a++;
                    }
                    if (output.charAt(i)=='b'){
                        b++;
                    }
                    if (output.charAt(i)=='c'){
                        c++;
                    }
                    if (output.charAt(i)=='d'){
                        d++;
                    }
                    if (output.charAt(i)=='e'){
                        e++;
                    }
                }
//                output 
                System.out.println("Total a = " + a);
                System.out.println("Total b = " + b);
                System.out.println("Total c = " + c);
                System.out.println("Total d = " + d);
                System.out.println("Total e = " + e);
                                
            }
            r.close();
            f.close();
        } catch(FileNotFoundException aku){
        System.out.println("File Not Found !");
        System.exit(1);
        } catch (Exception aku) {
        }
    }
}
