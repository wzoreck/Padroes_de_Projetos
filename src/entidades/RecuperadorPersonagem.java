package entidades;

public abstract class RecuperadorPersonagem {
    private RecuperadorPersonagem proximo;

    public RecuperadorPersonagem(RecuperadorPersonagem proximo) {
        this.proximo = proximo;
    }

    public Personagem recuperar(String apelido) {
        Personagem p = recuperaPersonagem(apelido);
        if (p == null)
            return chamarProximo(apelido);
        else
            return p;
    }

    private Personagem chamarProximo(String apelido) {
        if (proximo == null)
            throw new RuntimeException("Não foi possível recuperar o personagem " + apelido);
        return proximo.recuperar(apelido);
    }

    protected abstract Personagem recuperaPersonagem(String apelido);
}
