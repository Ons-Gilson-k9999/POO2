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
        String sql = "INSERT INTO sensor" + "(codigo,tipo,localizacao)" + "(VALUES ?,?,?)";
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, sensor.codigo());
            stmt.setString(2, sensor.tipo());
            stmt.setString(3, sensor.localizacao());
            stmt.setString(4, sensor.sensores());

            stmt.executeUpdate();
            stmt.close();
            Conexao.fechar(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void consultar(String codigo) {
        String sql = "SELECT * FROM sensor WHERE codigo=? ";
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, codigo);
            ResultSet result = stmt.executeQuery();
            if (result.next()) {
                Sensor sensor = new Sensor();
                sensor.setId(result.getInt("id"));
                sensor.setCodigo(result.getString("Codigo"));
                sensor.setTipo(result.getString("Tipo"));
                sensor.setLocalizacao(result.getString("localização"));
            }
        }
    }

    public boolean existeSensor(String sensor) {
        String sql = "SELECT * FROM sensor WHERE codigo =?";
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "codigo");
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