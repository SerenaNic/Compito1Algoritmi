package it.unirc.ing.alg_sdati.compito;

import java.util.LinkedList;

public class Facoltà {

 private int codice;
 private int numIscritti;
 private double costoMantenimento;
 private boolean dormitorio;
 private LinkedList<Corso> corsiList;

 public Facolta(int codice, int numIscritti, double costoMantenimento, boolean dormitorio, LinkedList<Corso> corsiList) {
  super();
  this.codice = codice;
  this.numIscritti = numIscritti;
  this.costoMantenimento = costoMantenimento;
  this.dormitorio = dormitorio;
  this.corsiList = corsiList;
 }

 public int getCodice() {
  return codice;
 }

 public void setCodice(int codice) {
  this.codice = codice;
 }

 public int getNumIscritti() {
  return numIscritti;
 }

 public void setNumIscritti(int numIscritti) {
  this.numIscritti = numIscritti;
 }

 public double getCostoMantenimento() {
  return costoMantenimento;
 }
 
 public void setCostoMantenimento(double costoMantenimento) {
  this.costoMantenimento = costoMantenimento;
 }

 public boolean isDormitorio() {
  return dormitorio;
 }

 public void setDormitorio(boolean dormitorio) {
  this.dormitorio = dormitorio;
 }

 public LinkedList<Corso> getCorsiList() {
  return corsiList;
 }

 public void setCorsiList(LinkedList<Corso> corsiList) {
  this.corsiList = corsiList;
 }

 public double getLivMedioCorsi() {

  double sum=0.0;
  int num=corsiList.size();

  for(Corso c: corsiList)
    sum+=c.getLivelloDiff();
  return sum/num;
 }

 public int getNumCorsiMin5() {

  int c=0;
  for(Corso corso: corsiList)
    if(corso.getDurata()<5)
      c++;
  return c;
 }
}
