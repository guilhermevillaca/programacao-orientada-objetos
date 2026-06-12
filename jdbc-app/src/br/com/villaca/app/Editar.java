package br.com.villaca.app;

import br.com.villaca.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Editar {

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
            System.out.print("Digite o ID da pessoa que deseja editar: ");

            int id = scanner.nextInt();
            scanner.nextLine();

            rs.close();
            sql.close();

            sql = con.prepareStatement(
                    "SELECT * FROM pessoa WHERE id = ?"
            );

            sql.setInt(1, id);

            rs = sql.executeQuery();

            if (rs.next()) {

                System.out.println();
                System.out.println("Dados atuais:");

                System.out.println(
                        "Nome: "
                        + rs.getString("nome")
                );

                System.out.println(
                        "Email: "
                        + rs.getString("email")
                );

                System.out.println(
                        "CPF: "
                        + rs.getString("cpf")
                );

                System.out.println();
                System.out.println("Digite os novos dados:");

                System.out.print("Nome: ");
                String nome = scanner.nextLine();

                System.out.print("Email: ");
                String email = scanner.nextLine();

                System.out.print("CPF: ");
                String cpf = scanner.nextLine();

                rs.close();
                sql.close();

                sql = con.prepareStatement(
                        "UPDATE pessoa "
                        + "SET nome = ?, email = ?, cpf = ? "
                        + "WHERE id = ?"
                );

                sql.setString(1, nome);
                sql.setString(2, email);
                sql.setString(3, cpf);
                sql.setInt(4, id);

                int linhasAfetadas =
                        sql.executeUpdate();

                if (linhasAfetadas > 0) {

                    System.out.println();
                    System.out.println(
                            "Pessoa atualizada com sucesso."
                    );

                }

            } else {

                System.out.println();
                System.out.println(
                        "Pessoa não encontrada."
                );

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