/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.lista6.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
/**
 *
 * @author gtvargas
 */
public class FuncionarioTest {
    
    public FuncionarioTest() {
    }

    @Test
    public void testFuncionarioIdentificaFaixa1() {
        Funcionario funcionario = new Funcionario("Nome", 850);
        Faixairpf esperado = Faixairpf.PRIMEIRA;
        
        Faixairpf resultado = funcionario.identificarFaixairpf();
        
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testeIrpfFaixa2(){
        double salario = 2000;
        Funcionario funcionario = new Funcionario("Nome", salario);
        
        double esperado = 150;
        
        double resultado = funcionario.calcularirpf();
        
        assertEquals(esperado, resultado);
        
    }
    
    @Test
    public void testeSalarioInvalido(){
         
        Funcionario funcionario = new Funcionario("Nome", 1000);
       double salario = -20;
        
        Exception ex = assertThrows(IllegalArgumentException.class, 
                () -> {
                    funcionario.setSalario(salario);
                });
        
        String esperado = "Salario invalido.";
        
        assertEquals(esperado, ex.getMessage());
        
    }
    
    
}
