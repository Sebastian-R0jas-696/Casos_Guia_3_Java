import java.util.Scanner;
//Creado por Sebastian Rojas
public class Caso_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String continuar = "S", nombre_ma = "", nombre_me = "", empleado_T = "", nombre = "";
		float bono = 0, neto = 0, porcentaje = 0, dsct = 0, sueldo_Ma = 0, sueldo_Me = 99999999;
		int sueldo = 0, H_T = 0, T_H = 0, c = 0, M_T = 0, empleado_Por = 0, mayor_T = 0;
		while (continuar.contentEquals("S") || continuar.contentEquals("s")) {
			c++;
				System.out.println("Registro de empleados: " + c);
				System.out.print("Empleado: ");
				nombre = sc.nextLine();
				System.out.println("Horas trabajadas: ");
				H_T = sc.nextInt();
				System.out.println("Tarifa por hora: ");
				T_H = sc.nextInt();
				System.out.println("Minutos de tardanza: ");
				M_T = sc.nextInt();
				
				sueldo = H_T * T_H;
				if (H_T <= 50) 
					bono = 0;
				if (H_T > 50 & H_T <= 60)
					bono = (float)(sueldo * 0.02);
				if (H_T > 60 & H_T <= 70)
					bono = (float)(sueldo * 0.08);
				if (H_T > 70 & H_T <= 80)
					bono = (float)(sueldo * 0.13);
				if (H_T > 80)
					bono = (float)(sueldo * 0.15);
			
				if (M_T <= 15)
					dsct = 0;
				if (M_T > 15 & M_T <= 30)
					dsct= (float)(sueldo * 0.003);
				if (M_T > 30)
					dsct = (float)(sueldo * 0.05);
				neto = sueldo + bono - dsct;
				porcentaje = (H_T * (100/80));
				
				System.out.println("Sueldo bruto: " + sueldo);
				System.out.println("Bonificacion: " + bono);
				System.out.println("Descuento: " + dsct);
				System.out.println("Neto: " + neto);
				System.out.println("Porcentaje alcanzado: " + porcentaje);
				sc.nextLine();
				System.out.println("Nuevo empleado?[S/N]: ");
				continuar = sc.nextLine();
				
				if ( neto > sueldo_Ma) {
					sueldo_Ma = neto;
					nombre_ma = nombre;
				}
				if (neto < sueldo_Me) {
					sueldo_Me = neto;
					nombre_me = nombre;
				}
				if (M_T > mayor_T) {
					mayor_T = M_T;
					empleado_T = nombre;
				}
				if (porcentaje > 90) {
					empleado_Por = empleado_Por + 1;
				}
	}
		System.out.println("Numero de empleados: " + c);
		System.out.println("Sueldo neto mayor: " + sueldo_Ma + "pertence a " + nombre_ma);
		System.out.println("Sueldo neto menor: " + sueldo_Me + "pertenece a " + nombre_me);
		System.out.println("Empleado con la mayor cantidad de minutos de tardanza: " + empleado_T + "(" + mayor_T + "min)");
		System.out.println("Cantidad de empleados con mas de 90% de la meta: "+ empleado_Por);
	}

}
