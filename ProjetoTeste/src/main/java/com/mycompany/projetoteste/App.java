/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoteste;

/**
 *
 * @author gtvargas
 */
import java.util.Scanner;
public class App {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        System.out.println("Qual a altura da pessoa?");
        pessoa.altura = teclado.nextDouble();
        System.out.println("Qual o peso da pessoa?");
        pessoa.peso = teclado.nextDouble();
        System.out.println("O imc eh: " + pessoa.calcularimc());
        
    }
}

