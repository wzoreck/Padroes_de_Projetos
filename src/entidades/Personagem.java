package entidades;

import java.util.ArrayList;
import java.util.List;

public class Personagem {
    private String apelido;
    private String categoria;
    private float vida;
    private List<Vestimento> vestimentos;
    private List<Arma> armas;

    public Personagem(String apelido, String categoria) {
        this.apelido = apelido;
        this.categoria = categoria;
        this.vida = 100.0f;
    }

    public String getApelido() {
        return this.apelido;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public float getVida() {
        return this.vida;
    }

    public void setDanono(float dano) {
        if (this.vida - dano < 0) {
            this.vida = 0;
        } else {
            this.vida -= dano;
        }
    }

    public void setVestimento(Vestimento vestimento) {
        if (vestimentos == null)
            vestimentos = new ArrayList<Vestimento>();

        vestimentos.add(vestimento);
    }

    public List<Vestimento> getVestimentos() {
        return this.vestimentos;
    }

    public void setArma(Arma arma) {
        if (armas == null)
            armas = new ArrayList<Arma>();

        armas.add(arma);
    }

    public List<Arma> getArmas() {
        return this.armas;
    }

}
