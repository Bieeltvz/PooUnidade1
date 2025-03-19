/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista4.Model;

/**
 *
 * @author gtvargas
 */
public class App {

    public static void main(String[] args) {
        Retangulo r = new Retangulo();
        int altura, comprimento;
        altura = 10;
        comprimento = 10;
        Retangulo r2 = new Retangulo(altura, comprimento);
        r.calcularPerimetro();
        r.calcularArea();
        r2.calcularPerimetro();
        r2.calcularArea();
    }
}
