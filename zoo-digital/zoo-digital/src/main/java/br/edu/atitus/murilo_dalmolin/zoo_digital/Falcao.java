package br.edu.atitus.murilo_dalmolin.zoo_digital;

import br.edu.atitus.murilo_dalmolin.zoo_digital.comportamentos.Voador;
import br.edu.atitus.murilo_dalmolin.zoo_digital.comportamentos.Predador;

public class Falcao extends ave implements Voador, Predador {

    public Falcao(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está piando alto.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo um pequeno roedor.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando em alta velocidade.");
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " está caçando presa em mergulho.");
    }
}
