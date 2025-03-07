public class Serie extends Titulo{

    private int qtdTemporadas;
    private int qtdEpisodiosPorTemporada;

    public Serie(String nome, int anoDeLancamento,int avaliacao,int qtdTemporadas,int qtdEpisodiosPorTemporada) {
        super(nome, anoDeLancamento,avaliacao);
        this.qtdTemporadas = qtdTemporadas;
        this.qtdEpisodiosPorTemporada = qtdEpisodiosPorTemporada;
    }

    public int getQtdTemporadas() {
        return qtdTemporadas;
    }

    public void setQtdTemporadas(int qtdTemporadas) {
        this.qtdTemporadas = qtdTemporadas;
    }

    public int getQtdEpisodiosPorTemporada() {
        return qtdEpisodiosPorTemporada;
    }

    public void setQtdEpisodiosPorTemporada(int qtdEpisodiosPorTemporada) {
        this.qtdEpisodiosPorTemporada = qtdEpisodiosPorTemporada;
    }

    @Override
    public String toString() {
        return "Nome da Serie : "+getNome()+"/Ano de Lancamento: "+getAnoDeLancamento()+"/Quantidade de Temporadas: "
                +getQtdTemporadas()+"/Quantidade de Episodios por Temporadas: "+qtdEpisodiosPorTemporada;
    }
}
