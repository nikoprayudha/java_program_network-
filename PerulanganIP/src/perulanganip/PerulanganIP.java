/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulanganip;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA-97
 */
public class PerulanganIP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          
   
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan IP: ");
    String bil1 =  input.next();
    String[] a = bil1.split("\\.");
    
    
    System.out.print("Jumlah Client: ");
    int bil2=  input.nextInt();
    
    int hasil;
    hasil= Integer.parseInt(a[3]);
       for(int i=1; i<=bil2; i++){
           System.out.println(""+a[0]+"."+a[1]+"."+a[2]+"."+hasil);
           hasil++;
       }     
  
  
    } 
}
