package it.unirc.ing.infolab.alg_s_dati.compito1;

public class Corso {

 private int codice;
 private int livelloDiff;
 private int numMaterie;
 private int durata;

 public Corso(int codice, int livelloDiff, int numMaterie, int durata) {
  super();
  this.codice = codice;
  this.livelloDiff = livelloDiff;
  this.numMaterie = numMaterie;
  this.durata = durata;
 }
 
 public int getCodice() {
  return codice;
 }
 public void setCodice(int codice) {
  this.codice = codice;
 }
 public int getLivelloDiff() {
  return livelloDiff;
 }
 public void setLivelloDiff(int livelloDiff) {
   this.livelloDiff = livelloDiff;
 }
 public int getNumMaterie() {
  return numMaterie;
 }
 public void setNumMaterie(int numMaterie) {
  this.numMaterie = numMaterie;
 }
 public int getDurata() {
  return durata;
 }
 public void setDurata(int durata) {
  this.durata = durata;
 }
}
