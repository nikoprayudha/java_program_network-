/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BacaKarakter;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author TOSHIBA-97
 */
public class BacaKarakter {
    public static void main(String[] args) {
        char c;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Masukan karakter (akhiri dengan \"q\"):");
            do {                
                c = (char) br.read();
                System.out.println("Karakter terbaca :"+c);
            } while (c!='q');
        } catch (Exception e) {
            System.out.println("Ada Eror IO");
            System.exit(0);
        }
    }
}

