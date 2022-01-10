import dao.ArmaDAO;
import entidades.*;

import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        Hashtable<AbstractArma, Float> armas_preco = new Hashtable<AbstractArma, Float>();

        AbstractArma faca = ArmaDAO.getArma("Faca");
        AbstractArma flecha = ArmaDAO.getArma("Flecha");
        AbstractArma espada = ArmaDAO.getArma("Espada");

        armas_preco.put(faca, 45.7f);
        armas_preco.put(flecha, 31.99f);
        armas_preco.put(espada, 150.32f);

        AbstractLoja ferreiro = new LojaFerreiro("Tião Ferreiro LTDA", armas_preco);
        AbstractLoja atacado = new LojaAtacado("Cacarekos Medievais", armas_preco);

        System.out.println("Preco da faca feita pelo ferreiro: " + ferreiro.calcularPrecoFinal(faca));
        System.out.println("Preco da faca no atacado: " + atacado.calcularPrecoFinal(faca));
        System.out.println("\nPreco da flecha feita pelo ferreiro: " + ferreiro.calcularPrecoFinal(flecha));
        System.out.println("Preco da flecha no atacado: " + atacado.calcularPrecoFinal(flecha));
        System.out.println("\nPreco da espada feita pelo ferreiro: " + ferreiro.calcularPrecoFinal(espada));
        System.out.println("Preco da espada no atacado: " + atacado.calcularPrecoFinal(espada));
    }
}
