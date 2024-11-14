package retos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class Funciones1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LocalDate fecha1=LocalDate.of(2024,03,22);
		LocalDate fecha2=LocalDate.of(2024,05,26);
		Funciones1.mismo_año(fecha1,fecha2, sc);

	}
	
	
	public static void mismo_año(LocalDate fecha1, LocalDate fecha2,Scanner sc) {
		int diferencia=0;
		if(fecha1.getMonth()!=fecha2.getMonth()||fecha1.getDayOfMonth()!=fecha2.getDayOfMonth()) {
			diferencia= (int) ChronoUnit.MONTHS.between(fecha1, fecha2);
			
		}
		if(diferencia<3) {
			System.out.println("Introduce cuatro nombres");
			int contador=0;
			int menor=7873894;
			String nombre_f="";
			String primero="zzzzzzz";
			
			do {
				String nombre=sc.nextLine();
				int longitud=nombre.length();
				if(longitud<menor) {
					menor=Math.min(menor, longitud);
					nombre_f=nombre;
				}
				if(nombre.compareTo(primero)<0) {
					primero=nombre;
				}
				for(int i=0;i<nombre.length();i++){
					String vocales="aeiou";
					String letra = nombre.substring(i,i+1);
					
					for(i=0;i<=5;i++) {
					String vocal = vocales.substring(i,i+1);
					if(letra.equalsIgnoreCase(vocal)){
						
					}
					}
				}

				contador++;
			}while(contador!=4);
			System.out.println(nombre_f);
			System.out.println(primero);
			
		}
		
		
	}

}
