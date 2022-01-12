package entidades;

public class Descansando extends EstadoPersonagem {

    public Descansando(Personagem personagem) {
        super(personagem);
        System.out.println(personagem.getApelido() + " está descansando");
    }

    @Override
    public void andarParar() {
        getPersonagem().setEstado(new Parado(getPersonagem()));
    }

    @Override
    public void descansar() {
        System.out.println(getPersonagem().getApelido() + " já está descansando");
    }
}
