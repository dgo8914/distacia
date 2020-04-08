/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcula.distancia;


public class CalculaDistancia {

 
    public static void main(String[] args) {
     Punto p1 = new Punto(1.5,2.5);
     Punto p2 = new Punto(3.5,5.0);
 
//calculo de la distancia entre dos puntos
      double distancia = p1.calcularDistanciaDesde(p2);
      System.out.println(“La distancia de p1 a p2 es: ” + distancia);
    }
    
}
