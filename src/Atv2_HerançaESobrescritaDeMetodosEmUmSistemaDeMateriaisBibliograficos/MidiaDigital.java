package Atv2_HerançaESobrescritaDeMetodosEmUmSistemaDeMateriaisBibliograficos;

public class MidiaDigital extends MaterialBibliografico {
    //atributos
    private String formatoArquivo;
    private String tamanhoMb;
    private double totalDownloads;
    //construtor
    public MidiaDigital(String nome,String codigo,String formatoArquivo,String tamanhoMb,double totalDownloads){
        super(nome,codigo);
        this.formatoArquivo=formatoArquivo;
        this.tamanhoMb=tamanhoMb;
        this.totalDownloads=0;
    }
    public void setFormatoArquivo(String formatoArquivo){
        this.formatoArquivo=formatoArquivo;
    }
    public String getFormatoArquivo(){
        return formatoArquivo;
    }
    public void setTamanhoMb(String tamanhoMb) {
        this.tamanhoMb = tamanhoMb;
    }
    public String getTamanhoMb(){
        return tamanhoMb;
    }
    public double getTotalDownloads(){
        return totalDownloads;
    }
    //metodos
    @Override
    public void emprestar(){
        System.out.println(" A midia digital de titulo: "+getTitulo()+", quantidade de downloads: "+totalDownloads);
    }
}
