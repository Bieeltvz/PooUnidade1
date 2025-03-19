/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista02;

/**
 *
 * @author gtvargas
 */
import java.util.Scanner;
public class App {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pessoa[] pessoa = new Pessoa[3];
        Pessoa p = new Pessoa();
        for(int i = 0; i < 3; i++){
        p = new Pessoa();
        System.out.println("Qual o nome da pessoa?");
        p.setNome(teclado.next());
        System.out.println("Qual a altura da pessoa?");
        p.setAltura(teclado.nextDouble());
        System.out.println("Qual o peso da pessoa?");
        p.setPeso(teclado.nextDouble());
        pessoa[i] = p;
        }
        for (int i = 2; i >= 0; i--){
            p = pessoa[i];
            System.out.println("O imc da pessoa " + p.nome + " eh " + p.calcularimc());
        }
        teclado.close();
    }
}

