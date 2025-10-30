package br.edu.atitus.murilo_dalmolin.zoo_digital;

import br.edu.atitus.murilo_dalmolin.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.murilo_dalmolin.zoo_digital.comportamentos.Predador;

public class Pinguim extends ave implements Nadador, Predador {

    public Pinguim(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está fazendo som de pinguim.");
    }

	@Override
    public void comer() {
        System.out.println(getNome() + " está comendo peixes.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando no gelo.");
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " está caçando Krill no gelo.");
    }
}
