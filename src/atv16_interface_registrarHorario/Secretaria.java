package atv16_interface_registrarHorario;

public class Secretaria extends Funcionario implements PresencaRegistravel {
    //atributos
    private String turno;
    //Construtor
    public Secretaria(String nome,String turno){
        super(nome);
        this.turno=turno;
    }
    public void setTurno(String turno){
        this.turno=turno;
    }
    public String getTurno(){
        return turno;
    }
    //metodos
    @Override
    public void exibirDados(){
        System.out.println(" Nome: "+getNome());
    }
    public void organizarDocumento(){
        System.out.println(" A secretária: "+getNome()+" está organizando os documentos no turno: "+turno);
    }
    public void registrarPresenca(){
        System.out.println(" A presença de: "+getNome()+" foi registrada com sucesso !");
    }

}
