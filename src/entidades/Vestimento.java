package entidades;

public class Vestimento {
    private String nome;
    private float peso;
    private float protecao;

    public Vestimento(String nome, float peso, float protecao) {
        this.nome = nome;
        this.peso = peso;
        this.protecao = protecao;
    }

    public String getNome() {
        return this.nome;
    }

    public float getPeso() {
        return this.peso;
    }

    public float getProtecao() {
        return this.protecao;
    }
}
