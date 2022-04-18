package exerciciosEstruturasdeControle;


import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner n = new Scanner(System.in);
		int ano;
		
		System.out.println("Digite o ano que deseja verificar se é bissexto: ");
		ano = n.nextInt();
		
			if (ano % 4 == 0){
			
				System.out.println("É um ano bissexto");
			} else 	{
					System.out.println("Este ano não é Bissexto");
					}
			System.out.printf("Este foi o ano digitado %d ", ano);
		n.close();
	}

}
