import entidades.Personagem;
import interfaces.InterfaceStrategyAtacar;

public class AtaqueForte implements InterfaceStrategyAtacar {
    @Override
    public void atacar(Personagem atacante, Personagem vitima) {
        // A força de ataque do peronagem1 contra a defesa da armadura do personagem2
        float poderDanoAtacante = atacante.getArmas().get(atacante.getPosicaoArmaEquipada()).getDano();
        vitima.setDano(poderDanoAtacante); // Ataque forte 100% do poder de dano
    }
}
