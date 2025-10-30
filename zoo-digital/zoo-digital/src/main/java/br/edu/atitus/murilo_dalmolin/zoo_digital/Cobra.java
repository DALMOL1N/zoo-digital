package br.edu.atitus.murilo_dalmolin.zoo_digital;

import br.edu.atitus.murilo_dalmolin.zoo_digital.comportamentos.Predador;

public  class Cobra extends reptil implements Predador {

    public Cobra(String nome, int idade) {
        super(nome, idade);
    }

    @Override // barulho de cobra ksksksk
    public void emitirSom() {
        System.out.println(getNome() + " está sibilando (ssss).");
    }

   

	@Override
    public void comer() {
        System.out.println(getNome() + " está engolindo sua presa inteira.");
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " está caçando silenciosamente.");
    }
}
