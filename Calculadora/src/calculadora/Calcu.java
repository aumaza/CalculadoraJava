/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;



/**
 *
 * @author capacita_mecon
 */
public class Calcu {
    
    private static float Resultado;
    private static char Operador;
    
    
    public static float getNumber(){
        
        float num;
                     
        Scanner lector = new Scanner (System.in);
        System.out.println("Ingrese un numero: ");
        num = lector.nextInt();
        
        return num;
        
    }
    
    public static float sumar(float a, float b)
    {
          
        Resultado = a + b;
        
        return Resultado;
    }
    
    public static float restar(float a, float b)
    {
        Resultado = a - b;
        
        return Resultado;
    }
    
    public static float multiplicar (float a, float b)
    {
        Resultado = a * b;
        
        return Resultado;
    }
    
    public static float dividir(float a, float b)
    {
        if(b == 0)
        {
            System.out.println("NO ES POSIBLE DIVIDIR ENTRE O!!");
        }
        
        else
        {
            Resultado = a / b;
        }
        
        return Resultado;
    }
    
       
    public static char getOperador()         
    {
        char operador;
        
        Scanner lector = new Scanner (System.in);
        System.out.println("Ingrese el operador: ");
        operador = lector.next().charAt(0);
        
        return operador;
    }
    
    
    public static void setOperador(char operador, float a, float b){
        
        switch(operador)
        {
            case 1: if(operador == '+')
            {
                //sumar(a,b);
                System.out.println("La suma es: "+sumar(a,b));
            }
            break;
            
            case 2: if(operador == '-')
            {
                //restar(a,b);
                System.out.println("La resta es: "+restar(a,b));
            }
            break;
            
            case 3: if(operador == '*')
            {
                //multiplicar(a,b);
                System.out.println("La multiplicacion es: "+multiplicar(a,b));
            }
            break;
            
            case 4: if(operador == '/')
            {
                
                //dividir(a,b);
                System.out.println("La division es: "+dividir(a,b));
            }
            break;
        }
    }
   }
