package exerciciosEstruturasdeControle;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		double nota1, nota2;
		
		System.out.println("Digite a primeira Nota: ");
		nota1 = n.nextDouble();
		System.out.println("Digite a segunda Nota: ");
		nota2 = n.nextDouble();
		
			if (nota1 + nota2 >= 7.0) {
				System.out.println("Aprovado!!!");
			} else if (nota1 + nota2 < 7.0 && nota1 + nota2 > 4.0) {
					System.out.println("Recuperação!!!");
			} else {
					System.out.println("Reprovado!!!");
			}
		
		n.close();

	}

}
