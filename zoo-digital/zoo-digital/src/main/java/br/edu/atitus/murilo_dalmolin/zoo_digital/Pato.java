package br.edu.atitus.murilo_dalmolin.zoo_digital.animais;

import br.edu.atitus.murilo_dalmolin.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.murilo_dalmolin.zoo_digital.comportamentos.Voador;

public class Pato extends Ave implements Nadador, Voador {

    public Pato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() { System.out.println("Pato: Quack! Quack!"); }

    @Override
    public void comer() { System.out.println("Pato está comendo sementes e pequenos insetos."); }

    @Override
    public void nadar() { System.out.println("Pato está nadando no lago."); }

    @Override
    public void voar() { System.out.println("Pato está voando baixo sobre o lago."); }
}
