/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista13.model;

import java.io.File;
import java.io.FileInputStream;

/**
 *
 * @author gtvargas
 */
public class ArquivoMp3 {
    private TagMp3 tag;
    
    public ArquivoMp3(String nomeArquivo){
        File arquivo = new File(nomeArquivo);
        if (!arquivo.exists()){
            throw new FileNotFoundEsception("Arquivo: " + " nao existe");
        }
        byte[] dadps = new byte[128];
        FileInputStream file = new FileInputStream(arquivo);
        fis.skip(arquivo.length() - 128);
        fis.read(dados);
    }
}
