package tema2boletin1;

import java.util.Scanner;

public class EjercicioSexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables que vamos a utilizar
		
		int a, b, c, x;
		double discriminante;
		double sol1, sol2;
		Scanner lectura = new Scanner (System.in);
		
		//Solicitamos al usuario que introduzca los coeficientes
		
		System.out.println ("Vamos a solucionar una ecuación de segundo grado");
		System.out.println ("Introduce el valor de a");
		a = lectura.nextInt();
		System.out.println ("Introduce el valor de b");
		b = lectura.nextInt();
		System.out.println ("Introduce el valor de c");
		c = lectura.nextInt();
		
		//Realizamos los cálculos necesarios
		
		discriminante = (Math.pow(b, 2) - 4*a*c); // 2 -7 3. 1 -2 1. 1 2 3
		
		if (discriminante > 0) {
			
			sol1 = ((-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)))/(2*a);
			sol2 = ((-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)))/(2*a);
			System.out.println ("La ecuación tiene 2 soluciones reales, que son: " + sol1 + " " + sol2);
			
		} else if (discriminante == 0){
			
			sol1 = ((-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)))/(2*a);
			
			System.out.println ("La ecuación tiene 1 solucion real, que es: " + sol1);	
			
		} else {
			
			System.out.println ("La ecuación no tiene soluciones reales");	
			
		}
		
		
	}

}