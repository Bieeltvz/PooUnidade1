/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade3;
import java.util.Scanner;

/**
 *
 * @author Usuário
 */
public class App {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Funcionarios[] funcionarios = new Funcionarios[5];
        
        Funcionarios f = new Funcionarios();
        for (int i = 0; i < 5; i++) {
            funcionarios[i] = new Funcionarios(); 

            System.out.println("Qual o nome do funcionário?");
            funcionarios[i].setNome(teclado.next());

            System.out.println("Qual o salário do funcionário?");
            funcionarios[i].setSalario(teclado.nextDouble());
           
        }

        System.out.println("\n--- Relação de Funcionários e IRPF ---");
        for (int i = 0; i < funcionarios.length; i++) {
            double irpf = funcionarios[i].cacularIrpf();
            System.out.println("Funcionário: " + funcionarios[i].getNome() +
                               " | Salário: R$ " + funcionarios[i].getSalario() +
                               " | IRPF a pagar: R$ " + irpf);
        }

        teclado.close();
    }
}
