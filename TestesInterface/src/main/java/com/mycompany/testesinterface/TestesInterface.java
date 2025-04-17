/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.testesinterface;

/**
 *
 * @author gtvargas
 */
public class TestesInterface {

    public static void main(String[] args) {
        Vaca vaquinha = new Vaca();
        Gato mimi = new Gato();
        Cachorro doguinho = new Cachorro();

        Animal[] animais = new Animal[3];
        animais[0] = new Vaca();
        animais[1] = new Gato();
        animais[2] = new Cachorro();

        for (Animal animal : animais) {
            animal.fazerBarulho();
        }

//        vaquinha.fazerBarulho();
//        mimi.fazerBarulho();
//        doguinho.fazerBarulho();
    }
}
