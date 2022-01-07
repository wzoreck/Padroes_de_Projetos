package entidades;

public class Arma {
    private String nome;
    private float dano;
    private float resistencia;

    public Arma(String nome, float dano, float resistencia) {
        this.nome = nome;
        this.dano = dano;
        this.resistencia = resistencia;
    }

    public String getNome() {
        return this.nome;
    }

    public float getDano() {
        return this.dano;
    }

    public float getResistencia() {
        return resistencia;
    }

}
