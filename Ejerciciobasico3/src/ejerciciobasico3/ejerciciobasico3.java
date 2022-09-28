package ejerciciobasico3;

import java.util.Scanner;

public class ejerciciobasico3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Realizamos el import del Scanner y le pedimos al usuario que escriba el año actual
			
			System.out.println("Introduzca el año actual");
			
			//Añadimos la variable del año actual
			
			int actual = sc.nextInt();
			
			//Le pedimos al usuario que nos escriba su año de naciento
			
			System.out.println("Introduca su año de nacimiento");
			
			//Añadimos la variable del año de nacimiento
			
			int nacimiento = sc.nextInt();
			
			/*finalmente añadimos la variable de la edad del usuario que es igual a la resta de el año de nacimiento
			 al año actual */
			
			int edad = actual - nacimiento;
	        // Mostramos al usuario su edad
			
	        System.out.println("Su edad es " + edad);
	        		

	}

}
