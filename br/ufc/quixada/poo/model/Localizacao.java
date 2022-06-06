package br.ufc.quixada.poo.model;

public class Localizacao {
  private String estado;
  private String cidade;

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

  public String toString() {
    return "[cidade=" + cidade + ", estado=" + estado + "]";
  }

}
