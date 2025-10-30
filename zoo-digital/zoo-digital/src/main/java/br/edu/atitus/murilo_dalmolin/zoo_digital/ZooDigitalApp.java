package br.edu.atitus.murilo_dalmolin.zoo_digital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import br.edu.atitus.murilo_dalmolin.zoo_digital.comportamentos.*;

public class ZooDigitalApp {

	private static List<Animal> animais = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("\n===== ZOO DIGITAL =====");
            System.out.println("1 - Cadastrar Animal");
            System.out.println("2 - Listar Todos Animais");
            System.out.println("3 - Listar Corredores");
            System.out.println("4 - Listar Nadadores");
            System.out.println("5 - Listar Voadores");
            System.out.println("6 - Listar Predadores");
            System.out.println("7 - Total de Animais");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> cadastrarAnimal(sc);
                case 2 -> listarTodos();
                case 3 -> listarCorredores();
                case 4 -> listarNadadores();
                case 5 -> listarVoadores();
                case 6 -> listarPredadores();
                case 7 -> System.out.println("\nTotal de animais cadastrados: " + Animal.getContador());
                case 0 -> System.out.println("\nEncerrando...");
                default -> System.out.println("\nOpção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }

    private static void cadastrarAnimal(Scanner sc) {
        System.out.println("\n== Cadastro de Animal ==");
        System.out.println("Informe o tipo:");
        System.out.println("1 - Cachorro");
        System.out.println("2 - Gato");
        System.out.println("3 - Pinguim");
        System.out.println("4 - Falcao");
        System.out.println("5 - Tubarao");
        System.out.println("6 - Tilapia");
        System.out.println("7 - Jacare");
        System.out.println("8 - Cobra");
        System.out.println("9 - Lagarto");
        System.out.println("10 - Tartaruga");
        System.out.print("Opção: ");

        int tipo = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome do animal: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        Animal novoAnimal = switch (tipo) {
            case 1 -> new Cachorro(nome, idade);
            case 2 -> new Gato(nome, idade);
            case 3 -> new Pinguim(nome, idade);
            case 4 -> new Falcao(nome, idade);
            case 5 -> new Tubarao(nome, idade);
            case 6 -> new Tilapia(nome, idade);
            case 7 -> new jacare(nome, idade);
            case 8 -> new Cobra(nome, idade);
            case 9 -> new Lagarto(nome, idade);
            case 10 -> new Tartaruga(nome, idade);
            default -> null;
        };

        if (novoAnimal != null) {
            animais.add(novoAnimal);
            System.out.println("\nAnimal cadastrado com sucesso!");
        } else {
            System.out.println("\nTipo inválido. Cadastro cancelado.");
        }
    }

    private static void listarTodos() {
        System.out.println("\n== Todos os Animais ==");
        for (Animal a : animais) {
            System.out.println(a);
            a.emitirSom();
            a.comer();
            System.out.println("----------------------");
        }
    }

    private static void listarCorredores() {
        System.out.println("\n== Animais Corredores ==");
        for (Animal a : animais) {
            if (a instanceof Corredor corredor) {
                System.out.println(a);
                corredor.correr();
                System.out.println("----------------------");
            }
        }
    }

    private static void listarNadadores() {
        System.out.println("\n== Animais Nadadores ==");
        for (Animal a : animais) {
            if (a instanceof Nadador nadador) {
                System.out.println(a);
                nadador.nadar();
                System.out.println("----------------------");
            }
        }
    }

    private static void listarVoadores() {
        System.out.println("\n== Animais Voadores ==");
        for (Animal a : animais) {
            if (a instanceof Voador voador) {
                System.out.println(a);
                voador.voar();
                System.out.println("----------------------");
            }
        }
    }

    private static void listarPredadores() {
        System.out.println("\n== Animais Predadores ==");
        for (Animal a : animais) {
            if (a instanceof Predador predador) {
                System.out.println(a);
                predador.atacar();
                System.out.println("----------------------");
            }
        }
    }
}
