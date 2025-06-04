/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplohashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 *
 * @author gtvargas
 */
public class ExemploHashMap {

    public static void main(String[] args) {
        HashMap<Integer, Aluno> alunos = new LinkedHashMap();
        Aluno a1 = new Aluno(12, "Gilmar", 1234);
        alunos.put(1234, a1);
        alunos.put(3322, new Aluno(13, "Gumercindo", 3322));
        alunos.put(35226, new Aluno(13, "Jurandir", 3526));
        
        int consulta = 3322;
        System.out.println(alunos.containsKey(consulta));
        System.out.println("Consultando chave: " + consulta);
        
        System.out.println(alunos.get(consulta));
        
        HashMap<String, Integer> vegetais = new LinkedHashMap();
        vegetais.put("Maca", 15);
        vegetais.put("Banana", 3);
        vegetais.put("mamao", 5);
        vegetais.put("pera", 8);
        vegetais.put("verganota", 12);
        vegetais.remove("Maca");
        System.out.println(vegetais.get("Maca"));
        
    }
}
