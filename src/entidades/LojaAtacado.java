package entidades;

import java.util.Hashtable;

public class LojaAtacado extends AbstractLoja {

    public LojaAtacado(String nome, Hashtable<AbstractArma, Float> precoArmas) {
        super(nome, precoArmas);
    }

    @Override
    protected float calcularPreco(AbstractArma arma) {
        return getPrecoArma(arma) * 0.1f;
    }
}
