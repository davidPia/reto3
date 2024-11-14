package retos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Funciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean esInt(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

//indica si el String que recibe como parámetro es decimal
	public static boolean esDouble(String s) {
		try {
			Double.parseDouble(s);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

//pide algo por consola hasta que sea un número entero, el mensaje que pide ese algo se pasa
//por parámetro para poder personalizarlo
	public static int dimeEntero(String orden, Scanner sc) {
		do {
			try {
				System.out.println(orden);
				String s = sc.nextLine();
				int n = Integer.parseInt(s);
				return n;

			} catch (Exception e) {
				System.out.println("Formato incorrecto");
			}
		} while (true);
	}

//pide algo por consola hasta que sea un número decimal, el mensaje que pide ese algo se pasa
//por parámetro para poder personalizarlo
	public static double dimeDouble(String orden, Scanner sc) {
		do {
			try {
				System.out.println(orden);
				String s = sc.nextLine();
				double d = Double.parseDouble(s);
				return d;

			} catch (Exception e) {
				System.out.println("Formato incorrecto");
			}
		} while (true);
	}

	public static LocalDate dimeFecha(Scanner sc, String texto) {
		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		do {
			try {
				System.out.println(texto);
				String st = sc.nextLine();
				LocalDate fecha = LocalDate.parse(st, formato1);
				System.out.println(fecha.format(formato1));
				return fecha;
			} catch (Exception ex) {
				System.out.println("Introduce un n� correcto");
			}
			
		} while (true);
	}
}
