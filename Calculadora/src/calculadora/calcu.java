/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author capacita_mecon
 */
public class calcu {
    
    private static float Resultado;
    private static char Operador;
    
    public static void sumar(int a, int b)
    {
        Resultado = a + b;
    }
    
    public static void restar(int a, int b)
    {
        Resultado = a - b;
    }
    
    public static void multiplicar (int a, int b)
    {
        Resultado = a * b;
    }
    
    public static void dividir(int a, int b)
    {
        if(b == 0)
        {
            System.out.println("NO ES POSIBLE DIVIDIR ENTRE O!!");
        }
        
        else
        {
            Resultado = a / b;
        }
    }
    
    public static void SetOperador(char operador)         
    {
        operador = 
    }
   }
