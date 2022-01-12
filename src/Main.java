import dao.ArmaDAO;
import entidades.*;
import interfaces.CaminhoMapa;

import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        CaminhoMapa capaoRedondoParaGoioxim = new CaminhoSimples("Capão Redondo", "Goioxim", 105.4f);
        CaminhoMapa goioximParaPacienciaDosNeves = new CaminhoSimples("Goioxim", "Paciência dos Neves", 36.1f);
        CaminhoMapa pacienciaDosNevesParaAlagoas = new CaminhoSimples("Paciência dos Neves", "Alagoas", 852.9f);

        CaminhoMapa capaoRedondoParaPacienciaDosNeves = new CaminhoComposto(capaoRedondoParaGoioxim, goioximParaPacienciaDosNeves);
        CaminhoMapa trechoFinal = new CaminhoComposto(capaoRedondoParaPacienciaDosNeves, pacienciaDosNevesParaAlagoas);

        System.out.println("Caminho Final: " + trechoFinal);
        System.out.println("Distância Total: " + trechoFinal.getDistancia());
    }
}
