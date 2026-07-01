package Prova.dao;


import Prova.model.Medicao;
import Prova.model.Sensor;

import Prova.connection.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class MedicaoDAO {
    public void cadastrar(Medicao medicao){
        String sql= "INSERT INTO sensor"+"(valor,unidade,DataHora,sensor)"+"(VALUES ?,?,?,?)";
        try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt= conn.prepareStatement(sql);
            stmt.setString(1, medicao.valor());
            stmt.setString(2, medicao.unidade());
            stmt.setString(3, medicao.dataHora);
            stmt.setString(4, medicao.sensor());

            stmt.executeUpdate();
            stmt.close();
            Conexao.fechar(conn);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void consultar(String codigo){
        String sql = "SELECT * FROM sensor WHERE codigo=? ";
        try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,codigo);
            ResultSet result= stmt.executeQuery();
            if(result.next()){
                Medicao sensor = new Sensor();
                Medicao.setId(result.getInt("id"));
                Medicao.setValor(result.getString("valor"));
                Medicao.setUnidade(result.getString("unidade"));
                Medicao.setDataHora(result.getString("Data e hora"));
                Medicao.setSensor(result.getString("Sensor:"));
            }
        }
    }
    public boolean existeMedicao(String sensor) {
        String sql = "SELECT * FROM sensor WHERE codigo =?";
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "id");
            ResultSet rs = stmt.executeQuery();
            boolean existe = rs.next();
            rs.close();
            stmt.close();
            conn.close();
            return existe;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
