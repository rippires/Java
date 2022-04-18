package exerciciosEstruturasdeControle;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		
		int numero = 0;
		Scanner sc = new Scanner(System.in);
		
		while (numero >= 0) {
			System.out.println("Digite um numero:   ");
			numero = sc.nextInt();
		
		}
		
		System.out.println("Você digitou um numero negativo, programa encerrado!!!");
		
		sc.close();
		

	}

}
