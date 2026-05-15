/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.villaca.interface1;

/**
 *
 * @author 10380
 */
public class Animal implements SerVivo{

    @Override
    public void mover() {
        System.out.println("Movendo");
    }

    @Override
    public void comer(int massa) {
        System.out.println("Comendo");
    }

    @Override
    public void info() {
        System.out.println("Info");
    }
    
}
