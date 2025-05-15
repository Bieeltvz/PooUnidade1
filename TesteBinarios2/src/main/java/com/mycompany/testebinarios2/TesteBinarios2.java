/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.testebinarios2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author gtvargas
 */
public class TesteBinarios2 {

    public static void main(String[] args) {
        File arquivo = new File("objetos.data");
        Pessoa p = new Pessoa("Adelaide", 65);
        try {
           arquivo.createNewFile();
            FileOutputStream fos = new FileOutputStream(arquivo);
           ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p);
        } catch (IOException ex) {
            ex.printStackTrace();
       }


    }
}
