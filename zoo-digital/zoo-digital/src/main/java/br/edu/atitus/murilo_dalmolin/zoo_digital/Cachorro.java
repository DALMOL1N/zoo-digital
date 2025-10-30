package br.edu.atitus.murilo_dalmolin.zoo_digital;

import br.edu.atitus.murilo_dalmolin.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.murilo_dalmolin.zoo_digital.comportamentos.Predador;

public class Cachorro extends Mamifero implements Corredor, Predador {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está latindo.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo ração.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo pelo quintal.");
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " está caçando a meia que roubou.");
    }
}
