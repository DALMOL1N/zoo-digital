package br.edu.atitus.murilo_dalmolin.zoo_digital.animais;

import br.edu.atitus.murilo_dalmolin.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.murilo_dalmolin.zoo_digital.comportamentos.Predador;

public class Golfinho extends Mamifero implements Nadador, Predador {

    public Golfinho(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() { System.out.println("Golfinho: *clic clic clic*"); }

    @Override
    public void comer() { System.out.println("Golfinho está comendo peixes."); }

    @Override
    public void nadar() { System.out.println("Golfinho está nadando rapidamente."); }

    @Override
    public void cacar() { System.out.println("Golfinho está caçando cardumes de peixes."); }
}
