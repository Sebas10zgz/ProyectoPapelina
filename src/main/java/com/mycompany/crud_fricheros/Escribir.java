/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crud_fricheros;

import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author jorge
 */
public class Escribir {
    
    public void escritura(String datos) throws IOException{
        
        FileWriter fichero = null;
        
        try {
            
            fichero = new FileWriter("Catalogo.txt", false);
            
            fichero.write(datos);
            
        } catch (Exception e2) {
            e2.printStackTrace();
        } finally {
            try {
                if (null != fichero) 
                    fichero.close();
                
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
}
