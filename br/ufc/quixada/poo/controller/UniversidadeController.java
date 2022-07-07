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


  //-----------------------------------------------------------------------
  //metodos universidade

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

  public boolean alterarUniversidade(String nomeUniversidade, String nome, String estado, String cidade, String diretor) {
    Universidade universidadeProcurando = getUniversidade(nomeUniversidade);
    boolean modifiquei = false;

    if (universidadeProcurando != null) {
      universidadeProcurando.setNome(nome);
      universidadeProcurando.getLocal().setEstado(estado);
      universidadeProcurando.getLocal().setCidade(cidade);
      universidadeProcurando.setNomeDiretor(diretor);
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


  //-----------------------------------------------------------------------
  //metodos aluno

  public boolean adicionarAluno(String nomeUniversidade, String nomeCurso, Aluno aluno) {
    Curso cursoProcurando = getCurso(nomeUniversidade, nomeCurso);
    boolean adicionei = false;

    if (cursoProcurando != null) {
      cursoProcurando.addAluno(aluno);
      adicionei = true;
    }
    return adicionei;
  }

  public boolean removerAluno(String nomeUniversidade, String nomeCurso, String nomeAluno) {
    Curso cursoProcurando = getCurso(nomeUniversidade,nomeCurso);
    boolean removi = false;

    if (cursoProcurando != null) {
      Aluno alunoProcurando = getAluno(nomeUniversidade, cursoProcurando.getNome(), nomeAluno);
      if (alunoProcurando != null) {
        cursoProcurando.removerAluno(alunoProcurando);
        removi = true;
      }
    }
    return removi;
  }

  @Override
  public Aluno getAluno(String nomeUniversidade, String nomeCurso, String nomeAluno) {
    Aluno alunoProcurado = null;
    ArrayList<Aluno> alunos = getCurso(nomeUniversidade, nomeCurso).getAlunos();

    for (Aluno alu : alunos) {
      if (alu.getNome().equals(nomeAluno)) {
        alunoProcurado = alu;
      }
    }
    return alunoProcurado;
  }


  //-----------------------------------------------------------------------
  //metodos curso

  @Override
  public Aluno alterarCurso(String nomeUniversidade, String nomeCurso) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ArrayList<Aluno> procurarCandidatos(Localizacao local, String curso) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean adicionarCurso(String nomeUniversidade, Curso curso) {
    Universidade universidadeProcurando = getUniversidade(nomeUniversidade);
    boolean adicionei = false;

    if (universidadeProcurando != null) {
      universidadeProcurando.addCurso(curso);
      adicionei = true;
    }
    return adicionei;
  }

  @Override
  public boolean removerCurso(String nomeUniversidade, String nomeCurso) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public ArrayList<Curso> imprimirListaCurso(String nomeUniversidade) {
    return getUniversidade(nomeUniversidade).getCursos();
  }

  @Override
  public Curso getCurso(String nomeUniversidade, String nome) {
    Curso cursoProcurado = null;
    ArrayList<Curso> cursos = (getUniversidade(nomeUniversidade)).getCursos();

    for (Curso cur : cursos) {
      if (cur.getNome().equals(nome)) {
        cursoProcurado = cur;
      }
    }
    return cursoProcurado;
  }
}
