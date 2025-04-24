/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplotratamentoexcecao;

import com.mycompany.exemplotratamentoexcecao.model.Aluno;

import java.util.Scanner;

/**
 *
 * @author gtvargas
 */
public class ExemploTratamentoExcecao {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;
        while(executando){
        int idade = scanner.nextInt();
        String nome = scanner.nextLine();
        
        try{
        Aluno aluno = new Aluno(nome, idade);
            System.out.println("Aluno cadastrado com sucesso");
            executando = false;
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
    }
    }
}
