package entidades;

import java.util.Hashtable;

public abstract class AbstractLoja {
    private String nome;
    private Hashtable<AbstractArma, Float> precoArmas;

    public AbstractLoja(String nome, Hashtable<AbstractArma, Float> precoArmas) {
        this.nome = nome;
        this.precoArmas = precoArmas;
    }

    public float calcularPrecoFinal(AbstractArma arma) {
        float preco = precoArmas.get(arma);
        preco += calcularPreco(arma);
        preco += preco * 0.15f; // Imposto
        return preco;
    }

    protected abstract float calcularPreco(AbstractArma arma);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Hashtable<AbstractArma, Float> getPrecoArmas() {
        return precoArmas;
    }

    public void setPrecoArmas(Hashtable<AbstractArma, Float> precoArmas) {
        this.precoArmas = precoArmas;
    }

    public float getPrecoArma(AbstractArma arma) {
        return precoArmas.get(arma);
    }
}
