package Crud.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexao {
    //atributos
    private static final String URL = "jdbc:mysql://localhost:3306/nomeMeuSistema";
    private static final String USUARIO = "root";
    private static final String SENHA = "unifesspa";
    //construtor
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    URL, USUARIO, SENHA
            );
        } catch(SQLException e) {
            System.out.println("Erro na conexão de banco de dados.");
            e.printStackTrace();
            return null;
        }
    }
}