package br.ufc.quixada.poo.model;

public class Aluno {
    private String nome;
    private String email;
    private String telefone;
    private Localizacao endereco;
    private String data_nascimento;
    private int ano_ingresso;
    private int matricula;
    private String curso;

    public Aluno(String nome, String email, String telefone, Localizacao endereco, String data_nascimento,
            int ano_ingresso, int matricula, String curso) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.data_nascimento = data_nascimento;
        this.ano_ingresso = ano_ingresso;
        this.matricula = matricula;
        this.curso = curso;
    }

    public Aluno(String nome, Localizacao endereco, int ano_ingresso, int matricula, String curso) {
        this.nome = nome;
        this.endereco = endereco;
        this.ano_ingresso = ano_ingresso;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Localizacao getEndereco() {
        return endereco;
    }

    public void setEndereco(Localizacao endereco) {
        this.endereco = endereco;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public int getAno_ingresso() {
        return ano_ingresso;
    }

    public void setAno_ingresso(int ano_ingresso) {
        this.ano_ingresso = ano_ingresso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String toString() {
        return "nome= " + this.nome +
                "\n email= " + this.email +
                "\n telefone= " + this.telefone +
                "\n endereco= " + this.endereco +
                "\n data_nascimento= " + this.data_nascimento +
                "\n ano_ingresso= " + this.ano_ingresso +
                "\n matricula= " + this.matricula + "\n";
    }
}
