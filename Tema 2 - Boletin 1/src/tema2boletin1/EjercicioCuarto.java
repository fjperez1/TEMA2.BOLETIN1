package tema2boletin1;

import java.util.Scanner;

public class EjercicioCuarto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables que vamos a utilizar
		
		int num1, num2;
		Scanner lectura = new Scanner (System.in);
		
		//Solicitamos al usuario que nos indique los dos números
		
		System.out.println("Introduce el primer número");
		num1 = lectura.nextInt();
		System.out.println("Introduce el segundo número");
		num2 = lectura.nextInt();
		
		//Realizamos los cálculos necesarios
		
		if (num1>=num2) {
			System.out.println("Los números de menor a mayor: " + num2 + " , " + num1);
		} else { 
			System.out.println("Los números de menor a mayor: " + num1 + " , " + num2);
		}

	}

}
