/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exemploiterador;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author gtvargas
 */
public class ExemploIterador {

    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList();
        pessoas.add(new Pessoa("Jurandir", 10));
        pessoas.add(new Pessoa("Esaclir", 19));
        pessoas.add(new Pessoa("Jeremias", 20));
        pessoas.add(new Pessoa("Mesaclir", 66));
        pessoas.add(new Pessoa("Jucelino", 22));

        // pessoas.clear(); remove tudo
        Iterator<Pessoa> iterator = pessoas.iterator();
        Pessoa p;
        System.out.println("Antes de ordenar");
        System.out.println(pessoas);

        pessoas.sort(new ComparadorNome());

        System.out.println("Depois de ordenar: ");
        System.out.println(pessoas);
        System.out.println("Antes de ordenar idade");
        System.out.println(pessoas);

        pessoas.sort(new ComparadorIdade());

        System.out.println("Depois de ordenar idade ");
        System.out.println(pessoas);
        System.out.println("Antes do filtro:");
        System.out.println(pessoas);
        System.out.println("Tamanho da lista eh: " + pessoas.size());
//        while (iterator.hasNext()) {
//            p = iterator.next();
//            if (p.getNome().endsWith("ir")) {
//                iterator.remove();
//            }
            //iterator.remove();
       // }
        System.out.println("Depois do filtro:");
        System.out.println(pessoas);
        System.out.println("Tamanho da lista eh: " + pessoas.size());

//        for (Pessoa p: pessoas){ // nao funciona
//            pessoas.remove(p);
//        }
    }
}
