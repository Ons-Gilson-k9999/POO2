package Prova.controller;

import Prova.dao.SensorDAO;
import Prova.model.Sensor;
import Prova.dao.MedicaoDAO;

public class Controller {
    private SensorDAO;

    public Controller(){dao = new SensorDAO();}
    public void cadastrar (Sensor sensor){
        if(sensor.getID() <=0){
            throw new IllegalArgumentException("A quantidade deve ser maior que zero.")
            }
        if (dao.existeSensor(sensor.getCodigo())){
            System.out.println("Ja existe um sensor cadastrado");
            return;
        }
        dao.salvar(sensor);
    }
    public void excluirSensor(int id){dao.excluir(id);}
}
