/******************************************************************************

4. Realice un programa que tenga un array de caracteres que contenga las letras de la ‘A’ a la ‘Z’ (solo las mayúsculas). 
Después, ve pidiendo posiciones del array por teclado y si la posición es correcta mostrar el contenido de esa posición; 
en caso contrario mostrar “posición inválida”.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int n = 1, numero = 0;
		char abecedario[] = {'A','B','C','D','E','F','G','H',
		    'I','J','K','L','M','N','O','P','Q','R','S','T',
		    'U','V','W','X','Y','Z'
		};
		Scanner leer = new Scanner(System.in);
		do{
    		System.out.print("\nIngrese un numero entre 0 y 25: ");
    		numero = leer.nextInt();
    		
    		//ciclo para encontrar y mostrar el contenido del indice
    		if(numero < 0 || numero > 25) System.out.println("Posición inválida");
    		else{
    		    //for(int i = 0; i < abecedario.length; i++){
                  //if(abecedario[i] == numero) 
                  System.out.println("El caracter en la posicion[" + numero + "] es: " + abecedario[numero]);
                //}
    		}
		}while(numero >= 0 || numero < 25); //mientras sea un digito entre 0 y 25

}
}
