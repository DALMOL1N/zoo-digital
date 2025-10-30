package br.edu.atitus.murilo_dalmolin.zoo_digital;

import br.edu.atitus.murilo_dalmolin.zoo_digital.comportamentos.Corredor;

public class Lagarto extends reptil implements Corredor {

    public Lagarto(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está emitindo sons baixos.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo insetos.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo entre as pedras.");
    }
}
