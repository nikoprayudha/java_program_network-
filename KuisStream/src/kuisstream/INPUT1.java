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
public class INPUT1 {
    public static void main(String[] args) throws IOException
{
String str;
BufferedReader br;
br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Masukkan Nama Anda : ");
str= br.readLine();
System.out.println("Hello "+ str);
}
}