/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arquivostexto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gtvargas
 */
public class ArquivosTexto {

    public static void main(String[] args) {
        File arquivo = new File("arquivo-texto.txt");
        try {
            arquivo.createNewFile();
            PrintWriter arquivoTexto = new PrintWriter(arquivo, "utf-8");
            arquivoTexto.println("Um texto qualquer");
            arquivoTexto.println("Oi teste");
            arquivoTexto.close();
        } catch (IOException ex){
            Logger.getLogger(ArquivosTexto.class.getName()).log(Level.SEVERE,null, ex);
        }
        
        try {
            FileReader reader = new FileReader(arquivo);
            BufferedReader buffer = new BufferedReader(reader);
            
            
            Scanner scanner = new Scanner(arquivo);
            String linha = buffer.readLine();
            while(linha != null){
                System.out.println(linha);
                linha = scanner.nextLine();
                
                
            }
        }  catch (FileNotFoundException ex){
            Logger.getLogger(ArquivosTexto.class.getName()).log(Level.SEVERE,null, ex);
        }
        }
        
    }

