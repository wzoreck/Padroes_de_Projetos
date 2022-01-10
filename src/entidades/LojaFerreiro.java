package entidades;

import java.util.Hashtable;

public class LojaFerreiro extends AbstractLoja {

    public LojaFerreiro(String nome, Hashtable<AbstractArma, Float> precoArmas) {
        super(nome, precoArmas);
    }

    @Override
    protected float calcularPreco(AbstractArma arma) {
        return getPrecoArma(arma) * 0.05f;
    }
}
