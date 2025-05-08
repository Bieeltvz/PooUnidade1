/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova2.model;

/**
 *
 * @author gtvargas
 */
public class TesouroDireto implements Ativo {

    private double valor;
    private double rentabilidade;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor para o campo valor esta incorreto. ");
        }
        this.valor = valor;
    }

    public double getRentabilidade() {
        return rentabilidade;
    }

    public void setRentabilidade(double rentabilidade) {
        if (rentabilidade <= 0) {
            throw new IllegalArgumentException("Valor para o campo rentabilidade esta incorreto. ");
        }
        this.rentabilidade = rentabilidade;
    }

    public TesouroDireto(double valor, double rentabilidade) {
        this.valor = valor;
        this.rentabilidade = rentabilidade;
    }

    @Override
    public double calcularRendimento() {
        return valor += valor * (rentabilidade / 100);
    }

    @Override
    public double calcularValorInvestido() {
        return valor * (rentabilidade / 100);
    }

}
