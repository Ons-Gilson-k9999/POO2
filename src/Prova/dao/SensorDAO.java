package Prova.dao;

import Prova.model.Sensor;
import Prova.connection.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class SensorDAO {
    private Connection conexao;

    public void cadastrar(Sensor sensor) {
        String sql = "INSERT INTO sensor (codigo,tipo,localizacao) VALUES (?,?,?)";
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(2, sensor.getCodigo());
            stmt.setString(3, sensor.getTipo());
            stmt.setString(4, sensor.getLocalizacao());


            stmt.executeUpdate();
            stmt.close();
            Conexao.fechar(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Sensor consultar(int id) {
        String sql = "SELECT * FROM sensor WHERE id=? ";
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1,id);
            ResultSet result = stmt.executeQuery();
            if (result.next()) {
                Sensor sensor = new Sensor();
                sensor.setId(result.getInt("id"));
                sensor.setCodigo(result.getString("codigo"));
                sensor.setTipo(result.getString("tipo"));
                sensor.setLocalizacao(result.getString("localizacao"));

               result.close();
               stmt.close();
               Conexao.fechar(conn);
                return sensor;
            }
            result.close();
            stmt.close();
            Conexao.fechar(conn);
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public boolean existeSensor(String sensor) {
        String sql = "SELECT * FROM sensor WHERE codigo =?";
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, sensor);
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