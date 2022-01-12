package entidades;

public abstract class EstadoPersonagem {
    private Personagem personagem;

    public EstadoPersonagem(Personagem personagem) {
        super();
        this.personagem = personagem;
    }

    public abstract void andarParar();
    public abstract void descansar();

    public Personagem getPersonagem() {
        return this.personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }
}
