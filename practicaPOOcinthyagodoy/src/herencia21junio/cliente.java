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
public class cliente extends Persona{
    private int Npago;
    private String tipodedato;
    public void comprar(){
        System.out.println("la compra se realizo");
    }

    public int getNpago() {
        return Npago;
    }

    public void setNpago(int Npago) {
        this.Npago = Npago;
    }

    public String getTipodedato() {
        return tipodedato;
    }

    public void setTipodedato(String tipodedato) {
        this.tipodedato = tipodedato;
    }
    @Override
    public void saludar(){
        System.out.println("hola soy un cliente");
    }
    public void test(){
        saludar();
        super.saludar();
    }
    
    
    public static void main(String[] args) {
        cliente objeto = new cliente();
        objeto.saludar();
        //objeto.comprar();
        objeto.test();
    }
}
