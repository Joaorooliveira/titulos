public class Filme extends Titulo{

    private int duracao;
    public Filme(String nome, int anoDeLancamento,int avaliacao, int duracao ) {
        super(nome, anoDeLancamento ,avaliacao);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Nome do Filme: "+getNome()+"/Ano de Lançamento: "+getAnoDeLancamento()+"/Sua duracao: "+ getDuracao();
    }
}
