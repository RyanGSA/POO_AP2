package br.ufc.quixada.poo.ui;

import java.util.ArrayList;
import java.util.Scanner;

import br.ufc.quixada.poo.controller.GerenciaUniversidade;
import br.ufc.quixada.poo.model.Aluno;
import br.ufc.quixada.poo.model.Localizacao;

public class TraineeUI {

    private GerenciaUniversidade gerencia;
    private boolean running;

    public TraineeUI(GerenciaUniversidade controladorUniversidade) {
        this.gerencia = controladorUniversidade;
    }

    private void printMenu() {
        String menu = "-------------------------------------- \n" +
                "Digite a opcao desejada: \n" +
                "1 - Procurar Candidatos \n" +
                /*
                 * dado um estado, uma cidade e um curso,
                 * mostrar os alunos matriculados em cada universidade
                 */
                "2 - Adicionar um aluno \n" +
                "3 - Adicionar uma Universidade \n" +
                "4 - Adicionar um curso \n" +
                "5 - Sair \n";

        System.out.println(menu);
    }

    private void adicionarAluno() {
        System.out.println("Adicionando um aluno ");
        String nome = lerString("Digite o nome do aluno: ");
        String estado = lerString("Digite o estado do aluno: ");
        String cidade = lerString("Digite a cidade do aluno: ");
        int anoIngresso = lerInteiro("Digite o ano de ingresso do estudante: ");
        int matricula = lerInteiro("Digite a matricula do aluno: ");
        String curso = lerString("Digite o curso do aluno: ");

        Localizacao l = new Localizacao(estado, cidade);
        Aluno alu = new Aluno(nome, l, anoIngresso, matricula, curso);
        boolean add = gerencia.adicionarAluno(alu);

        if (add) {
            System.out.println("Aluno adicionado com sucesso");
        } else {
            System.out.println("Não foi possivel adicionar o aluno");
        }
    }

    private void encerrarGerencia() {
        System.out.println("Encerrando o programa de estágios...");
        running = false;
    }

    private void avaliarOpcao(int opcao) {

        switch (opcao) {
            case 1:

                break;
            case 2:
                adicionarAluno();
                break;

            case 3:

                break;
            case 4:

                break;
            case 5:
                encerrarGerencia();
                break;
            default:
                break;
        }
    }

    private int lerInteiro(String mensagem) {

        int numeroLido = 0;

        System.out.println(mensagem);
        // Lendo inteiros do teclado. Vamos utilizar para ler a opcao, ler a placa e o
        // valor do veiculo;
        Scanner scanner = new Scanner(System.in);
        numeroLido = scanner.nextInt();

        return numeroLido;

    }

    private String lerString(String mensagem) {

        System.out.println(mensagem);

        String msg;
        Scanner scanner = new Scanner(System.in);
        msg = scanner.nextLine();

        return msg;
    }

    public void run() {

        this.running = true;

        while (running) {

            printMenu();
            String msg = "Digite a opcao desejada: ";
            int opcao = lerInteiro(msg);
            avaliarOpcao(opcao);
        }
    }

}
