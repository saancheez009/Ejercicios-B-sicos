package ejerciciobasico5;

import java.util.Scanner;

public class ejerciciobasico5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		// Importamos el scanner
				Scanner sc = new Scanner(System.in);
				// introducimos las variables radio, longitud y area
				float radio;
				float longitud;
		        float area;
		        // le pedimos al usuario el radio de la circunferencia
				System.out.println("Introduzca el radio de la circunferencia:");

				radio = sc.nextFloat();
		// realizamos la operacion para calcular la longitud de la circunferencia
				longitud = (float) (2*radio*Math.PI) ;
				
				
				System.out.println("La longitud de la circunferencia es: " + longitud);

				area = (float) (Math.PI*radio*radio);
				
				System.out.println("El área de la circunferencia es: " + area);
				
					sc.close();

	}

}
