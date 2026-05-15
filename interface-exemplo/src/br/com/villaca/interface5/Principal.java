/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.villaca.interface5;

/**
 *
 * @author 10380
 */
public class Principal {

    public static void main(String[] args) {
        
        InstrumentoMusical instrumento = new Violao();
        tocarInstrumento(instrumento);
        
        instrumento = new Piano();
        tocarInstrumento(instrumento);
        
        instrumento = new Flauta();
        tocarInstrumento(instrumento);
    }

    public static void tocarInstrumento(InstrumentoMusical instrumento){
        instrumento.tocar();
        instrumento.afinar();
        System.out.println("--------------------");
    }
}
