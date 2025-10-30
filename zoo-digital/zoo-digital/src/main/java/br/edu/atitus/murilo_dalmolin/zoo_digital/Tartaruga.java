package br.edu.atitus.murilo_dalmolin.zoo_digital;

import br.edu.atitus.murilo_dalmolin.zoo_digital.comportamentos.Nadador;

public class Tartaruga extends reptil implements Nadador {

    public Tartaruga(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está fazendo som abafado.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo vegetação.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando lentamente.");
    }
}
