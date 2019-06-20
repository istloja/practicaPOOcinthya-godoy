/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/**
 *
 * @author ISTLOJAV
 */
public class EstaticosyDinamicos {
    public static void main(String[] args) {
        saludar();
        EstaticosyDinamicos objeto=new EstaticosyDinamicos();
        objeto.despedir();
    }
    public static void saludar() {
        System.out.println("hola");  
    }
    public void despedir(){
         System.out.println("hola");  
    }  
}
