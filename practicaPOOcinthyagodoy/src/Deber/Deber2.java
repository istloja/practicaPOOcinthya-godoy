/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber;

import java.util.Scanner;

/**
 *
 * @author ISTLOJAV
 */
public class Deber2 {
        public void Recibe()              
{                            
                
int numeroCuenta;               
double saldoInicio;               
double depositos;               
double cargos;               
double limiteCredito;               
                
                
Scanner entrada = new Scanner(System.in);            
                
System.out.println("\nPor favor introduzca el numero de cuenta del cliente o -1 para terminar: \n");   
numeroCuenta = entrada.nextInt();              
                
while ( -1 != numeroCuenta)            
{             
System.out.println("\nPor favor introduzca el saldoInicial: \n");           
saldoInicio = entrada.nextDouble();              
                
System.out.println("\nPor favor introduzca los depositos hechos por el cliente: \n");       
depositos = entrada.nextDouble();              
                
System.out.println("\nPor favor introduzca los cargos hechos al cliente: \n");        
cargos = entrada.nextDouble();              
                
System.out.println("\nPor favor introduzca el limite de credito para el cliente: \n");      
limiteCredito = entrada.nextDouble();              
                
                
double x = Retorna(saldoInicio, depositos, cargos);           
if( x - limiteCredito > 0)           
System.out.println("\nEl credito se ha excedido.");            
                
System.out.println("\nPor favor introduzca el numero de cuenta del cliente o -1 para terminar: \n");   
numeroCuenta = entrada.nextInt();              
                
}             
}            
                
public double Retorna( double saldoInic, double pagos, double cargos)        
{             
return saldoInic + pagos - cargos;           
}             
}  


