package br.com.villaca.app;

import br.com.villaca.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Exibir {

    public static void executar() {

        Connection con = null;
        PreparedStatement sql = null;
        ResultSet rs = null;
        Scanner scanner = new Scanner(System.in);

        try {

            con = Conexao.getConexao();
            System.out.println("===== PESSOAS CADASTRADAS =====");
            System.out.println();
            sql = con.prepareStatement("SELECT * FROM pessoa ORDER BY id");
            rs = sql.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("id")+ " - "+ rs.getString("nome"));
            }
            System.out.println();
            System.out.print("Digite o ID para ver detalhes: ");

            int id = scanner.nextInt();
            rs.close();
            sql.close();
            sql = con.prepareStatement("SELECT * FROM pessoa WHERE id = ?");
            sql.setInt(1, id);

            rs = sql.executeQuery();
            if (rs.next()) {
                System.out.println();
                System.out.println("===== DETALHES =====");
                System.out.println();
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Nome: "+ rs.getString("nome"));
                System.out.println("Email: "+ rs.getString("email"));
                System.out.println("CPF: "+ rs.getString("cpf"));
            } else {
                System.out.println();
                System.out.println("Pessoa não encontrada.");
            }

        } catch (Exception e) {
            System.out.println(e);

        } finally {

            try {
                if (rs != null) {
                    rs.close();
                }
                if (sql != null) {
                    sql.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {

            }

        }

    }

}