/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemploenclapsulamento;

/**
 *
 * @author gtvargas
 */
public class Pessoa {

    private double altura;
    private double peso;
/**
 * Metodo para alterar o valor da altura
 * @param altura O novo valor da altura 
 */
    public void setAltura(double altura) {
        if (altura < 0) {
            throw new IllegalArgumentException("Altura invalida");
        }
        this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setPeso(double peso) {
        if (peso < 0){
            throw new IllegalArgumentException("Peso invalido");
        }
        this.peso = peso;
    }
    

    public double getPeso() {
        return this.peso;
    }
/**
 * Realiza o calculo do IMC para o objeto
 * @return O resultado do calculo
 */
    public double calcularImc() {
        return peso / (altura * altura);
    }
}
