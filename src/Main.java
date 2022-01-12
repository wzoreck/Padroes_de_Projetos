import dao.ArmaDAO;
import entidades.*;

import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        Personagem hamlet = new Personagem("Hamlet", "Nobre");
        Personagem mclovin = new Personagem("McLovin", "Nerd");
        Personagem hancock = new Personagem("Hancock", "Mutante");

        RealArma espada = new RealArma("Excalibur", 20.5f, 30.3f);
        RealArma garrafa = new RealArma("Garrafa de vodka", 5.1f, 0.2f);

        espada.addObservador(hamlet);
        espada.addObservador(mclovin);
        garrafa.addObservador(hancock);

        espada.notificar("Intacta");
        espada.notificar("Prestes a quebrar");
        garrafa.notificar("Pronta para beber");
        garrafa.notificar("Vazia");
        garrafa.notificar("Pronta para ser usada na batalha");
    }
}
