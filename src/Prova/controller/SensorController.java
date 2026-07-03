package Prova.controller;

import Prova.dao.SensorDAO;
import Prova.model.Sensor;

public class SensorController {
    private SensorDAO dao;

    public SensorController(){dao = new SensorDAO();}
    public void cadastrar (Sensor sensor){
        if(sensor.getID() <=0){
            throw new IllegalArgumentException("A quantidade deve ser maior que zero.");
            }
        if (dao.existeSensor(sensor.getCodigo())){
            System.out.println("Ja existe um sensor cadastrado");
            return;
        }
        dao.cadastrar(sensor);
    }
    public Sensor consultar(int id){
        return dao.consultar(id);}
}
