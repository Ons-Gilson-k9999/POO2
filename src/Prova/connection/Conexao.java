package Prova.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL= "jdbc:mysql://localhost:3306/gerenciamento";
    private static final String USUARIO = "root";
    private static final String SENHA = "unifesspa";

    public static Connection conectar(){
        try{
            return DriverManager.getConnection(
                        URL,USUARIO,SENHA
            );
        }catch(SQLException e){
            System.out.println("Erro na conexão do banco de dados.");
            e.printStackTrace();
            return null;
        }
    }
    public static void fechar(Connection conn){
        try{
            if(conn!=null){
                conn.close();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
