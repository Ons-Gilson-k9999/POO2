package Prova.controller;

import Prova.model.Medicao;
import Prova.dao.MedicaoDAO;

public class MedicaoController {
    private MedicaoDAO dao;
    public MedicaoController(){dao = new MedicaoDAO();}
    public void cadastrar(Medicao medicao){
        if(medicao.getID() <= 0){
            throw new IllegalArgumentException("A quantidade deve ser maior que zero.");
        }
        if(dao.existeMedicao(String.valueOf(medicao.getID()))){
            System.out.println("Ja existe uma medicao cadastrada");
            return;
        }
        dao.cadastrar(medicao);
    }
    public Medicao consultar(int id) {
        return dao.consultar(id);
    }
}