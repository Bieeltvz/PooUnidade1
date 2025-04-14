/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herancaparte2.model;

/**
 *
 * @author gtvargas
 */
public class Quadrado extends Figura {
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }


    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    
        public String Desenhar(){
        return "desenho de um triangulo";
    }
}
