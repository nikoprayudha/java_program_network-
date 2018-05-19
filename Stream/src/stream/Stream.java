/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author TOSHIBA-97
 */
public class Stream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            if (args.length != 1)
    {
        System.err.println("Syntax - FileInputStreamDemo file");
    return;
    }
    try
    {
    // Membuat input stream yang membaca dr file
    InputStream fileInput = new FileInputStream( args[0] );
    int data = fileInput.read(); // Baca byte ke 1
    while (data != -1) // ulangi : hingga end of file(EOF) dicapai
    {
    System.out.write ( data ); // menampilkan byte data ke console
    data = fileInput.read(); // baca byte berikutnya
    }
    fileInput.close(); // Close the file
    }
    catch (IOException ioe)
    {
    System.err.println ("I/O error - " + ioe);
    }
  }
}   


