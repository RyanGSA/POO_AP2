package br.ufc.quixada.poo.controller;

import java.util.ArrayList;

import br.ufc.quixada.poo.model.Aluno;
import br.ufc.quixada.poo.model.Curso;
import br.ufc.quixada.poo.model.Localizacao;
import br.ufc.quixada.poo.model.Universidade;

public interface GerenciaUniversidade {

  // gerenciando as universidades

  // adiciona uma universidade
  public boolean adicionarUniversidade(Universidade universidade);

  // remove uma universidade
  public boolean removerUniversidade(String nomeUniversidade);

  // altera universidade
  public boolean alterarUniversidade(String nomeUniversidade, String nome, String estado, String cidade, String diretor);

  // retorna uma universidade dado o nome
  public Universidade getUniversidade(String nome);

  // retorna uma lista com as universidades que foram adicionadas
  public ArrayList<Universidade> imprimirListaUniversidade();



  // gerenciando os alunos

  // adiciona um aluno na lista
  public boolean adicionarAluno(String nomeUniversidade, String nomeCurso, Aluno aluno);

  // remove um aluno na lista
  public boolean removerAluno(String nomeUniversidade, String nomeCurso, String nomeAluno);

  // retorna um aluno com mesmo nome
  public Aluno getAluno(String nomeUniversidade, String nomeCurso, String nomeAluno);

  

  // gerenciando os cursos

  // retorna um curso com mesmo nome
  public Curso getCurso(String nomeUniversidade, String nomeCurso);

  // altera o curso
  public boolean alterarCurso(String nomeUniversidade, String nomeCurso, String nome, int carga, String turno);

  // adiciona um curso
  public boolean adicionarCurso(String nomeUniversidade, Curso curso);

  // remove um curso
  public boolean removerCurso(String nomeUniversidade, String nomeCurso);

  // imprime todos os cursos
  public ArrayList<Curso> imprimirListaCurso(String nomeUniversidade);



  // a grande funcao principal exigida no pdf *********
  public ArrayList<Aluno> procurarCandidatos(Localizacao local, String curso);
}
