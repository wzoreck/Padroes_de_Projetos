import entidades.Arma;
import entidades.Personagem;

public class Main {
    public static void main(String[] args) {
        Arma espada = new Arma("Hattori Hanzo", 45.2f, 52.9f);
        Arma arco = new Arma("Arco Medieval", 25.6f, 60.3f);

        Personagem hamlet = new Personagem("Hamlet", "Cavaleiro");
        Personagem dante = new Personagem("Dante", "Arqueiro");

        // Atribuindo equipamentos aos personagens
        hamlet.setArma(espada);
        hamlet.equiparArma(0);

        dante.setArma(arco);
        dante.equiparArma(0);

        Ataque ataqueFracoDeHamletEmDante = new Ataque(hamlet, dante, new AtaqueFraco());
        Ataque ataqueForteDeHamletEmDante = new Ataque(hamlet, dante, new AtaqueForte());
        ataqueFracoDeHamletEmDante.ataque();
        ataqueForteDeHamletEmDante.ataque();

        Ataque ataqueForteDeDanteEmHamlet = new Ataque(dante, hamlet, new AtaqueForte());
        ataqueForteDeDanteEmHamlet.ataque();

        System.out.println("Vida de Dante: " + dante.getVida());
        System.out.println("Vida de Hamlet: " + hamlet.getVida());
    }
}
