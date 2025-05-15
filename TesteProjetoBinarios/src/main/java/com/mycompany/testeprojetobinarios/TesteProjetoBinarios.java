/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.testeprojetobinarios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;

/**
 *
 * @author gtvargas
 */
public class TesteProjetoBinarios {

    public static void main(String[] args) {
        File arquivo = new File("dados-primitivos.dat");
        try {
            arquivo.createNewFile();
            FileOutputStream fos = new FileOutputStream(arquivo);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeDouble(3.14);
            dos.writeUTF("FURB");
            dos.close();
            fos.close();
        } catch (IOException ex) {
            Logger.getLogger(TesteProjetoBinarios.class.getName());
        }

        try {
            FileInputStream fis = new FileInputStream(arquivo);
            DataInputStream dis = new DataInputStream(fis);
            System.out.println(dis.readDouble());
            System.out.println(dis.readUTF());
        } catch (FileNotFoundException ex) {
            
        }

    }
}
File arquivo = new File("objetos.data");
try{
arquivo.createNewFile();
FileOutputStream fo s=  new FileOutputStream(arquivo);
ObjectOutputStream oos = new ObjectOutputStream(fos);


} catch {

}