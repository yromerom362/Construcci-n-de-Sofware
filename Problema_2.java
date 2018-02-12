/**
 *  Add three numbers
 *Problem statement
 *Complete the given function which takes 3 integers as input. Return the sum of the
  3 integers as output.
 * 
 * @author (Yeisson Romero) 
 * @version (11-02-2028)
 */
import java.util.Scanner;
public class Problema_2
{
      public static void main (String[] args){
    Scanner entrada = new Scanner (System.in);
    int suma = 0;
    int numero = 0;
    
    for (int i = 0; i < 3; i++){
        
        System.out.print(" Ingrese el entero " + (i + 1) + " \n ");
        numero=entrada.nextInt ();
        suma = suma + numero;
    } 
    
    System.out.print ("La suma de los tres numeros es: " + suma);
    }
}
