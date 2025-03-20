/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista6.model;

/**
 *
 * @author gtvargas
 */
public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (this.nome.isEmpty() || this.nome.isBlank()) {
            throw new IllegalArgumentException("Caracteres incorretos, tente novamente. ");
        }
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario <= 0) {
            throw new IllegalArgumentException("Salario invalido.");
        }
        this.salario = salario;
    }

    public Faixairpf identificarFaixairpf() {
        if (salario < 1903.98) {
            return Faixairpf.PRIMEIRA;
        } else if (salario > 1903.99 && salario < 2826.65) {
            return Faixairpf.SEGUNDA;
        } else if (salario > 2826.66 && salario < 3751.05) {
            return Faixairpf.TERCEIRA;
        } else if (salario > 3751.06 && salario < 4664.68) {
            return Faixairpf.QUARTA;
        } else {
            return Faixairpf.QUINTA;
        }
    }

    public double calcularirpf() {
        double salario = this.salario;
        double aux = 0;
        Funcionario funcionario = new Funcionario();
        switch (funcionario.identificarFaixairpf()) {
            case PRIMEIRA:
                System.out.println("Isento de imposto de renda");
                break;
            case SEGUNDA:
                aux = 2826.65;
                double resultado = aux - salario;
                System.out.println("Deve pagar: " + resultado * 0.075 + "de IRPF.");
                break;
            case TERCEIRA:
                aux = 3751.05;
                resultado = aux - salario;
                System.out.println("Deve pagar: " + resultado * 0.15 + "de IRPF.");
                break;
            case QUARTA:
                aux = 4664.68;
                resultado = aux - salario;
                System.out.println("Deve pagar: " + resultado * (22.5 / 100) + "de IRPF.");
                break;
            case QUINTA:
                aux = 4664.69;
                resultado = aux - salario;
                System.out.println("Deve pagar: " + resultado * (27.5 / 100) + "de IRPF.");
                break;
            default:
                System.out.println("Valor invalido.");             
        }
        return 0;
        

    }

}
