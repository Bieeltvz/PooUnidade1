/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova2.model;

import java.util.ArrayList;

/**
 *
 * @author gtvargas
 */
public class Cliente {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (this.nome.isEmpty() || this.nome.isBlank()) {
            throw new IllegalArgumentException("Caracteres para o campo nome está incorreto. ");
        }
        this.nome = nome;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }


    public double calcularValorInvestido() {
        return 0;
    }

    ArrayList<Ativo> ativos = new ArrayList();

    public void adicionarAtivo(Ativo ativo) {
        ativos.add(ativo);
    }

    public void removerAtivo(Ativo ativo) {
        if (ativos == null) {
            throw new IllegalArgumentException("Nao existem titulos a serem removidos. ");
        } else {
        ativos.remove(ativo);
        }
    }

    public double calcularRendimentoAtivos() {
        if (ativos == null) {
            return 0;
        } else {
            double valor = 0;
            for (Ativo ativos : ativos) {
                valor += ativos.calcularRendimento();
            }

            return valor;
        }
    }

    public double calcularTotalAtivosInvestido() {
        if (ativos == null) {
            return 0;
        } else {
            double valor1 = 0;
            for (Ativo ativos : ativos) {
                valor1 += ativos.calcularValorInvestido();
            }
            if (ativos == null) {
                return 0;
            }

            return valor1;
        }
    }
}
