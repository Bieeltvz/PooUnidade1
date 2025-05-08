/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova2.model;

/**
 *
 * @author gtvargas
 */
public class Acao implements Ativo {

    private int qtdCota;
    private double valorCota;
    private double dividendo;

    public int getQtdCota() {
        return qtdCota;
    }

    public void setQtdCota(int qtdCota) {
        if (qtdCota <= 0) {
            throw new IllegalArgumentException("Valor para o campo qtdCota esta incorreto. ");
        }
        this.qtdCota = qtdCota;
    }

    public double getValorCota() {
        return valorCota;
    }

    public void setValorCota(double valorCota) {
        if (valorCota <= 0) {
            throw new IllegalArgumentException("Valor para o campo valorCota esta incorreto. ");
        }
        this.valorCota = valorCota;
    }

    public double getDividendo() {
        return dividendo;
    }

    public void setDividendo(double dividendo) {
        if (qtdCota <= 0) {
            throw new IllegalArgumentException("Valor para o campo dividendo esta incorreto. ");
        }
        this.dividendo = dividendo;
    }

    public Acao(int qtdCota, double valorCota, double dividendo) {
        this.qtdCota = qtdCota;
        this.valorCota = valorCota;
        this.dividendo = dividendo;
    }

    @Override
    public double calcularRendimento() {
        return qtdCota * dividendo;
    }

    @Override
    public double calcularValorInvestido() {
        return qtdCota * valorCota;
    }

}
