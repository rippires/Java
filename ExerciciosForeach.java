package arrays;

import java.util.Arrays;

public class ExerciciosForeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		
		
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[notasAlunoA.length - 1]);
	
		double totalalunoA = 0;
		
		for(double nota: notasAlunoA) {
			//totalalunoA += nota;
		
		System.out.println(nota);
		
		final double notaArmazenada = 5.9;
		double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10};
		
		double totalAlunoB = 0;
		
		for (int i = 0; i < notasAlunoB.length; i++) {
			
			totalAlunoB += notasAlunoB[i];
			
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);

	}

	}
}


