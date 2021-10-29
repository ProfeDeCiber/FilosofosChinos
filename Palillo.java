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
  libre boolean = false;
  
  public Palillo(idPalillo) {
    this.id = idPalillo;
  }
  
  public libre(){
    return this.libre;
  }
  
  public coger(){
    this.libre = false;
    System.out.println ("Palillo " + this.id + " cogido.");
  }
  
  public soltar() {
    this.libre = true;
    System.out.println ("Palillo " + this.id + " soltado.");
  }
}
