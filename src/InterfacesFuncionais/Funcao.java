package InterfacesFuncionais;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		// A Function Expression é uma função com retorno
		
		Function<Integer, String> parOuImpar = 
				numero -> numero % 2 == 0 ? "Par" : "Impar";
		// Essa função verifica um valor se é par ou impar e dá um retorno
		// começa pedindo um numero inteiro e tem um retorno escolhido como String.
		// Por isso<Integer, String>		
		System.out.println(parOuImpar.apply(32));
		
		//Esse resultado pede uma String e retorna uma String.
		Function<String, String> oResultadoE =
				valor -> "O resultado é: " + valor;
		
		Function <String, String> empolgado =
				valor -> valor + "!!!";
		
		// A composição de funções faz ligar uma função a outra por meio do "andThen". 		
		String resultadoFinal = parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(32);
		
		System.out.println(resultadoFinal);
	}

}
