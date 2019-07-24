/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivoscasa;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author ISTLOJAV
 */
public class Archivos {
    public static void main(String[] args) {
           int resultado; 
           
        Scanner entrada = new Scanner(System.in);
                
        System.out.println("ingrese 1 para enlistar los arch-documentos 2 para los de imagenes 3 para los de musica 4 para los de videos 5 para los de net beans ");
         resultado = entrada.nextInt();
        
        
        switch (resultado){
            case 1:
                File carpeta = new File("C:\\Users\\ISTLOJAV\\Documents");
                String [] arregloarchivos =carpeta.list();
                for(int i =0; i < arregloarchivos . length; i++){
                    System.out.println(arregloarchivos[i]);
                }
            break;
            case 2:
                File carpeta1 = new File("C:\\Users\\ISTLOJAV\\Pictures");
                String [] arregloarchivos1 =carpeta1.list();
                for(int i =0; i < arregloarchivos1 . length; i++){
                    System.out.println(arregloarchivos1[i]);
                
        }
                break;
            case 3:
                File carpeta2 = new File("C:\\Users\\ISTLOJAV\\Music");
                String [] arregloarchivos2 =carpeta2.list();
                for(int i =0; i < arregloarchivos2 . length; i++){
                    System.out.println(arregloarchivos2[i]);
                
        }
                break;
            case 4:
                File carpeta3 = new File("C:\\Users\\ISTLOJAV\\Videos");
                String [] arregloarchivos3 =carpeta3.list();
                for(int i =0; i < arregloarchivos3 . length; i++){
                    System.out.println(arregloarchivos3[i]);
                
        }
                break;
            case 5:
                File carpeta4 = new File("C:\\Users\\ISTLOJAV\\Documents/NetBeansProjects");
                String [] arregloarchivos4 =carpeta4.list();
                for(int i =0; i < arregloarchivos4 . length; i++){
                    System.out.println(arregloarchivos4[i]);
                
        }
                break;
    }
       
    
}
}