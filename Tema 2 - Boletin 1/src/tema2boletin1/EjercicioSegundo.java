package tema2boletin1;

import java.util.Scanner;

public class EjercicioSegundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables que vamos a utilizar
		
		int num1, num2;
		Scanner lectura = new Scanner (System.in); //Iniciamos el scanner

		//Pedimos al usuario que nos indique los dos números
		
		System.out.println("Introduce el primer número");
		num1 = lectura.nextInt();
		System.out.println("Introduce el segundo número");
		num2 = lectura.nextInt();
		
		//Realizamos las operaciones necesarias
		
		if (num1 == num2){
			
			System.out.println("Los números introducidos son iguales");

		} else {
			
			System.out.println("Los números introducidos son distintos");
		}
	
	}

}