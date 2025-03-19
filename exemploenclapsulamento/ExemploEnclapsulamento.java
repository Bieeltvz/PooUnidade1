/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemploenclapsulamento;

/**
 *
 * @author gtvargas
 */
public class ExemploEnclapsulamento {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        
        p.setAltura(1.86);
        p.setPeso(90);
        
        System.out.println("A altura eh: " + p.getAltura());
        System.out.println("O peso eh: " + p.getPeso());
    }
}
