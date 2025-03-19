/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista3;

/**
 *
 * @author gtvargas
 */
public class App {

    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        System.out.println("Informe seu Nome: ");
        f.setNome(f.teclado.next());
        System.out.println("Informe seu salario: ");
        f.setSalario(f.teclado.nextDouble());
        f.cacularirpf();
        
        System.out.println(f.cacularirpf());
    }
}
