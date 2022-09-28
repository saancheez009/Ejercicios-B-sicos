package ejerciciobasico10;

import java.util.Scanner;

public class ejerciciobasico10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario que escriba el precio al que quiere añadir el IVA
		
		System.out.println("Escriba el precio al que quiere añadir el IVA: ");
		// introducimos las variables IVA y precio
		float IVA = (float) 0.21;
		
		float precio = sc.nextInt();
		
		//introducimos la variable del precio final que es la formula del calculo delprecio mas el IVA
		
		float precioFinal = (float) ((IVA*precio)+precio);
				//le mostramos al usuario el precio final
		System.out.println("El precio final es: " +precioFinal);
	}

}
