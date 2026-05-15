/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.villaca.interface2;

/**
 *
 * @author 10380
 */
public interface OperacoesBancarias {
    
    void depositar(double quantia);
    void sacar(double quantia);
    double consultarSaldo();
    
}
