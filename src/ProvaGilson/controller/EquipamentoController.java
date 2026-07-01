package ProvaGilson.EquipamentoController;

import Dao.EquipamentoDao;
import Equipamento.Equipamento;

public class EquipamentoController {
    private EquipamentoDao dao;
    public EquipamentoController(){
        dao = new EquipamentoDao();
    }
    public void cadastrarEquipamento(String nome) Throws Exception{
            Equipamento equipamento= new Equipamento(1,"","","",1);
            equipamento.setDescricao(equipamento.descricao);
            dao.inserir(equipamento);
    }

    public void excluirEquipamento(int id) Throws Exception{
        dao.excluir(id);
    }
}
