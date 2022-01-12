import interfaces.CaminhoMapa;

public class CaminhoSimples implements CaminhoMapa {
    private String origem;
    private String destino;
    private float distancia;

    public CaminhoSimples(String origem, String destino, float distancia) {
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    @Override
    public String getOrigem() {
        return this.origem;
    }

    @Override
    public String getDestino() {
        return this.destino;
    }

    @Override
    public double getDistancia() {
        return this.distancia;
    }

    @Override
    public String toString() {
        return "[Origem:" + origem + ", destino:" + destino + "]";
    }
}
