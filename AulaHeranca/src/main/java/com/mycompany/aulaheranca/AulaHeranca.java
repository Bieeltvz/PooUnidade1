/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.aulaheranca;

import Model.CalculadoraCientifica;
import Model.Classe2;

/**
 *
 * @author vhenkels
 */
public class AulaHeranca {

    public static void main(String[] args) {
        CalculadoraCientifica calcCien = new CalculadoraCientifica();
        calcCien.potencia(2, 2);
        System.out.println(calcCien.getMemoria());
        
        Classe2 c = new Classe2();
    }
}
