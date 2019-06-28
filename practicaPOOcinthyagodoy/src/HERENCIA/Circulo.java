/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HERENCIA;

/**
 *
 * @author ISTLOJAV
 */
public class Circulo extends figurabidimencional {
    public double carcularArea(double radio){
      return radio*Math.pow(Math.PI,2);
    }
    public double calcularPerimetro(double radio) {
        return radio*(2*Math.PI);
    }
}
