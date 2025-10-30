
package br.edu.atitus.murilo_dalmolin.zoo_digital;

import br.edu.atitus.murilo_dalmolin.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.murilo_dalmolin.zoo_digital.comportamentos.Predador;

public class Gato extends Mamifero implements Corredor, Predador {

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está miando.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo sachê sabor peixe.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo atrás do laser.");
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " está caçando um rato.");
    }
}
