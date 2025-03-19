/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetoteste;

/**
 *
 * @author gtvargas
 */
public class ProjetoTeste {

    public static void main(String[] args) {
        Gato gato;
        gato = new Gato();
        gato.nome = "mingau";
        gato.cor = "branco";
        gato.peso = 2.5f;
        
        System.out.println("O nome do gato eh: " + gato.nome);
        System.out.println(gato.miar());
        
        Pessoa joao;
        joao = new Pessoa();
        joao.altura = 1.75;
        joao.peso = 78;
        System.out.println("O Imc da pessoa eh de:" + joao.calcularimc());
 
    }
}
