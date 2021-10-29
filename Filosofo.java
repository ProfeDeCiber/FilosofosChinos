/*
 * Problema de los filosofos chinos enunciado por Dikjstra
 * 
 * Autor: Ruth
 * Fecha: octubre - 2021
 * Fichero: Filosofo.java
 * 
 */

public class Filosofo {
  boolean comiendo = false;
  boolean pensando = false;
  Palillo palilloEnManoIzqda;
  Palillo palilloEnManoDrcha;
  int miSitio = 0;
  
  public SentarseAComer (int sitio, Palillo palillo1, Palillo palillo2) {
    this.miSitio = sitio;
    this.palilloEnManoIzqda = palillo1;
    this.palilloEnManoDrcha = palillo2;    
  }
  
  public Pensar() {
    this.pensando = true;
    this.comiendo = false;
  }
  
  public Comer() {
    this.pensando = false;
    if palilloEnManoIzqda.libre() {
      palilloEnManoIzqda.coger();
      if palilloEnManoDrcha.libre() {
        palilloEnManoDrcha.coger();
        this.comiendo = true;
        this.sleep(5000);
        System.out.println ("Soy el filósofo número " + this.miSitio + " y he comido estupendamente.");
        palilloEnManoDrcha.soltar();
      } else {
        System.out.println ("Soy el filósofo número " + this.miSitio + " y aunque tengo hambre no puedo comer.");
      }
      this.palilloEnManoIzqda.soltar()
      this.Pensar();
    }
  }
}
