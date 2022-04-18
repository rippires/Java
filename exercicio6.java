package exerciciosEstruturasdeControle;

import java.util.Random;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int numeroSecreto = random.nextInt(100);
		int tentativas = 10;
		int chute;
		Scanner n = new Scanner(System.in);
		System.out.println(numeroSecreto);
		while (tentativas > 0) {
			System.out.println("Digite o seu chute: ");
			chute = n.nextInt();
			if(chute == numeroSecreto) {
				System.out.println(" Parabéns você ganhou!!!! " );
				break;
			} else {
				tentativas--;
				System.out.println("Você errou, mas ainda Possui " + tentativas + " Tentativas");
				if(chute > numeroSecreto) {
					System.out.println("Você digitou um numero maior que o numero secreto!!!");
				}
				if (chute < numeroSecreto){
					System.out.println("Você digitou um numero menor que o numero secreto");
					
				}
			}
			
		}
		System.out.println("Fim de jogo!!!");
		n.close();
		
	}

}
