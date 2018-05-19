/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuisstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author TOSHIBA-97
 */
public class INPUT2 {
    public static void main(String[] args) throws IOException
{
int angka1, angka2;
BufferedReader br;
br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Masukkan Angka1 : ");
angka1 = Integer.parseInt(br.readLine());
System.out.print("Masukkan Angka2 : ");
angka2 = Integer.parseInt(br.readLine());
System.out.println("Angka1 Anda : "+ angka1);
System.out.println("Angka2 Anda : "+ angka2);
}
}
