public class Titulo implements Comparable <Titulo>{
    private String nome;

    private int anoDeLancamento;
    private int avaliacao;


    public Titulo(String nome, int anoDeLancamento, int avaliacao) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.avaliacao = avaliacao;
    }
    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getNome() {
        return nome;
    }
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    @Override
    public int compareTo(Titulo outro) {
        return Integer.compare(this.anoDeLancamento, outro.anoDeLancamento);
    }
}
