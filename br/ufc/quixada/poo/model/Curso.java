package br.ufc.quixada.poo.model;

public class Curso {
    private String nome;
    private int carga_horaria;
    private String turno;
    
    public Curso(String nome, int carga_horaria, String turno) {
        this.nome = nome;
        this.carga_horaria = carga_horaria;
        this.turno = turno;
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

    public String toString() {
        return "[nome=" + this.nome + ", carga_horaria=" + this.carga_horaria + ", turno=" + this.turno + "]";
    }
}
