/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista9.model;

/**
 *
 * @author gtvargas
 */
public class ContaBancaria {
    private String numero;
    private double saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        this.saldo += saldo;
    }
    
    public void sacar(double valor){
        this.saldo -= saldo;
    }
    public void transferir(ContaBancaria contaDestino, double valor){
        
    }
}
