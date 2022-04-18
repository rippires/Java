package exerciciosEstruturasdeControle;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int numero; 
		int contadorDeDivisoes = 0;
		
		System.out.println("Digite o numero que deseja verificar : ");
		numero = n.nextInt();
		
		for (int i = 2; i < numero ; i++){
			
			if (numero % i == 0) {
				contadorDeDivisoes++;
			
			}
		}
			
			if(contadorDeDivisoes == 0) {
				System.out.println("O numero " + numero + " É primo");
			} else {
				
				System.out.println("O numero " + numero + " não é primo");
			}
			
			
			n.close();
	}
}
		
		
	


