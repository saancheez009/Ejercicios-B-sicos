package ejerciciobasico6;

import java.util.Scanner;

public class ejerciciobasico6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner sc = new Scanner(System.in);
	    int numUno;
	    int numDos;
		int suma;
		int resta;
		int multiplicacion;
		float division;
		
	    System.out.println("Introduzca un número: ");
	    
	    numUno = sc.nextInt();
	    
	    System.out.println("Introduzca un número: ");
	    
	    numDos = sc.nextInt(); 
	    
	    suma = numUno + numDos;  
	    
	    System.out.println("Este es el resultado de la suma: " +suma);
	    
	    
	    resta = numUno - numDos;
	    
	    System.out.println("Este es el resultado de la resta: " +resta);
	    		
	    multiplicacion = numUno*numDos;
	    
	    System.out.println("Este es el resultado de la multiplicacion: " +multiplicacion);
	    
	    division = (float) (numUno/numDos);
	    
	    System.out.println("Este es el resultado de la division: " + division);
	    
	    sc.close();

	}

}
