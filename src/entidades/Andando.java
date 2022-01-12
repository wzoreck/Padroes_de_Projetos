package entidades;

public class Andando extends EstadoPersonagem{

    public Andando(Personagem personagem) {
        super(personagem);
        System.out.println(personagem.getApelido() + " está andando");
    }

    @Override
    public void andarParar() {
        getPersonagem().setEstado(new Parado(getPersonagem()));
    }

    @Override
    public void descansar() {
        getPersonagem().setEstado(new Descansando(getPersonagem()));
    }
}
