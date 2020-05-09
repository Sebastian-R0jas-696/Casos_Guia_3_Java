import java.util.Scanner;
//Creado por Sebastian Rojas
public class Caso_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int factorial = 1, numero = 0, creciente = 1;
		
		System.out.print("Ingrese numero: ");
		numero = sc.nextInt();
		
		if (numero <= 7)
			while (creciente <= numero) {
				factorial = factorial * creciente;
				creciente++;
			}
		else
			System.out.println("El numero es superior a 7");
		if (numero <= 7)
			System.out.println("el factorial de " + numero + " es: " + factorial);
	}

}
