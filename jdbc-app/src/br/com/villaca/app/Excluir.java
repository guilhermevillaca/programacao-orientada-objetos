package br.com.villaca.app;

import br.com.villaca.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Excluir {

    public static void executar() {

        Connection con = null;
        PreparedStatement sql = null;
        ResultSet rs = null;
        Scanner scanner = new Scanner(System.in);

        try {

            con = Conexao.getConexao();

            System.out.println("===== PESSOAS CADASTRADAS =====");
            System.out.println();

            sql = con.prepareStatement(
                    "SELECT * FROM pessoa ORDER BY id"
            );

            rs = sql.executeQuery();

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id")
                        + " - "
                        + rs.getString("nome")
                );

            }

            System.out.println();
            System.out.print("Digite o ID da pessoa que deseja excluir: ");

            int id = scanner.nextInt();

            rs.close();
            sql.close();

            sql = con.prepareStatement(
                    "DELETE FROM pessoa WHERE id = ?"
            );

            sql.setInt(1, id);

            int linhasAfetadas = sql.executeUpdate();

            if (linhasAfetadas > 0) {

                System.out.println();
                System.out.println("Pessoa excluída com sucesso.");

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