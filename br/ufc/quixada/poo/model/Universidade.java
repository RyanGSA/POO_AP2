package br.ufc.quixada.poo.model;

import java.util.ArrayList;

public class Universidade {
  private String nome;
  private Localizacao local;
  private String nomeDiretor;
  private ArrayList<Curso> cursos;

  public Universidade(String nome, Localizacao localizacao) {
    this.nome = nome;
    this.local = localizacao;
    cursos = null;
  }

  public Localizacao getLocal() {
    return local;
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

  public void addCurso(Curso curso) {
    cursos.add(curso);
  }

  public void removeCurso(Curso curso) {
    cursos.remove(curso);
  }

  public ArrayList<Curso> getCursos(){
    return cursos;
  }

  public String toString() {
    String dados = "\n" +
        "Nome:" + this.nome + "\n" + 
        this.local +
        "Diretor:" + this.nomeDiretor + "\n";

    return dados;
  }

}
