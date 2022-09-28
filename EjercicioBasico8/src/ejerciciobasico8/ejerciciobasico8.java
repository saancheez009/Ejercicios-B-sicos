package ejerciciobasico8;

import java.util.Scanner;

public class ejerciciobasico8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//introducimos el scanner
				Scanner sc = new Scanner(System.in);
				//pedimos al usuario que introduzca su nombre y su edad
				System.out.println("Por favor introduzca su nombre y su edad.");
				//añadimos las variables nombre y edad
				String nombre = sc.next();
				
				String edad = sc.next();
				// le mostramos al usuario el texto con su nombre y edad
				System.out.println("Hola " +nombre+ ", tienes " + edad + " años, ¡qué mayor eres!");
	}

}
