/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demonstracaoarraylist;

import java.util.ArrayList;

/**
 *
 * @author gtvargas
 */
public class App {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList();
        
        Pessoa p1 = new Pessoa("Ana", 22);
        pessoas.add(p1);
        
        Pessoa p2 = new Pessoa("Valentina", 20);
        pessoas.add(p2);
        
        //Pessoa p;
        //for(int i = 0; i < pessoas.size(); i++){
           // p = pessoas.get(i);
           // System.out.println("Pessoa: " + p.getNome());
       // }
         for (Pessoa p: pessoas) {
            System.out.println("Pessoa: " + p.getNome());
}
    }
  
}
