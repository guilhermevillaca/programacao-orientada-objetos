/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.villaca.interface2;

/**
 *
 * @author 10380
 */
public class Principal {
    
    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(1000);
        conta.sacar(500);
        conta.depositar(2200);
        conta.sacar(300);
        conta.consultarSaldo();
        conta.gerarRelatorio();
        
    }
    
}
