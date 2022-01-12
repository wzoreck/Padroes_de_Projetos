package entidades;

import java.util.ArrayList;
import java.util.List;

public class BancoMySQL extends RecuperadorPersonagem {
    private List<Personagem> personagens;

    public BancoMySQL(RecuperadorPersonagem proximo) {
        super(proximo);
        personagens = new ArrayList<Personagem>();
        personagens.add(new Personagem("Juca Bala", "Andarilho"));
        personagens.add(new Personagem("Jeca Tatu", "Andarilho"));
        personagens.add(new Personagem("Napoleão Bonaparte", "Cavaleiro"));
    }

    @Override
    protected Personagem recuperaPersonagem(String apelido) {
        for (Personagem p : personagens)
            if (p.getApelido().contentEquals(apelido))
                return p;
        return null;
    }
}
