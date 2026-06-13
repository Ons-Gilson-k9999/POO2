package Crud.dao;

import model.Pessoa;
import util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PessoaDao {
    // métodos
    public void inserir(Pessoa pessoa) {
        String sql = "INSERT INTO pessoa(nome) VALUES (?)";
        try {
            Connection conn = Conexao.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, pessoa.getNome());
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Pessoa buscarPorNome(String nome) {
        String sql = "SELECT * FROM pessoa WHERE nome = ?";
        try {
            Connection conn = Conexao.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet result = stmt.executeQuery();

            if (result.next()) {
                Pessoa pessoa = new Pessoa();
                pessoa.setId(result.getInt("id"));
                pessoa.setNome(result.getString("nome"));
                result.close();
                stmt.close();
                conn.close();
                return pessoa;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void atualizar(Pessoa pessoa) {
        String sql = "UPDATE pessoa SET nome = ? WHERE id = ?";
        try {
            Connection conn = Conexao.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, pessoa.getNome());
            stmt.setInt(2, pessoa.getId());
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void excluir(int id) {
        String sql = "DELETE FROM pessoa WHERE id = ?";
        try {
            Connection conn = Conexao.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}