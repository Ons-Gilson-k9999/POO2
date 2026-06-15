package ProvaGilson.Dao;

import Equipamento.Equipamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EquipamentoDao {
    public void inserir(Equipamento equipamento){
        String sql= " INSERT INTO equipamento() VALUES(?)";
        Try{
            Connection conn= Conexao.getConnection();
            PreparedStatement stmt = conn.prepareStatement((sql);
            stmt.setString(1, equipamento.descricao.());
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void excluir(int id){
        String sql= "DELETE FROM equipamento WHERE id= ?";
        try{
            Connection conn = Conexao.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1,id);
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }


}
