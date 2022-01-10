package entidades;

import java.util.ArrayList;
import java.util.List;

public class Personagem {
    private String apelido;
    private String categoria;
    private float vida;
    private List<RealArma> armas;
    private int armaEquipada;

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

    public void setDano(float dano) {
        if (this.vida - dano < 0) {
            this.vida = 0;
        } else {
            this.vida -= dano;
        }
    }

    public void setArma(RealArma arma) {
        if (armas == null)
            armas = new ArrayList<RealArma>();

        armas.add(arma);
    }

    public List<RealArma> getArmas() {
        return this.armas;
    }

    public int getPosicaoArmaEquipada() {
        return this.armaEquipada;
    }

    public void equiparArma(int posicaoLista) {
        this.armaEquipada = posicaoLista;
    }
}
