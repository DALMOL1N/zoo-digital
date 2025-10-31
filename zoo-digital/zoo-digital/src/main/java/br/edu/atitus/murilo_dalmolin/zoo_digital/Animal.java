package br.edu.atitus.murilo_dalmolin.zoo_digital;
import org.apache.commons.lang3.StringUtils;


public abstract class Animal {

    private String nome;
    private int idade;
    private static int contador = 0;

    public Animal(String nome, int idade) {
        this.nome = StringUtils.capitalize(nome.toLowerCase()); // AQUI!!!
        this.idade = idade;
        contador++;
    }

    public abstract void emitirSom();
    public abstract void comer();

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public static int getContador() {
        return contador;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " - Nome: " + nome + ", Idade: " + idade;
    }
}


