/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage3;

/**
 *
 * @author gtvargas
 */
import java.util.Scanner;
public class App3 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pessoa3[] pessoa = new Pessoa3[3];
        Pessoa3 p = new Pessoa3();
        for(int i = 0; i < 3; i++){
        p = new Pessoa3();
        System.out.println("Qual o nome da pessoa?");
        p.nome = teclado.next();
        System.out.println("Qual a altura da pessoa?");
        p.altura = teclado.nextDouble();
        System.out.println("Qual o peso da pessoa?");
        p.peso = teclado.nextDouble();
        pessoa[i] = p;
        }
        for (int i = 2; i >= 0; i--){
            p = pessoa[i];
            System.out.println("O imc da pessoa " + p.nome + " eh " + p.calcularimc());
        }
        teclado.close();
    }
}

