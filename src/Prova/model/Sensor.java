package Prova.model;

public class Sensor {
    public int id;
    public String codigo;
    public String tipo;
    public String localizacao;
    public String sensores;

    public sensor(int id,String codigo,String tipo,String localizacao,String sensores){
        this.id =id;
        this.codigo=codigo;
        this.tipo=tipo;
        this.localizacao=localizacao;
        this.sensores=sensores;

    }
    public void setId(int id){this.id = id;}
    public int getID(){return id;}

    public void setCodigo(String codigo){this.codigo = codigo;}
    public String getCodigo(){return codigo; }

    public void setTipo(String tipo){this.tipo = tipo;}
    public String  getTipo(){return tipo;}

    public void setLocalizacao(String localizacao){this.localizacao = localizacao;}
    public String getLocalizacao(){return localizacao;}

    public void setSensores(String sensores){this.sensores = sensores;}
    public String getSensores(){return sensores;}
}
