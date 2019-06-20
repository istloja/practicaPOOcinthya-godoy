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
public class VoidyDatos {
    public void sumar(int numero1,int numero2) {
        System.out.println("la suma es"+(numero1+numero2));    
    }
    public int sumar1(int numero1, int numero2){
        return numero1+numero2;
    
    }
    public boolean inicioceccion(String usuario,String password){
        boolean valor=false;
        if(usuario.equals("admin")&& password.equals("1234")){
        valor = true;       
    }
        return valor;
    }
    public static void main(String[] args){
        VoidyDatos objeto = new VoidyDatos();
        objeto.sumar(10, 8);
         objeto.sumar(11,23);
          objeto.sumar(100,7);
          int resultado=objeto.sumar1(40,10);
       System.out.println("la suma es"+resultado);
       String cadena = objeto.unirCadenas("Hola","mundo");
        System.out.println("la cadena unida es:"+cadena);
       boolean variableinicio = objeto.iniciaSesion("admin","1234");
        System.out.println("variableinicio");
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el usuario");
        String usuario = entrada.next();
        System.out.println("ingrese contraseña");
        String password=entrada.next();
        boolean iniciosesion=objeto.iniciasesion(usuario,password);
        if(iniciosesion){
            System.out.println("bienvenido al sistema");
        }
        
     }  

 }
 

