package application;

import java.util.Arrays;

public class ReferenciaTransparencial {

	public static final int VALORSOMADO = 10;

	public static void main(String[] args) {		
		
		Integer [] vetor = new Integer[] {8,17,82, 19,2006};
		alterarValoresImpares(vetor);
		//convertendo vetor para string
		String vetorAlterado = Arrays.toString(vetor);
		System.out.println((vetorAlterado));

	}

	// o comportamento da fun��o n�o depende apenas dela mesmo.
	// depende de uma valor externo. Isso faz com que n�o essa fun��o n�o
	// tenha transpar�ncia referencial
	public static void alterarValoresImpares(Integer[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 != 0) {
				vetor[i] = vetor[i] + VALORSOMADO;
			}

		}
	}

}
