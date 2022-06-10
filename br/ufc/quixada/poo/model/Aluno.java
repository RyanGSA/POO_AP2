package br.ufc.quixada.poo.model;

public class Aluno {
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private String data_nascimento;
    private int ano_ingresso;
    private int matricula;

    public Aluno (String nome, String email, String telefone, String endereco, String data_nascimento, int ano_ingresso, int matricula) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.data_nascimento = data_nascimento;
        this.ano_ingresso = ano_ingresso;
        this.matricula = matricula;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
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

    public String toString() {
        return "nome= " + nome +
         "\n email= " + email +
         "\n telefone= " + telefone +
         "\n endereco= " + endereco +
         "\n data_nascimento= " + data_nascimento +
         "\n ano_ingresso= " + ano_ingresso +
         "\n matricula= " + matricula +"\n";
    }
}
