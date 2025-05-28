/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemploiterador;

/**
 *
 * @author gtvargas
 */
public class Pessoa implements Comparable {
    public String nome;
    public int idade;

    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }
    
    @Override
    public String toString(){
        return "Nome: " + nome + "Idade: " + idade;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public int compareTo(Object o) {      
        Pessoa p = (Pessoa) o;
        return this.getNome().compareTo(p.getNome());
        
    }
    
    
    
}
