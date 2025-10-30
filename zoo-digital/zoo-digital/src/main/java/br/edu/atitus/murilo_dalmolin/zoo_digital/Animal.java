package br.edu.atitus.murilo_dalmolin.zoo_digital;

public abstract class Animal {

    protected String nome;
    protected int idade;
    private static int contador = 0; // contador de animais

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        contador++;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public static int getContador() {
        return contador;
    }

    
    public abstract void emitirSom();
    public abstract void comer();

    @Override
    public String toString() {
        return nome + " (" + idade + " anos)";
    }
}

