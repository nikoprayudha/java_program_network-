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
public class BacaString {
    public static void main(String[] args) {
        String str;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Masukan String (akhiri dengan \"end\") :");
            do {                
                str = br.readLine();
                System.out.println("Kata Terbaca :"+str);
            } while (str.equalsIgnoreCase("end")==false);
        } catch (IOException e) {
            System.out.println("Ada Eror 10");
            System.exit(0);
        }
    }
}
