package br.ufc.quixada.poo.controller;

import java.util.ArrayList;

import br.ufc.quixada.poo.model.Aluno;
import br.ufc.quixada.poo.model.Curso;
import br.ufc.quixada.poo.model.Localizacao;
import br.ufc.quixada.poo.model.Universidade;

public class UniversidadeController implements GerenciaUniversidade {

  private ArrayList<Universidade> universidades;

  public UniversidadeController() {
    this.universidades = new ArrayList<Universidade>();
  }

  @Override
  public boolean adicionarUniversidade(Universidade universidade) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean removerUniversidade(String nome) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean modificarDiretor(String nomeDiretor) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public ArrayList<Universidade> imprimirListaUniversidade() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean adicionarAluno(Aluno aluno) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean removerAluno(String nome) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public Aluno getAluno(String nome) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Aluno alterarCurso(String nomeCurso) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ArrayList<Aluno> procurarCandidatos(Localizacao local, String curso) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean adicionarCurso(Curso curso) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean removerCurso(String nome) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public ArrayList<Curso> imprimirListaCurso() {
    // TODO Auto-generated method stub
    return null;
  }

}
