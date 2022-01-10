package dao;

import entidades.AbstractArma;
import entidades.NullArma;
import entidades.RealArma;

public class ArmaDAO {
    public static final String[] armas_bd = { "Faca", "Flecha", "Pedra" };

    public static AbstractArma getArma(String nome) {
        for (int i = 0; i < armas_bd.length; i++)
            if (armas_bd[i].equalsIgnoreCase(nome))
                return new RealArma(nome, 0f, 0f);

        return new NullArma();
    }
}
