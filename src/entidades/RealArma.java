package entidades;

public class RealArma extends AbstractArma{
    private float dano;
    private float resistencia;

    public RealArma(String nome, float dano, float resistencia) {
        this.nome = nome;
        this.dano = dano;
        this.resistencia = resistencia;
    }

    @Override
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
