import dao.ArmaDAO;
import entidades.AbstractArma;
import entidades.RealArma;
import entidades.Personagem;

public class Main {
    public static void main(String[] args) {
        AbstractArma faca = ArmaDAO.getArma("Faca");
        AbstractArma flecha = ArmaDAO.getArma("Flecha");
        AbstractArma espada = ArmaDAO.getArma("Espada");

        System.out.println(faca.getNome());
        System.out.println(flecha.getNome());
        System.out.println(espada.getNome());
    }
}
