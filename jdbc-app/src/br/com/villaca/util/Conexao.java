package br.com.villaca.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 10380
 */
public class Conexao {

    public static String status = "Não conectou...";

    public static Connection getConexao() {

        Connection connection = null;
        try {
            String driverName = "org.postgresql.Driver";
            Class.forName(driverName);

            String serverName = "localhost";
            String banco = "aulajdbc";
            String url = "jdbc:postgresql://" + serverName + ":5432/" + banco;

            String user = "postgres";
            String password = "123456";

            connection = DriverManager.getConnection(url, user, password);

            if (connection != null) {
                status = "STATUS: Conectado com sucesso!";
            } else {
                status = "STATUS: Não foi possível conectar!";
            }

            return connection;

        } catch (ClassNotFoundException e) {
            System.out.println("Driver postgresql não encontrado");
            return null;
        } catch (SQLException e) {
            System.out.println("Não foi possível conectar ao banco");
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static String statusConnection() {
        return status;
    }

    public static boolean fecharConexao() {
        try {
            Conexao.getConexao().close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static Connection reiniciarConexao() {
        fecharConexao();
        return Conexao.getConexao();
    }

}
