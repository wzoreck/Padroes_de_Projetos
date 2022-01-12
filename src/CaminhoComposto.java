import interfaces.CaminhoMapa;

public class CaminhoComposto implements CaminhoMapa {
    private CaminhoMapa primeiro;
    private CaminhoMapa segundo;

    public CaminhoComposto(CaminhoMapa primeiro, CaminhoMapa segundo) {
        this.primeiro = primeiro;
        this.segundo = segundo;
        if (!primeiro.getDestino().contentEquals(segundo.getOrigem()))
            throw new RuntimeException("O destino do primeiro caminho não é igual a origem do segundo!");
    }

    @Override
    public String getOrigem() {
        return this.primeiro.getOrigem();
    }

    @Override
    public String getDestino() {
        return this.segundo.getDestino();
    }

    @Override
    public double getDistancia() {
        return this.primeiro.getDistancia() + this.segundo.getDistancia();
    }

    @Override
    public String toString() {
        return primeiro.toString() + "\n" + segundo.toString();
    }
}
