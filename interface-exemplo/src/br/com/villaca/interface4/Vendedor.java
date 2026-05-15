/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.villaca.interface4;

/**
 *
 * @author 10380
 */
public class Vendedor extends Funcionario{

    @Override
    public void trabalhar() {
        System.out.println("Vendedor Trabalhando");
    }

    @Override
    public void descansar() {
        System.out.println("Vendedor Descansando");
    }
    
}
