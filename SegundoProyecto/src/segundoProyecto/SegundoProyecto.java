package segundoProyecto;

import java.util.Scanner;

public class SegundoProyecto {
	
	private static String nombre;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leerNombre = new Scanner(System.in);
		
		System.out.print("Introduce tu nombre:");
		nombre = leerNombre.next();
		
		System.out.println("Tu nombre es:" + nombre);

	}
		
		
}
