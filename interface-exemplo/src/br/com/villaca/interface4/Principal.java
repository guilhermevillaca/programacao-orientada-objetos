/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.villaca.interface4;

/**
 *
 * @author 10380
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Trabalhador trabalhador = new Engenheiro();
        trabalhador.trabalhar();
        trabalhador.descansar();
        
        //Funcionario funcionario = new Engenheiro();
        //Engenheiro engenheiro = new Engenheiro();
        
        trabalhador = new Vendedor();
        trabalhador.trabalhar();
        trabalhador.descansar();
    }
    
}
