/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia21junio;

/**
 *
 * @author ISTLOJAV
 */
public class Persona {
 private String nombre;
private String apellido;
 private int cedul;
 private int telefono;

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

    public int getCedul() {
        return cedul;
    }

    public void setCedul(int cedul) {
        this.cedul = cedul;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
 
 public void saludar(){
     System.out.println("hola como estas");
 }
 public void despedirse(){
     System.out.println("hasta luego");
 }
    public static void main(String[] args) {
        Persona objeto = new Persona();
        objeto.setNombre("manuel");
        System.out.println(objeto.getNombre());
    }
}
