package br.ufc.quixada.poo.model;

public class Aluno {
    private String nome;
    private int ano_ingresso;
    private int matricula;

    public Aluno(String nome, int ano_ingresso, int matricula) {
        this.nome = nome;
        this.ano_ingresso = ano_ingresso;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno_ingresso() {
        return ano_ingresso;
    }

    public void setAno_ingresso(int ano_ingresso) {
        this.ano_ingresso = ano_ingresso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String toString() {
        return "nome= " + this.nome +
                "\n ano_ingresso= " + this.ano_ingresso +
                "\n matricula= " + this.matricula + "\n";
    }
}
