/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author TOSHIBA-97
 */
public class Stream2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                if (args.length != 2) // Two parameters are required,the source and destination
    {
        System.err.println ("Syntax - FileOutput-StreamDemo src dest");
    return;
    }
    String source = args[0];
    String destination = args[1];
    try
    {
    // Open source file for input
     InputStream input = new FileInputStream( source);
        System.out.println ("Opened " + source + " for reading.");
     OutputStream output = new FileOutputStream ( destination); // Ouput output file for output
        System.out.println ("Opened " + destination + " forwriting.");
        
    int data = input.read();
    while ( data != -1)
    {
    // Write byte of data to our file
    output.write (data);
    // Read next byte
    data=input.read();
    }
    // Close both streams
    input.close();
    output.close();
    System.out.println ("I/O streams closed");
    }
    catch (IOException ioe)
    {
    System.err.println ("I/O error - " + ioe);
    }
  }
   
}


