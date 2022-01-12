package entidades;

import interfaces.Observador;
import interfaces.Observavel;

import java.util.ArrayList;
import java.util.List;

public class Personagem implements Observador {
    private String apelido;
    private String categoria;
    private float vida;
    private List<RealArma> armas;
    private int armaEquipada;
    private EstadoPersonagem estado;

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

    public EstadoPersonagem getEstado() {
        return this.estado;
    }

    public void setEstado(EstadoPersonagem estado) {
        this.estado = estado;
    }

    public void andarParar() {
        estado.andarParar();
    }

    public void descansar() {
        estado.descansar();
    }

    @Override
    public void notificar(Observavel observavel, String mensagem) {
        System.out.println("A arma " + observavel + " de " + apelido + " está no seguinte estado: " + mensagem);
    }
}
