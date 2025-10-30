package br.edu.atitus.murilo_dalmolin.zoo_digital;

import br.edu.atitus.murilo_dalmolin.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.murilo_dalmolin.zoo_digital.comportamentos.Predador;
import br.edu.atitus.murilo_dalmolin.zoo_digital.comportamentos.Corredor;

public class jacare extends reptil implements Nadador, Predador, Corredor {

    public jacare(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está fazendo som de jacaré.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo uma presa.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando lentamente.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo na beirada do rio.");
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " está caçando silenciosamente na água.");
    }
}
