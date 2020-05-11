import java.util.Scanner;
//Crado por Sebastian Rojas
public class Caso_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre = "", continuar = "S", estado = "";
		int edad = 0, c = 0, c_aptos = 0;
		
		
		while (continuar.contentEquals("S") || continuar.equals("s")) {
			c++;
			System.out.println("Registro de Datos " + c);
			
			System.out.print("Nombre de participantes: ");
			nombre = sc.nextLine();
			System.out.print("Edad: ");
			edad = sc.nextInt();
			
			if (edad <= 17) {
				estado = "Menor de edad";
				c_aptos++;
			}
			else
				estado = "Apto para votar";
			System.out.println("Estado: " + estado);
		
			sc.nextLine(); //Para reiniciar la lectura  de texto
			System.out.println("Desea continuar <S/N>?: ");
			continuar = sc.nextLine();
		}

	}
}
