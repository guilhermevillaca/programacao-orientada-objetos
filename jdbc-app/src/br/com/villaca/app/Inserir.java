/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.villaca.app;

import br.com.villaca.util.Conexao;
import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author 10380
 */
public class Inserir {

    public static void executar() throws SQLException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos inserir uma nova pessoa...");

        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite o email:");
        String email = scanner.nextLine();

        System.out.println("Digite o CPF:");
        String cpf = scanner.nextLine();

        Pessoa p = new Pessoa(nome, email, cpf);
        Connection con = Conexao.getConexao();
        PreparedStatement sql = null;
        try {
            sql = con.prepareStatement("INSERT INTO pessoa(nome, email, cpf) values (?, ?, ?)");
            sql.setString(1, p.getNome());
            sql.setString(2, p.getEmail());
            sql.setString(3, p.getCpf());

            sql.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            con.close();
        }
    }

}
