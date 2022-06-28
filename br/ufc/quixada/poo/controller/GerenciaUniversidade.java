package br.ufc.quixada.poo.controller;

import java.util.ArrayList;

import br.ufc.quixada.poo.model.Aluno;
import br.ufc.quixada.poo.model.Curso;
import br.ufc.quixada.poo.model.Localizacao;
import br.ufc.quixada.poo.model.Universidade;

public interface GerenciaUniversidade {
  // gerenciando as universidades

  // adiciona uma universidade a lista de universidades
  public boolean adicionarUniversidade(Universidade universidade);

  // remove uma universidade pelo nome
  public boolean removerUniversidade(String nome);

  // dado um nome da univerdade e um nome, substitui o diretor da universidade
  public boolean modificarDiretor(String nomeUniversidae, String nomeDiretor);

  // retorna uma universidade dado o nome
  public Universidade getUniversidade(String nome);

  // retorna uma lista com as universidades que foram adicionadas
  public ArrayList<Universidade> imprimirListaUniversidade();

  // gerenciando os alunos

  // dado um nome da universidade e um aluno, adiciona um aluno na lista
  public boolean adicionarAluno(String nomeUniversidade, Aluno aluno);

  // dado um nome da universidade e um nome de aluno, remove um aluno na lista
  public boolean removerAluno(String nomeUniversidade, String nomeAluno);

  // dado uma universidade e um nome de aluno, retorna um aluno com mesmo nome
  public Aluno getAluno(Universidade universidade, String nome);

  // dado um nome d, altera o curso
  public Aluno alterarCurso(String nomeCurso);

  public ArrayList<Aluno> procurarCandidatos(Localizacao local, String curso);

  // gerenciando os cursos

  public boolean adicionarCurso(Curso curso);

  public boolean removerCurso(String nome);

  public ArrayList<Curso> imprimirListaCurso();
}
