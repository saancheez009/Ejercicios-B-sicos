package ejerciciobasico7;

public class ejerciciobasico7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//importamos el scanner
        Scanner sc = new Scanner(System.in);
        //pedimos al usuario que introduzca su nombre,su direccion y su teléfono 
        System.out.println("Por favor introduzca en orden de uno en uno, su nombre, su dirección y su teléfono");
         //introducimos las variables nombre, dirección y teléfono y se lo mostramos al usuario
        String nombre = sc.next();
        
        System.out.println("Nombre: " +nombre);

        String direccion = sc.next();
        
        System.out.println("Dirección: " +direccion);
        
        String telefono =sc.next();
     
        System.out.println("Teléfono: " +telefono);
	}

}
