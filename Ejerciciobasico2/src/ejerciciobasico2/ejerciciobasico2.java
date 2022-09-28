package ejerciciobasico2;

import java.util.Scanner;

public class ejerciciobasico2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Importamos el scanner 
				Scanner sc = new Scanner(System.in);
				
				//Pedimos al usuario su edad
				
				System.out.println("Introduce tu edad:");
				
				//introducimos la variable de edad
				
				int edad = sc.nextInt();
				
				// introducimos la edad más uno, para sumarle un número
				
				int masUno = edad +1;
				
				//Finalmente mostramos al usuario su edad en un año
				
				System.out.println("Su edad en un año es " + masUno);

	}

}
