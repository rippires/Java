package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá quantas notas você deseja informar ? ");
		int qtdeNotas = sc.nextInt();
		
		double[] notas = new double [qtdeNotas];
		
		for(int i = 0; i < notas.length; i++) {
			
			System.out.println(" Digite a Nota " + i);
			notas[i] = sc.nextDouble();
		}
		
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		
		double media = total / notas.length;
		System.out.println("A média é " + media + "!");
		sc.close();
		
}
}
