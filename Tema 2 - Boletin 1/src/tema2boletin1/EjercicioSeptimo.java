package tema2boletin1;

import java.util.Scanner;

public class EjercicioSeptimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables que vamos a utilizar
		
		int num, cif;
		Scanner lectura = new Scanner (System.in);
		
		//Solicitamos un número al usuario
		
		System.out.println("Introduce el número del 0 al 99.999 para saber cuántas cifras tiene");
		num = lectura.nextInt();
		
		//Realizamos los cálculos necesarios
		
		cif = 1;
		
		if (num >= 10000) {
			
			cif = 5;
			
		} else if (num >= 1000) {
			
			cif = 4;
			
		} else if (num >= 100){
			
			cif = 3;
			
		} else if (num >= 10) {
			
			cif = 2;
			
		} else {
			
			cif =1;
			
		}
		
		System.out.println ("El número introducido tiene " + cif + " cifras");

	}

}