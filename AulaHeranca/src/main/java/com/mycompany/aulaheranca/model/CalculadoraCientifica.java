/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author vhenkels
 */
public class CalculadoraCientifica extends Calculadora {

    public double potencia(double valor, double potencia) {
        memoria =(Math.pow(valor, potencia));
        return getMemoria();
    }

    public double raizQuadrada(double valor) {
        memoria = (Math.sqrt(valor));
        return getMemoria();
    }
    @Override
    public double somar(double a,double b){
        memoria = Math.abs(a)+ Math.abs(b);
        return memoria;
    }
    
    public String toString(){
        return "calculadora cientidfica memoria: "+memoria;
    }
}
