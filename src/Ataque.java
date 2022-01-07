import entidades.Personagem;
import interfaces.InterfaceStrategyAtacar;

public class Ataque {
    private Personagem atacante;
    private Personagem vitima;
    private InterfaceStrategyAtacar tipoAtaque;

    public Ataque(Personagem atacante, Personagem vitima, InterfaceStrategyAtacar tipoAtaque) {
        this.atacante = atacante;
        this.vitima = vitima;
        this.tipoAtaque = tipoAtaque;
    }

    public void ataque() {
        tipoAtaque.atacar(atacante, vitima);
    }
}
