/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista4.Model;

import javax.swing.JOptionPane;

/**
 *
 * @author gtvargas
 */
public class AppQuestao2Ui {

    public static void main(String[] args) {
        Retangulo r4 = new Retangulo();
        String altura = JOptionPane.showInputDialog(null, "Informe a altura: ");
        r4.setAltura(Integer.parseInt(altura));
        String comprimento = JOptionPane.showInputDialog(null, "Informe o comprimento: ");
        r4.setComprimento(Integer.parseInt(comprimento));
        
        JOptionPane.showMessageDialog(null, r4.calcularArea());
        JOptionPane.showMessageDialog(null, r4.calcularPerimetro());
    }
}
