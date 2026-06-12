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
                    + "\n 3 para excluir "
                    + "\n 4 para editar "
                    + "\n"
                    + "=====");
            System.out.println();

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                case 1:
                    Inserir.executar();
                    break;
                case 2:
                    Exibir.executar();
                    break;
                case 3:
                    Excluir.executar();
                    break;
                case 4:
                    Editar.executar();
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }

        }

    }

}
