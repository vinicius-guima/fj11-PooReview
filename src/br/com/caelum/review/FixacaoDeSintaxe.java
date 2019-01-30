package br.com.caelum.review;

public class FixacaoDeSintaxe {

	public static void main(String[] args) {

		// 1- Imprima todos os numeros de 0 a 100;

		for (int i = 0; i <= 100; i++)
			System.out.print(i + " ");
		
		
		System.out.println(" ");
		System.out.println(" ");

		// 2- Imprima a soma de 1 a 100;
		int soma = 0;
		for (int i = 0; i <= 100; i++) {
			soma += i;
		}
		System.out.println(soma);
		
		System.out.println(" ");
		System.out.println(" ");
		
		// 3- Imprima todos os multiplos de 3, entre 1 e 100;

		for (int i=0; i<100; i+=3)
			System.out.print(i + " ");
		
		System.out.println(" ");
		System.out.println(" ");
		
		// Imprima os fatoriais de 1 a 10;
		
		
		int	fatorial = 1;
		for	(int i=1; i <= 10; i++)	{
			
			fatorial *= i;
			System.out.println("O fatorial de " + i + " é " + fatorial);
		}
		
			System.out.println(" ");
			System.out.println(" ");
			
			//Sequencia de fibonacci;
			
			for(int a=0, b=1, i=0; i<15; b+=a, a=b-a, i++) {
				System.out.print(a + " ");
			}  
		
		


	}
}
