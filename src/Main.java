import dao.ArmaDAO;
import entidades.*;

import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        Personagem hamlet = new Personagem("Hamlet", "Nobre");

        hamlet.setEstado(new Descansando(hamlet));
        hamlet.descansar();
        hamlet.andarParar();
        hamlet.andarParar();
        hamlet.andarParar();
        hamlet.andarParar();
        hamlet.descansar();

    }
}
