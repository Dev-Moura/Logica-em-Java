package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, resto, horas, minutos, segundos;
		
		n = sc.nextInt();
		horas = n / 3600;
		resto = n % 3600;
		
		minutos = resto / 60;
		segundos = resto % 60;
		
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
		sc.close();
	}

}
