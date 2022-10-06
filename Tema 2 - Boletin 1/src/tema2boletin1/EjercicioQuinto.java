package tema2boletin1;

import java.util.Scanner;

public class EjercicioQuinto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables que vamos a utilizar
		
		int num1, num2, num3;
		Scanner lectura = new Scanner (System.in);
		
		//Solicitamos al usuario que nos indique los tres números
		
		System.out.println("Introduce el primer número");
		num1 = lectura.nextInt();
		System.out.println("Introduce el segundo número");
		num2 = lectura.nextInt();
		System.out.println("Introduce el tercer número");
		num3 = lectura.nextInt();
		
		//Realizamos los cálculos necesarios
		
		if ((num1>=num2)&&(num2>=num3)){
			
			System.out.println("Los números ordenados de mayor a menor son " + num1 + " " + num2 + " " + num3);
			
		} else {
			
			if ((num1>=num3)&&(num3>=num2)){
				
				System.out.println("Los números ordenados de mayor a menor son " + num1 + " " + num3 + " " + num2);
				
			} else {
				
				if ((num2>=num1)&&(num1>=num3)){
					
					System.out.println("Los números ordenados de mayor a menor son " + num2 + " " + num1 + " " + num3);
					
				} else {
					
					if ((num2>=num3)&&(num3>=num1)){
						
						System.out.println("Los números ordenados de mayor a menor son " + num2 + " " + num3 + " " + num1);
						
					} else {
						
						if ((num3>=num2)&&(num2>=num1)) {
							
							System.out.println("Los números ordenados de mayor a menor son " + num3 + " " + num2 + " " + num1);
							
						} else {
							
							if ((num3>=num1)&&(num1>=num2)){
								
								System.out.println("Los números ordenados de mayor a menor son " + num3 + " " + num1 + " " + num2);
								
							}
							
						}
						
					}
					
				}
				
			}

	}

}
}

/* if (num1 > num2 && num2 > num3 {
 * } else if (num1 > num3 && num3 > num2) {
 * } else if (num2 > num1 && num1 > num3 ) {
 * } 
 */
