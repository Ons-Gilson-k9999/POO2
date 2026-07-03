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
        String sql= "INSERT INTO medicao (id,valor,unidade,DataHora,sensorId) VALUES (?,?,?,?)";
        try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt= conn.prepareStatement(sql);
            stmt.setInt(1, medicao.getID());
            stmt.setString(2, medicao.getValor());
            stmt.setString(3, medicao.getUnidade());
            stmt.setString(4, medicao.getDataHora());
            stmt.setInt(5, medicao.getSensorId());

            stmt.executeUpdate();
            stmt.close();
            Conexao.fechar(conn);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    public Medicao consultar(int Id){
        String sql = "SELECT * FROM medicao WHERE id=? ";
        try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1,Id);
            ResultSet result= stmt.executeQuery();
            if(result.next()){
                Medicao medicao = new Medicao();
                medicao.setId(result.getInt("id"));
                medicao.setValor(result.getString("valor"));
                medicao.setUnidade(result.getString("unidade"));
                medicao.setDataHora(result.getString("dataHora"));
                medicao.setSensorId(result.getInt("sensorId"));

                result.close();
                stmt.close();
                Conexao.fechar(conn);
            }
                return null;
        }catch(SQLException e){
            e.printStackTrace();
              return null;
        }
    }
    public boolean existeMedicao(String sensor) {
        String sql = "SELECT * FROM medicao WHERE id =?";
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "id");
            ResultSet result = stmt.executeQuery();
            boolean existe = result.next();
            result.close();
            stmt.close();
            conn.close();
            return existe;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
