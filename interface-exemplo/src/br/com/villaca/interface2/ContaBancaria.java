/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.villaca.interface2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 10380
 */
public class ContaBancaria implements OperacoesBancarias, Notificacoes, Relatorios {
    
    private double saldo;
    private List<String> historicoTransacoes;
    
    public ContaBancaria(){
        this.saldo = 0.0;
        this.historicoTransacoes = new ArrayList<>();
    }

    @Override
    public void depositar(double quantia) {
        saldo += quantia;
        historicoTransacoes.add("Depósito: " + quantia);
        enviarNotificacoes("Depósito de " + quantia + " realizado com sucesso.");
    }

    @Override
    public void sacar(double quantia) {
        if(quantia <= saldo){
            saldo -= quantia;
            historicoTransacoes.add("Saque: " + quantia);
            enviarNotificacoes("Saqe de " + quantia + " realizado com sucesso.");
        }else {
            enviarNotificacoes("Saldo insuficiente para saque de " + quantia);
        }
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    @Override
    public void enviarNotificacoes(String mensagem) {
        System.out.println("Notificação: " + mensagem);
    }

    @Override
    public void gerarRelatorio() {
         System.out.println("Relatorio de Transações:");
         for(String transacao: historicoTransacoes){
             System.out.println(transacao);
         }
         System.out.println("Saldo atual: " + saldo);
    }
    
}
