package br.edu.atitus.murilo_dalmolin.zoo_digital.animais;

import br.edu.atitus.murilo_dalmolin.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.murilo_dalmolin.zoo_digital.comportamentos.Predador;

public class PeixeMorcego extends Peixe implements Nadador, Predador {

    public PeixeMorcego(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() { System.out.println("O peixe-morcego faz sons vibratórios na água."); }

    @Override
    public void comer() { System.out.println("Peixe-morcego está comendo pequenos crustáceos."); }

    @Override
    public void nadar() { System.out.println("Peixe-morcego está nadando perto do fundo do mar."); }

    @Override
    public void cacar() { System.out.println("Peixe-morcego está caçando crustáceos no fundo do mar."); }
}
