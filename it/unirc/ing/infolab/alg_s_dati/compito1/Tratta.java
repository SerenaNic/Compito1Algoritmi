package it.unirc.ing.infolab.alg_s_dati.compito1;

public class Tratta {

  private int codice;
  private Double lunghezza;

  public Tratta(int codice, Double lunghezza) {
    this.codice = codice;
    this.lunghezza = lunghezza;
  }
  
  public int getCodice() {
    return codice;
  }
  
  public void setCodice(int codice) {
    this.codice = codice;
  }
  
  public Double getLunghezza() {
    return lunghezza;
  }
  
  public void setLunghezza(Double lunghezza) {
    this.lunghezza = lunghezza;
  }
  
  public boolean equals (Tratta t){
    if(codice==t.getCodice())
      return true;
    return false;
  }
}
