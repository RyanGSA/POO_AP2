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

  public boolean adicionarUniversidade(Universidade universidade) {
    universidades.add(universidade);
    return true;
  }

  public boolean removerUniversidade(String nome) {

    Universidade universidadeProcurando = getUniversidade(nome);
    boolean apaguei = false;

    if (universidadeProcurando != null) {
      this.universidades.remove(universidadeProcurando);
      apaguei = true;
    }
    return apaguei;
  }

  public boolean modificarDiretor(String nomeUniversidae, String nomeDiretor) {
    Universidade universidadeProcurando = getUniversidade(nomeUniversidae);
    boolean modifiquei = false;

    if (universidadeProcurando != null) {
      universidadeProcurando.setNomeDiretor(nomeDiretor);
      modifiquei = true;
    }

    return modifiquei;
  }

  public Universidade getUniversidade(String nome) {
    Universidade universidadeProcurando = null;

    for (Universidade v : universidades) {
      String nomeUniversidade = v.getNome();
      if (nome.equals(nomeUniversidade)) {
        universidadeProcurando = v;
        break;
      }
    }
    return universidadeProcurando;
  }

  public ArrayList<Universidade> imprimirListaUniversidade() {
    return universidades;
  }

  public boolean adicionarAluno(String nomeUniversidade, Aluno aluno) {
    Universidade universidadeProcurando = getUniversidade(nomeUniversidade);
    boolean adicionei = false;

    if (universidadeProcurando != null) {
      universidadeProcurando.addAluno(aluno);
      adicionei = true;
    }
    return adicionei;
  }

  public boolean removerAluno(String nomeUniversidade, String nomeAluno) {
    Universidade universidadeProcurando = getUniversidade(nomeUniversidade);
    boolean removi = false;

    if (universidadeProcurando != null) {
      Aluno alunoProcurando = getAluno(universidadeProcurando, nomeAluno);
      if (alunoProcurando != null) {
        universidadeProcurando.removerAluno(alunoProcurando);
        removi = true;
      }
    }
    return removi;
  }

  @Override
  public Aluno getAluno(Universidade universidade, String nome) {
    Aluno alunoProcurado = null;
    ArrayList<Aluno> alunos = universidade.getAlunos();

    for (Aluno alu : alunos) {
      if (alu.getNome().equals(nome)) {
        alunoProcurado = alu;
      }
    }
    return alunoProcurado;
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
