package exerciciosEstruturasdeControle;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		int numero, maior = 0;
		Scanner sc = new Scanner(System.in);
		
		for ( int i = 0; i <= 10; i++) {
			
			System.out.println("Digite um numero: ");
			numero = sc.nextInt();
			if (numero > maior) {
			maior = numero;
		}
			
		}
		
		System.out.print("O maior numero digitado foi " + maior);
		
		sc.close();
	}
	

}
