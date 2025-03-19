/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista4.Model;

/**
 *
 * @author gtvargas
 */
public class Retangulo {

    private int altura;
    private int comprimento;
    
    /**
     * construtor da classe Retangulo sem parametros, cria um objeto com variaveis altura e comprimento iguais a 0.
     */
    public Retangulo() {
        this.altura = 0;
        this.comprimento = 0;
    }
    /**
     * construtor da classe Retangulo com parametros, cria um objeto com variaveis altura e comprimento com valores a serem definidos.
     * @param altura
     * @param comprimento 
     */
    public Retangulo(int altura, int comprimento) {
        this.altura = altura;
        this.comprimento = comprimento;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Valor invalido: " + altura);
        }
        this.altura = altura;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        if (comprimento <= 0) {
            throw new IllegalArgumentException("Valor invalido: " + comprimento);
        }
        this.comprimento = comprimento;
    }
    /**
     * calcula o perimetro do retangulo
     * @return perimetro
     */
    public int calcularPerimetro() {
        int perimetro = (this.altura * 2) + (this.comprimento * 2);
        System.out.println(perimetro);
        return perimetro;
    }
    /**
     * calcula a area do retangulo
     * @return area
     */
    public int calcularArea() {
        int area = this.altura * this.comprimento;
        System.out.println(area);
        return area;
    }

}
