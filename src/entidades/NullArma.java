package entidades;

public class NullArma extends AbstractArma {

    @Override
    public String getNome() {
        return "Esta arma não está cadastrada no banco de dados!";
    }
}
