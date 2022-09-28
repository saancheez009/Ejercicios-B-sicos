package ejerciciobasico9;

import java.util.Scanner;

public class ejerciciobasico9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//introducimos el scanner
		 Scanner sc = new Scanner(System.in);
		 //pedimos al usuario que introduzca la cantidad de pesetas que desea pasar a euros
		 System.out.println("Escriba la cantidad de pesetas que quiere pasar a euros: ");
		 //introducimos las variables pesetas y euros con su formula parea el calculo
		 double peseta = sc.nextInt();
		 float euro = (float) (peseta/166.382);
		 //le mostramos al usuario los euros correspondientes
		 System.out.println("Son " +euro+ " euros");
	}

}
