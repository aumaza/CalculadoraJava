/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import static calculadora.Calcu.*;

/**
 *
 * @author capacita_mecon
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        float a;
        float b;
        char operador;

        a = getNumber();
        b = getNumber();

        operador = getOperador();
        setOperador(operador);
        /*int a;
        int b;
       // char operador;
        
        Scanner lector = new Scanner (System.in);
        System.out.println("Ingrese un numero: ");
        a = lector.nextInt();
        
        System.out.println("Ingrese otro numero: ");
        b = lector.nextInt();*/

    }

}
