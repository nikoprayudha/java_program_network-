/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.muticastuas;

import java.io.File;
import java.io.FilenameFilter;

public class ImageFileFilter implements FilenameFilter{
    
    @Override
    public boolean accept(File dir, String name) {
         String nameLc = name.toLowerCase();
	      return nameLc.endsWith(".jpg") ? true : false;
    }
        
}
