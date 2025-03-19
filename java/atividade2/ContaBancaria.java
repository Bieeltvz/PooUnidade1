/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade2;

/**
 *
 * @author gtvargas
 */
public class ContaBancaria {

    private String numero;
    private String titular;
    private double saldo;

    public void setNumero(String numero) {
        if (numero.trim().isEmpty()) {
            throw new IllegalArgumentException("Numero da conta esta invalido");
        }
        this.numero = numero;
    }

    public String getNumero() {
        return this.numero;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        if (titular.trim().isEmpty()) {
            throw new IllegalArgumentException("Titular da conta eh invalido");
        }
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor invalido");
        }
        this.saldo += valor;

    }

    public void sacar(double valor) {
        if (valor <= 0 || valor > this.saldo) {
            throw new IllegalArgumentException("Valor invalido ou saldo insuficiente");
        }
        this.saldo -= valor;
    }

    public void transferir(ContaBancaria destino, double valor) {
        sacar(valor);
        destino.depositar(valor);
    }

}
