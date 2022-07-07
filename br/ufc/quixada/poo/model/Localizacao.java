package br.ufc.quixada.poo.model;

import java.util.ArrayList;

public class Localizacao {
  private String estado;
  private String cidade;
  private ArrayList<Universidade> universidades;

  public Localizacao(String estado, String cidade) {
    this.estado = estado;
    this.cidade = cidade;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public void addUniversidade(Universidade universidade) {
    universidades.add(universidade);
  }

  public void removeUniversidade(Universidade universidade) {
    universidades.remove(universidade);
  }

  public String toString() {
    return "Cidade: " + this.cidade + "\n" + "Estado: " + this.estado + "\n";
  }

}
