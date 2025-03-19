/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista4.Model;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author gtvargas
 */
public class AppQuestao3Ui {
    public static void main(String[] args) {
        String altura = JOptionPane.showInputDialog(null, "Informe a altura: ");
        String comprimento = JOptionPane.showInputDialog(null, "Informe o comprimento: ");
        Retangulo r0 = new Retangulo(Integer.parseInt(altura), Integer.parseInt(comprimento));
        
        JOptionPane.showMessageDialog(null, r0.calcularArea());
        JOptionPane.showMessageDialog(null, r0.calcularPerimetro());
    }
}
