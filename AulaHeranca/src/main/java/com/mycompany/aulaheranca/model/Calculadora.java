/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author vhenkels
 */
public class Calculadora {
    protected double memoria;
    public double somar(double a, double b){
        memoria = a+b;
        return memoria;
    }
    
    public int somar(int a, int b){
        return a+b;
    }
    public double subtrair(double a, double b){
        memoria=a-b;
        return memoria;
    }
    
    public double multiplicar(double a, double b){
        memoria = a*b;
        return memoria;
    }
    
    public double dividir(double a, double b){
        memoria =a/b;
        return memoria; 
    }

    public double getMemoria() {
        return memoria;
    }

   
    
    
    
    
    
    
}
