package tema2boletin1;

import java.util.Scanner;

public class EjercicioOctavo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables que vamos a utilizar
		
		double nota;
		String notita;
		Scanner lectura = new Scanner (System.in);
		
		//Solicitamos al usuario que introduzca la nota
		
		System.out.println ("Introduce la nota numérica por favor");
		nota = lectura.nextDouble();
		
		//Realizamos los cálculos necesarios
		
		if ((nota>=0)&&(nota<5)) {
			
			notita ="INSUFICIENTE";
			
		} else if ((nota>=5)&&(nota<6)){
			
			notita ="SUFICIENTE";
			
		} else if ((nota>=6)&&(nota<7)) {
			
			notita = "BIEN";
			
		} else if ((nota>=7)&&(nota<9)) {
			
			notita ="NOTABLE";

		} else {
		
		notita ="SOBRESALIENTE";
	}
		
		System.out.println ("La nota numérica introducida se corresponde con un " + notita);

}
}