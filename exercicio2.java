package exerciciosEstruturasdeControle;


import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner n = new Scanner(System.in);
		int ano;
		
		System.out.println("Digite o ano que deseja verificar se � bissexto: ");
		ano = n.nextInt();
		
			if (ano % 4 == 0){
			
				System.out.println("� um ano bissexto");
			} else 	{
					System.out.println("Este ano n�o � Bissexto");
					}
			System.out.printf("Este foi o ano digitado %d ", ano);
		n.close();
	}

}
