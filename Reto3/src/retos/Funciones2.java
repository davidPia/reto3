package retos;

import java.time.LocalDate;

public class Funciones2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void MediaDiasMensuales(LocalDate Fecha1,LocalDate Fecha2) {
		int TotalDias=0;
		int ContadorDias=0;
		do {
			int DiasDelMes = Fecha1.lengthOfMonth();
			TotalDias +=DiasDelMes;
			ContadorDias++;
			Fecha1 = Fecha1.plusMonths(1);
		} while (Fecha1.isBefore(Fecha2.withDayOfMonth(1)));
		double MediaDias=0;
		MediaDias=TotalDias/ContadorDias;
		System.out.println("la media de los dias es:"+MediaDias);
		Consonantes(Fecha2);
	}
	public static void Consonantes(LocalDate Fecha2) {
		String Mes = String.valueOf(Fecha2.getMonth());
		Mes=Mes.toLowerCase();
		char letra;
		for (int i = 0; i < Mes.length(); i++) {
			letra=Mes.charAt(i);
			if (letra!='a' && letra!='e' && letra!='i' && letra!='o' && letra!='u') {
				if (i==0) {
					System.out.println(letra);
				}else {
					System.out.println(","+letra);
					
				}
			}
		}
	}
}
