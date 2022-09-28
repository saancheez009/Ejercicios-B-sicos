package ejerciciobasico4;

import java.util.Scanner;

public class ejerciciobasico4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		// Importamos el Scanner
				Scanner sc = new Scanner(System.in);
				// pedimos al usuario una nota de clase
				System.out.println("Nota de clase uno:");
				// Introducimos la variable de la primera nota 
				int notaUno = sc.nextInt();
				// pedimos al usuario otra nota
				System.out.println("Nota de clase dos:");
				// introducimos la variable de la segunda nota
				int notaDos = sc.nextInt();
				//realizamos la operación de la media e introducimos la variable
			    int media = (notaUno + notaDos)/2 ;
			    // mostramos al usuario su nota media		
			    System.out.println("Su nota media es: " +media);

	}

}
