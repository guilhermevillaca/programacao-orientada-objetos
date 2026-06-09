/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.villaca.app;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author 10380
 */
public class Principal {

    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {

            System.out.println("===== "
                    + "\nDigite:"
                    + "\n 0 para sair"
                    + "\n 1 para inserir "
                    + "\n 2 para Exibir os dados "
                    + "\n"
                    + "=====");
            System.out.println();

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                Inserir.executar();
            } else if (opcao == 2) {
                Exibir.executar();
            } else if (opcao == 0) {
                System.out.println("Encerrando o sistema...");
            } else {
                System.out.println("Opção inválida.");
            }
        }

    }

}
