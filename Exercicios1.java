	package curso_programacao;

import java.util.Locale;

public class Exercicios1 {
	
	public static void main(String[] args) {
	
		
		
		String product1 = "computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.243567;
		
		System.out.printf("products:%n%s, whics price is $ %.2f ", product1, price1);
		System.out.printf("%n%s, whics price is $ %.2f %n", product2, price2);
		
		System.out.printf("%nRecord: %d years old, code %d and gender: %c %n", age, code, gender);
		
		System.out.printf("%nMeasure with eight decimal places: %.9f %n", measure);
		System.out.printf("Roud(three decimal places): %.3f %n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f %n", measure);
	
	}

}
