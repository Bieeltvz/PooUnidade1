/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.herancaparte2.model;

/**
 *
 * @author gtvargas
 */
public class HerancaParte2 {

    public static void main(String[] args) {
        Object[] figuras = new Object[3];
        figuras[0] = new Circulo(1);
        figuras[1] = new Quadrado(2);
        figuras[2] = new Triangulo(3);

        for (Object figura : figuras) {
            //System.out.println(figura.desenhar());
            if (figura.getClass() == Circulo.class) {
                ((Circulo) figura).desenhar();
            }
            if (figura.getClass() == Quadrado.class) {
                ((Quadrado) figura).desenhar();
            }
            if (figura.getClass() == Triangulo.class) {
                ((Triangulo) figura).desenhar();
            }
        }

    }
}
