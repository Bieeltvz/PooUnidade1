/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade3;

/**
 *
 * @author gtvargas
 */
public class Funcionarios {

    String nome;
    double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isEmpty() || nome.isBlank()){
            throw new IllegalArgumentException("O nome eh invalido");
        }
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario <= 0){
            throw new IllegalArgumentException("O saldo eh invalido");
        }
        
        this.salario = salario;
    }

    public double cacularIrpf() {
        double pagar = 0;
        if (salario <= 1903.98) {
            return 0;
        } else if (salario <= 2826.65) {
            pagar = (salario * 0.075) - 142.80;
        } else if (salario <= 3751.05) {
            pagar = (salario * 0.15) - 354.80;
        } else if (salario <= 4664.68) {
            pagar = (salario * 0.225) - 636.13;
        } else {
            pagar = (salario * 0.275) - 869.36;
        }

        return pagar;
    }
}
/**
 *   private static final double FAIXA_1_LIMITE_SUP = 1903.98;
    private static final double FAIXA_2_LIMITE_INF = 1903.99;
    private static final double FAIXA_2_LIMITE_SUP = 2826.65;
    private static final double FAIXA_3_LIMITE_INF = 2826.66;
    private static final double FAIXA_3_LIMITE_SUP = 3751.05;
    private static final double FAIXA_4_LIMITE_INF = 3751.06;
    private static final double FAIXA_4_LIMITE_SUP = 4664.68;
    private static final double FAIXA_5_LIMITE_INF = 4664.69;
    private static final double ALIQUOTA_FAIXA_2 = 0.075;
    private static final double ALIQUOTA_FAIXA_3 = 0.15;
    private static final double ALIQUOTA_FAIXA_4 = 0.225;
    private static final double ALIQUOTA_FAIXA_5 = 0.275;
 */