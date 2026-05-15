/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.villaca.interface5;

/**
 *
 * @author 10380
 */
public class Flauta implements InstrumentoMusical {

    @Override
    public void tocar() {
        System.out.println("Tocando Flauta");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando Flauta");
    }

}
