package interfaces;

public interface Observavel {
    public void addObservador(Observador observador);

    public void removerObservador(Observador observador);

    public void notificar(String mensagem);
}
