package tema2boletin1;

import java.util.Scanner;

public class EjercicioPrimero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables que vamos a utilizar
		
		int num, resto;
		boolean par;
		Scanner lectura = new Scanner (System.in); //Iniciamos el scanner

		//Solicitamos un número al usuario
		
		System.out.println("Introduce un número para saber si es par o no");
		num = lectura.nextInt();
		
		//Realizamos las operaciones necesarias
		
		resto = num%2;
		if (resto==0) {
			
			par =true;
			
		} else {
			par = false;
		}
		
		//Mostramos el resultado al usuario
		
		System.out.println("¿El número introducido es par? " + par);
	}
		
}
