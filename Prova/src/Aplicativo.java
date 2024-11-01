import java.util.Calendar;

public class Aplicativo {
    public String nome;
    public String versao;
    public String desenvolvedor;
    public String categoria;
    public String descricao;
    public Calendar dataLancamento;
    public int downloads;
    public Double avaliacaoMedia;

    public void cadastrarAplicativo(){}
    public void atualizarInformacoes(){}
    public void excluirAplicativo(){}
    public void adicionarComentario(String comentario){}
    public void obterComentarios(){}
    public void calcularAvaliacaoMedia(){}

    public void antecessorSucessor(int n){
        int antecessor = n-1;
        int sucessor = n+2;
        System.out.println("Antecessor " + antecessor + " - sucessor" + sucessor );
    }
}
