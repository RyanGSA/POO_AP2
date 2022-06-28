package br.ufc.quixada.poo.model;

import java.util.ArrayList;

public class Universidade {
  private String nome;
  private Localizacao local;
  private String nomeDiretor;
  private ArrayList<Curso> cursos;
  private ArrayList<Aluno> alunos;

  public Universidade(String nome, Localizacao localizacao) {
    this.nome = nome;
    this.local = localizacao;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNomeDiretor() {
    return nomeDiretor;
  }

  public void setNomeDiretor(String nomeDiretor) {
    this.nomeDiretor = nomeDiretor;
  }

  public void addAluno(Aluno aluno) {
    alunos.add(aluno);
  }

  public void removerAluno(Aluno aluno) {
    alunos.remove(aluno);
  }

  public void addCurso(Curso curso) {
    cursos.add(curso);
  }

  public ArrayList<Aluno> getAlunos() {
    return alunos;
  }

  public String toString() {
    String dados = "-------------------------------------- \n" +
        "Imprimindo informações da universidade: \n" +
        "Nome:[" + this.nome + "]" +
        ", Local:" + this.local;

    return dados;
  }

}
