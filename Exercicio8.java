package exerciciosEstruturasdeControle;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		String palavra = new String();
		
		System.out.println("Digite a palavra desejada: ");
		palavra = sc.next();
		
		for (int i = 0; i < palavra.length(); i++) {
			
				System.out.println(palavra.charAt(i));
			}
		
		
		sc.close();

	}

}
