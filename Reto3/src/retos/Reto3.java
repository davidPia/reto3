package retos;

import java.time.LocalDate;
import java.util.Scanner;

public class Reto3 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		LocalDate Fecha1 = Funciones.dimeFecha(sc, "introduce la primera fecha (dd/MM/yyyy)");
		LocalDate Fecha2 =null;
		do {
			Fecha2 = Funciones.dimeFecha(sc, "introduce la segunda fecha (dd/MM/yyyy)");
			if (!(Fecha2.isAfter(Fecha1))) {
				System.out.println("la segunda fecha debe ser posterior a la primera");
			}
		} while (!Fecha2.isAfter(Fecha1));
		
		

	}
	

}
