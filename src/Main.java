import dao.ArmaDAO;
import entidades.*;
import interfaces.CaminhoMapa;

import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        try {
            RecuperadorPersonagem personagens = new BancoMySQL(new BancoPostgreSQL(null));

            Personagem personagem1 = personagens.recuperar("Dead Pool");
            System.out.println("Conteúdo de personagem1: " + personagem1.getApelido());

            Personagem personagem2 = personagens.recuperar("Napoleão Bonaparte");
            System.out.println("Conteúdo de personagem2: " + personagem2.getApelido());

            Personagem personagem3 = personagens.recuperar("Jeca Tatuuu");
            System.out.println("Conteúdo de personagem3: " + personagem3.getApelido());
        } catch (RuntimeException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
