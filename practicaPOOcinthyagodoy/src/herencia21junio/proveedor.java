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
public class proveedor extends Persona {
     private String direccion ;
     private String correoelectronico;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }
    
     @Override
     public void saludar(){
        System.out.println("la pregunta sera respondida en unos minutos");
    }
     public void test(){
         saludar();
         super.saludar();//llama al metodo de la clase padre
     }
     public static void main(String[] args) {
        proveedor objeto=new proveedor();
        objeto.saludar();
        
        objeto.test();
    }
    

    
}
