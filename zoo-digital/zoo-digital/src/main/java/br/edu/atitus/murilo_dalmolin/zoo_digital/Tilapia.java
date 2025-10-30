package br.edu.atitus.murilo_dalmolin.zoo_digital;


import br.edu.atitus.murilo_dalmolin.zoo_digital.comportamentos.Nadador;

public class Tilapia extends peixe implements Nadador {

    public Tilapia(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está fazendo barulho na água.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo ração de peixe.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando tranquilamente.");
    }
}
