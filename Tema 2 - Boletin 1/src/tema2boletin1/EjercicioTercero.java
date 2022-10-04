package tema2boletin1;

import java.util.Scanner;

public class EjercicioTercero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables que vamos a utilizar
		
		double ndecimal;
		Scanner lectura = new Scanner (System.in); //Iniciamos el scanner
		
		//Pedimos al usuario que introduzca el número
		
		System.out.println("Introduce el número decimal");
		ndecimal = lectura.nextDouble();
		
		//Realizamos los cálculos necesarios
		
		if ((ndecimal > -1) && (ndecimal < 1) && (ndecimal != 0)){
			
			System.out.println("El número que has introducido es un número casi-cero");
					
		} else {
			
			System.out.println("El número que has introducido no es un número casi-cero");

		}
		

	}

}
