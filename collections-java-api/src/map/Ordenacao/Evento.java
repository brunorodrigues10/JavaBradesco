package map.Ordenacao;

public class Evento {

    private String nome;
    private String atacao;

    public Evento(String nome, String atacao) {
        this.nome = nome;
        this.atacao = atacao;
    }

    public String getNome() {
        return nome;
    }

    public String getAtacao() {
        return atacao;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", atacao='" + atacao + '\'' +
                '}';
    }
}
