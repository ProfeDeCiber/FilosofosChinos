/*
 * Problema de los filosofos chinos enunciado por Dikjstra
 * 
 * Autor: Ruth
 * Fecha: octubre - 2021
 * Fichero: Filosofo.java
 * 
 */
import java.lang.Math.*;

public class Filosofo {
  boolean comiendo = false;
  boolean pensando = false;
  Palillo palilloEnManoIzqda;
  Palillo palilloEnManoDrcha;
  int miSitio = 0;
    
  public Filosofo (int sitio, Palillo palillo1, Palillo palillo2) {
    this.miSitio = sitio;
    this.palilloEnManoIzqda = palillo1;
    this.palilloEnManoDrcha = palillo2;
	System.out.println("Filosofo creado: " + this.miSitio);
	this.Pensar();
  }
  
  public void Pensar() {
    this.pensando = true;
    this.comiendo = false;
	System.out.println("Filosofo " + this.miSitio + " se pone a pensar.");
  }
  
  public void Comer() {
    this.pensando = false;
    if (palilloEnManoIzqda.libre()) {
      palilloEnManoIzqda.coger();
	  if (palilloEnManoDrcha.libre()) {
        palilloEnManoDrcha.coger();
        this.comiendo = true;
		System.out.println ("Soy el filosofo " + this.miSitio + " y me pongo a comer.");
		
		try {
			Thread.sleep((int) Math.floor(Math.random() * 5000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        System.out.println ("Soy el filosofo " + this.miSitio + " y he comido estupendamente.");
        palilloEnManoDrcha.soltar();
      } else {
        System.out.println ("Soy el filosofo " + this.miSitio + " y aunque tengo hambre no puedo comer.");
      }
      this.palilloEnManoIzqda.soltar();
      this.Pensar();
    }
  }
}
