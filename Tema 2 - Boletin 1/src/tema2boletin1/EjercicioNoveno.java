package tema2boletin1;

import java.util.Scanner;

public class EjercicioNoveno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables que vamos a utilizar
		
		String ejug1, ejug2;
		int ganador;
		Scanner lectura = new Scanner (System.in);
		
		//Solicitamos a cada usuario que introduzca su elección
		
		System.out.println ("El jugador 1 elige sacar... ");
		ejug1 = lectura.nextLine();
		
		System.out.println ("El jugador 2 elige sacar... ");
		ejug2 = lectura.nextLine();
		
		
		//Realizamos los cálculos necesarios
		
		ganador = 0;
		
		if (ejug1=="PIEDRA"){
			
		} else if (ejug2=="PAPEL") {
			
			ganador = 2;
			
		} else {
			
			ganador = 1;
			
		}
		

		
		if (ejug1=="PAPEL"){
			
		} else if (ejug2=="PIEDRA") {
			
			ganador = 1;
			
		} else {
			
			ganador = 2;
			
		}
		
		
		
		if (ejug1=="TIJERA"){
			
		} else if (ejug2=="PAPEL"){
			
			ganador = 1;
			
		} else {
			
			ganador = 2;
		}
		
		System.out.println("Ha ganado el jugador " + ganador);
	}

}

