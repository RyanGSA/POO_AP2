package br.ufc.quixada.poo.controller;

import java.util.ArrayList;

import br.ufc.quixada.poo.model.Aluno;
import br.ufc.quixada.poo.model.Curso;
import br.ufc.quixada.poo.model.Localizacao;
import br.ufc.quixada.poo.model.Universidade;

public interface GerenciaUniversidade {
  // gerenciando as universidades

  public boolean adicionarUniversidade(Universidade universidade);

  public boolean removerUniversidade(String nome);

  public boolean modificarDiretor(String nomeDiretor);

  public ArrayList<Universidade> imprimirListaUniversidade();

  // gerenciando os alunos

  public boolean adicionarAluno(Aluno aluno);

  public boolean removerAluno(String nome);

  public boolean removerAlunoID(int matricula);

  public Aluno getAluno(String nome);

  public Aluno alterarCurso(String nomeCurso);

  public ArrayList<Aluno> procurarCandidatos(Localizacao local, String curso);

  // gerenciando os cursos

  public boolean adicionarCurso(Curso curso);

  public boolean removerCurso(String nome);

  public ArrayList<Curso> imprimirListaCurso();
}
