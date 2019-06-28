/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HERENCIA;

import java.util.Scanner;

/**
 *
 * @author ISTLOJAV
 */
public class Ejecutar {
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
        System.out.println("ingrese 1 para circulo2 para"
        + "triangulo y 3 para cuadrado");
        int valor = entrada.nextInt();
        switch (valor){
            case 1:
                System.out.println("ingrese el radio del circulo");
                double radio=entrada.nextDouble();
                Circulo objeto1 = new Circulo();
                double areaCirculo=objeto1.carcularArea(radio);
                double perimetroCirculo=objeto1 .calcularPerimetro(radio);
                System.out.println("el area es"+areaCirculo+ "y el perimetro es"+perimetroCirculo);
                break;//va despues de cada case
            case 2:
                System.out.println("ingrese el valor de un cuadrado");
                double lado=entrada.nextDouble();
                Cuadrado objeto2 =new Cuadrado();
                double areacuadrado=objeto2.carcularArea(lado);
                double perimetrocuadrado=objeto2 .calcularPerimetro(lado);
                System.out.println("el area es"+areacuadrado+"y su perimetro es"+perimetrocuadrado);
                
                break;
            case 3:
                System.out.println("ingrese el valor del triangulo");
                double base=entrada.nextDouble();
                double altura=entrada.nextDouble();
                double lado1=entrada.nextDouble();
                double lado2=entrada.nextDouble();
                double lado3=entrada.nextDouble();
                Triangulo objeto3 = new Triangulo();
         
                double areatriangulo=objeto3.calculararea(base, altura);
                double perimetrotriangulo=objeto3.carcularperimetro(lado1, lado2, lado3);
                System.out.println("el area es"+areatriangulo+"y su perimetro es"+Perimetrotriangulo);
                break;
            default:
                System.out.println("ingrese otro numero correcto");
                break;
                
        }

    }
    
}
