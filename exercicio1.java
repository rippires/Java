package exerciciosEstruturasdeControle;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		int n1;
		Scanner n = new Scanner(System.in);
		
		System.out.println("Digite um numero : ");
		n1 = n.nextInt();
		
		if (n1 <= 10 && n1 >= 0){
			
				n1 = (n1 % 2);
			
				if (n1 == 0) {
				
				System.out.println("Este Numero é Par!!! ");
				
		} else  {
				System.out.println("Este Numero é Impar!!!!");
				}
			
		} 		else {
				System.out.println("Você deve Digitar Um Numero entre 0 e 10!!!");
				}
		
		
		System.out.println(n1);
		n.close();

	}

}
