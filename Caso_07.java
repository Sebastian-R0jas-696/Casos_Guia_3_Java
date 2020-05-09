import java.util.Scanner;
//Creado por Sebastian Rojas
public class Caso_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nombre: ");
		String nombre = sc.nextLine();
		
		for (int i = 1; i <= 10; i++)
			System.out.println("Bienvenido " + nombre + " al curso");

	}

}
