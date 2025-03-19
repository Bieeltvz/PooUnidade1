/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista02;



/**
 *
 * @author gtvargas
 */
public class Pessoa {
    double altura;
    double peso;
    String nome;
    
    public void setAltura(double altura){
        if (altura < 0){
            throw new IllegalArgumentException("Altura invalida");
        }
        this.altura = altura;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    public void setPeso(double peso){
        if (peso < 0){
            throw new IllegalArgumentException("Peso invalido");
        }
        this.peso = peso;
    }
    
    public double getPeso(){
        return this.peso;
    }
    
    public void setNome(String nome){
        if (nome.trim().isEmpty()){
            throw new IllegalArgumentException("Nome invalido");
        }
        this.nome = nome;
    }
    //if () nome.isEmpty()|| nome.isBlank()   nome.trim().isEmpty()
    
    public String getNome(){
        return this.nome;
    }
    public double calcularimc(){
        return peso / (altura * altura);
    }
}
