/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplotratamentoexcecao.model;

/**
 *
 * @author gtvargas
 */
public class Aluno {
    String nome;
    int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()){
            throw new NomeInvalidoException("Nome invalido");
        }
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade < 1){
            throw new IdadeInvalidaException("Idade invalida");
        }
        this.idade = idade;
    }
    
    
}
