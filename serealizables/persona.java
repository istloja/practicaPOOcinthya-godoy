/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serealizables;

import java.io.Serializable;

/**
 *
 * @author ISTLOJAV
 */
public class persona implements Serializable {
    private String nombre;
    private String apellido;
    private int telefono;
    private int edad;
    private mascota Mascota;

    public persona(String nombre) {
        this.nombre = nombre;
    }

    public persona(String nombre, String apellido, int telefono, int edad, mascota Mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
        this.Mascota = Mascota;
    }
    

    public persona() {
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public mascota getMascota() {
        return Mascota;
    }

    public void setMascota(mascota Mascota) {
        this.Mascota = Mascota;
    }
    public static void main(String[]args){
        persona objeto =new persona("luis","perez",666,25,new mascota("rex",5,4));
        persona objeto2=new persona("salome","Garcia",30256445,21,new mascota("copito de nieve",1,2));
        persona objeto3=new persona("katy","paz",111,12,new mascota("scoby",2,2));
        persona objeto4=new persona("vane","suares",1133,16,new mascota("piter",8,5));
        System.out.println("su dueño se llama "+objeto.getNombre()+"y su mascota se llama"+objeto.getMascota().getNombre());
        
    }
}
