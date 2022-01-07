import entidades.Arma;
import entidades.Personagem;
import entidades.Vestimento;

public class Main {
    public static void main(String[] args) {
        Arma espada1 = new Arma("Excalibur", 25.6f, 60.3f);
        Arma espada2 = new Arma("Hattori Hanzo", 45.2f, 52.9f);

        Vestimento capacete1 = new Vestimento("Great Helm", 4.2f, 32.7f);
        Vestimento capacete2 = new Vestimento("Ultraman", 3.6f, 20.4f);

        Personagem hamlet = new Personagem("Hamlet", "Cavaleiro");
        Personagem dante = new Personagem("Dante", "Arqueiro");

        // Atribuindo equipamentos aos personagens
        hamlet.setVestimento(capacete2);
        hamlet.setArma(espada1);
        dante.setVestimento(capacete1);
        dante.setArma(espada2);
    }
}
