/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herancaparte2.model;

/**
 *
 * @author gtvargas
 */
public class Circulo extends Figura {
    private double raio;
    
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public Circulo(double raio){
        setRaio(raio);
    }
    public String Desenhar(){
        return "desenho de um circulo";
    }
}
