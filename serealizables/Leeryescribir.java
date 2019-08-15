/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serealizables;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ISTLOJAV
 */
public class Leeryescribir {
    public void escribirobjeto(String direccion,persona objeto){
        try{
        ObjectOutputStream archivo=new  ObjectOutputStream(new FileOutputStream(direccion));
        archivo.writeObject(objeto);
        archivo.close();
        }
        catch(Exception c){
                System.out.println("sintaxis error"+c);
                }
            }
    public void LeerArchivo(String direccion) {
        try{
        ObjectInputStream lector= new  ObjectInputStream(new FileInputStream(direccion));
        Object auxiliar=lector.readObject();
        persona objeto = (persona)auxiliar;
            System.out.println(objeto.getMascota().getNombre()+"su edad es"+objeto.getMascota().getEdad());
        }catch(Exception e){
            System.out.println(e);
        
    }
    }
    public void escribirlista(String direccion,List<persona> lista){
        try {
             ObjectOutputStream archivo=new  ObjectOutputStream(new FileOutputStream(direccion));
            for (persona persona : lista) {
                archivo.writeObject(persona);
                
            }
            archivo.close();
   
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
        public static void main(String[]args){
            Leeryescribir objeto=new Leeryescribir();
            persona objeto2=new persona("salome","Garcia",30256445,21,new mascota("copito de nieve",1,2));
            persona objeto3=new persona("katy","paz",111,12,new mascota("scoby",2,2));
        persona objeto4=new persona("vane","suares",1133,16,new mascota("piter",8,5));
        List <persona> lista= new ArrayList<>();
        lista.add(objeto2);
        lista.add(objeto3);
        lista.add(objeto4);
        objeto.escribirlista("C:\\Users\\ISTLOJAV\\Desktop\\asdasfas.txt", lista);
        
            objeto.escribirobjeto("C:\\Users\\ISTLOJAV\\Desktop\\asdasfas.txt",objeto2);
            objeto.LeerArchivo("C:\\Users\\ISTLOJAV\\Desktop\\asdasfas.txt");
        }
             
        }  

