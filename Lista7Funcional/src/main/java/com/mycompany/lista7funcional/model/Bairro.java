/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista7funcional.model;

/**
 *
 * @author gtvargas
 */
public class Bairro {

    private String nome;
    private double coeficienteIptu;
    
    public Bairro(String nome, double coeficienteIptu){
        setNome(nome);
        setCoeficienteIptu(coeficienteIptu);
        this.nome = nome;
        this.coeficienteIptu = coeficienteIptu;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isEmpty() || nome.isBlank()) {
            throw new IllegalArgumentException("O nome eh invalido");
        }
        this.nome = nome;
    }

    public double getCoeficienteIptu() {
        return coeficienteIptu;
    }

    public void setCoeficienteIptu(double coeficienteIptu) {
        if (coeficienteIptu <= 0) {
            throw new IllegalArgumentException("Valor invalido: " + coeficienteIptu);
        }
        coeficienteIptu = 2.5;
        this.coeficienteIptu = coeficienteIptu;
    }

}
