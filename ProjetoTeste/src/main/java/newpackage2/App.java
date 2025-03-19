/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage2;

/**
 *
 * @author gtvargas
 */
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pessoa2[] pessoa = new Pessoa2[3];
        Pessoa2 p = new Pessoa2();
        for (int i = 0; i < 3; i++) {
            p = new Pessoa2();
            System.out.println("Qual a altura da pessoa?");
            p.altura = teclado.nextDouble();
            System.out.println("Qual o peso da pessoa?");
            p.peso = teclado.nextDouble();
            pessoa[i] = p;
        }
        for (int i = 0; i < 3; i++) {
            p = pessoa[i];
            System.out.println("O imc da pessoa " + (i + 1) + " eh: " + p.calcularimc());
        }
    }
}
