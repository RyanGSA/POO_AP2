package br.ufc.quixada.poo.model;

import java.util.ArrayList;

public class Universidade {
  private String nome;
  private Localizacao local;
  private ArrayList<Curso> cursos;
  private ArrayList<Aluno> aluno;

  public Universidade(String nome, Localizacao localizacao) {
    this.nome = nome;
    this.local = localizacao;
  }

  public String toString() {
    String dados = "-------------------------------------- \n" +
        "Imprimindo informações da universidade: \n" +
        "Nome:[" + nome + "]" +
        ", Local:" + local;

    return dados;
  }

}
