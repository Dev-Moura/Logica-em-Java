package curso_programacao;

public class TesteProcessamento {
	
	public static void main(String[] args) {
		
		// Exemplo 1
		
		int a, b;
		
		a = 5;
		
		b = 2 * a;
		
		System.out.println(a);
		System.out.println(b);
		
		
		// Exemplo 2
		
		int c;
		
		double d;
		
		c = 5;
		
		d = 2 * c;
		
		System.out.println(c);
		System.out.println(d);		
		
		// Exemplo 3
		
		double e, E, f, area;
		
		e = 6.0;
		E = 8.0;
		f = 5.0;
		
		area = (e + E) / 2.0 * f;
		
		System.out.println(area);
		
		// BOA PRÁTICA: Sempre indique o tipo do número, se a expressão for de ponto flutuante (não inteira).
		// PARA double use:
		// .0
		
		// PARA float use:
		// f
		

		// Exemplo 4
		
		int g, h;
		
		double resultado;
		
		g = 5;
		h = 2;
		
		resultado = (double) g / h;
		
		System.out.println(resultado);
		
		// Exemplo 5
		
		
		double i;
		int j;
		
		i = 5.0;
		j = (int) i;
		
		System.out.println(j);
		
	}

}
