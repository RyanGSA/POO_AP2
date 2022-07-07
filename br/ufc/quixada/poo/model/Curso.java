package br.ufc.quixada.poo.model;

import java.util.ArrayList;

public class Curso {
    private String nome;
    private int carga_horaria;
    private String turno;
    private ArrayList<Aluno> alunos;
    
    public Curso(String nome, int carga_horaria, String turno) {
        this.nome = nome;
        this.carga_horaria = carga_horaria;
        this.turno = turno;
        alunos = new ArrayList<Aluno>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCarga() {
        return carga_horaria;
    }
    
    public void setCarga(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    
    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public String toString() {
        String dados = "\n" +
            "Nome:" + this.nome + "\n" + 
            "Carga Horaria:" + this.carga_horaria + "\n" +
            "Turno:" + this.turno + "\n";
        return dados;
    }
}
