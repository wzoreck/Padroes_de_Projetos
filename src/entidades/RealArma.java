package entidades;

import interfaces.Observador;
import interfaces.Observavel;

import java.util.ArrayList;
import java.util.List;

public class RealArma extends AbstractArma implements Observavel {
    private float dano;
    private float resistencia;
    private List<Observador> observadores;

    public RealArma(String nome, float dano, float resistencia) {
        this.nome = nome;
        this.dano = dano;
        this.resistencia = resistencia;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    public float getDano() {
        return this.dano;
    }

    public float getResistencia() {
        return resistencia;
    }

    @Override
    public void addObservador(Observador observador) {
        getObservadores().add(observador);
    }

    @Override
    public void removerObservador(Observador observador) {
        getObservadores().remove(observador);
    }

    @Override
    public void notificar(String mensagem) {
        for (Observador o : observadores)
            o.notificar(this, mensagem);
    }

    private List<Observador> getObservadores() {
        if (observadores == null)
            this.observadores = new ArrayList<Observador>();
        return observadores;
    }

    @Override
    public String toString() {
        return nome;
    }
}
