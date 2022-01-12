package entidades;

import java.util.ArrayList;
import java.util.List;

public class BancoPostgreSQL extends RecuperadorPersonagem {
    private List<Personagem> personagens;

    public BancoPostgreSQL(RecuperadorPersonagem proximo) {
        super(proximo);
        personagens = new ArrayList<Personagem>();
        personagens.add(new Personagem("Dead Pool", "Guerreiro"));
        personagens.add(new Personagem("Mestre Yoda", "Yoda"));
        personagens.add(new Personagem("Gandalf", "Mago"));
    }

    @Override
    protected Personagem recuperaPersonagem(String apelido) {
        for (Personagem p : personagens)
            if (p.getApelido().contentEquals(apelido))
                return p;
        return null;
    }
}
