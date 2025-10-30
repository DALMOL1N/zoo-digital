package br.edu.atitus.murilo_dalmolin.zoo_digital;


import br.edu.atitus.murilo_dalmolin.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.murilo_dalmolin.zoo_digital.comportamentos.Predador;

public class Tubarao extends peixe implements Nadador, Predador {

    public Tubarao(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " não emite som.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo carne.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando rapidamente.");
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " está caçando peixes.");
    }
}