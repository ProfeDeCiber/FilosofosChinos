/*
 * Problema de los filosofos chinos enunciado por Dikjstra
 * 
 * Autor: Ruth
 * Fecha: octubre - 2021
 * Fichero: Palillo.java
 * 
 */

public class Palillo {
  int id;
  boolean libre = true;
  
  public Palillo(int idPalillo) {
    this.id = idPalillo;
  }
  
  public Palillo() {
    this.id = -1;
  }
  
  public boolean libre(){
    return this.libre;
  }
  
  public void coger(){
    this.libre = false;
    System.out.println ("Palillo " + this.id + " cogido.");
  }
  
  public void soltar() {
    this.libre = true;
    System.out.println ("Palillo " + this.id + " soltado.");
  }
}
