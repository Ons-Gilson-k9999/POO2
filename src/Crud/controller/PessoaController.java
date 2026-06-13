package Crud.controller;

import dao.PessoaDao;
import model.Pessoa;

public class PessoaController {
    // atributos
    private PessoaDao dao;

    // construtor
    public PessoaController() {
        dao = new PessoaDao();
    }
    // métodos
    public void cadastrarPessoa(String nome) throws Exception {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        dao.inserir(pessoa);
    }
    public Pessoa consultarPessoa(String nome) throws Exception {
        return dao.buscarPorNome(nome);
    }
    public void atualizarPessoa(int id, String nome) throws Exception {
        Pessoa pessoa = new Pessoa();
        pessoa.setId(id);
        pessoa.setNome(nome);
        dao.atualizar(pessoa);
    }
    public void excluirPessoa(int id) throws Exception {
        dao.excluir(id);
    }
}