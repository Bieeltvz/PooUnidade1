/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista7funcional.model;

/**
 *
 * @author gtvargas
 */
public class Imovel {

    private String endereco;
    private int area;
    public Finalidade finalidade;
    public Bairro bairro;

    public Imovel(String endereco, int area, Finalidade finalidade, Bairro bairro) {
        setEndereco(endereco);
        setArea(area);
        setFinalidade(finalidade);
        setBairro(bairro);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco.isEmpty() || nome.isBlank()) {
            throw new IllegalArgumentException("O endereço eh invalido");
        }
        this.endereco = endereco;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        if (area <= 0) {
            throw new IllegalArgumentException("Valor invalido: " + area);
        }
        this.area = area;
    }

    public Finalidade getFinalidade() {
        if (finalidade == null) {
            throw new IllegalArgumentException("Invalido.");
        }
        return finalidade;
    }

    public void setFinalidade(Finalidade finalidade) {
        this.finalidade = finalidade;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        if (bairro == null) {
            throw new IllegalArgumentException("Bairro invalido.");
        }
        this.bairro = bairro;
    }
    private double calcularResidencial() {
        return area * bairro.getCoeficienteIptu();

    }

    private double calculoComercial() {
        if (area <= 100) {
            return 500 * bairro.getCoeficienteIptu();
        }

        if (area <= 400) {
            return 1000 * bairro.getCoeficienteIptu();
        }

        return (area * 2.55) * bairro.getCoeficienteIptu();

    }

    private double calculoIndustrial() {
        if (area <= 2000) {
            return 1000 * bairro.getCoeficienteIptu();
        }
        return (area * 0.55) * bairro.getCoeficiente();
    }

    public double calcularIptu(double area,  
        enum finalidade) {
        setEndereco(endereco);
        setArea(area);
        setFinalidade(finalidade);
        setBairro(bairro);

        switch (finalidade) {
            case RESIDENCIAL:
                return calculoResidencial();
                break;
            case COMERCIAL:
                return calculoComercial();
                break;
            case INDUSTRIAL:
                return calculoIndustrial();
                break;
            default:
                System.out.println("Tipo de imóvel inválido.");
                return -1;
        }

    }

    
}
