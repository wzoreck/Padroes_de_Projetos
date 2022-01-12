package entidades;

public class Parado extends EstadoPersonagem {

    public Parado(Personagem personagem) {
        super(personagem);
        System.out.println(personagem.getApelido() + " está parado no momento");
    }

    @Override
    public void andarParar() {
        getPersonagem().setEstado(new Andando(getPersonagem()));
    }

    @Override
    public void descansar() {
        getPersonagem().setEstado(new Descansando(getPersonagem()));
    }
}
