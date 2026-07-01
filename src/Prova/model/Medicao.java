package Prova.model;

public class Medicao extends Sensor {
    public int id;
    public String valor;
    public String unidade;
    public String dataHora;
    public String medidores;
    public String sensor;

    public Medicao(int Id, String valor, String unidade, String dataHora,String sensor, String medidores,int id,String codigo,String tipo,String localizacao,String sensores){
        super(id,codigo,tipo,localizacao,sensor);
        this.id =id;
        this.valor=valor;
        this.unidade=unidade;
        this.dataHora =dataHora;
        this.sensor=sensor;
        this.medidores=medidores;

    }
    public void setId(int id){this.id = id;}
    public int getID(){return id;}

    public void setValor(String valor){this.valor = valor;}
    public String getValor(){return valor; }

    public void setUnidade(String unidade ){this.unidade = unidade;}
    public String getUnidade(){return unidade;}

    public void setDataHora(String DataHora){this.dataHora= dataHora;}
    public String getDataHora(){return dataHora;}

    public void setSensor(int id){this.sensor = sensor;}
    public String getSensor(){return sensor;}

    public void setMedidores(String medidores){this.medidores = medidores;}
    public String getMedidores(){return medidores;}
}

}
