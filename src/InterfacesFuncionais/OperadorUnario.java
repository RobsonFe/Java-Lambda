package InterfacesFuncionais;

import java.util.function.UnaryOperator;


public class OperadorUnario {

	public static void main(String[] args) {
		
		/*
		 * A principal utilidade do UnaryOperator é realizar operações que transformam um valor em outro valor do mesmo tipo. 
		 * Por exemplo, você pode usá-lo para realizar transformações em elementos de uma coleção, 
		 * atualizar valores em um objeto, aplicar uma função a cada elemento de um fluxo (stream), 
		 * entre outras tarefas em que um valor precisa ser transformado em outro valor do mesmo tipo.*/
	
		UnaryOperator<Integer> maisDois = n -> n +2;
		UnaryOperator<Integer> vezesDois = n -> n*2;
		UnaryOperator<Integer> aoQuadrodado = n -> n*n;
		
		// Nesse caso, será feito a operação na ordem em que a função é passada, começando pelo "maisDois".
		int resultado1 = maisDois
				.andThen(vezesDois)
				.andThen(aoQuadrodado)
				.apply(0);
		
		System.out.println(resultado1);
		
		// Nesse caso, será feito a operação na ordem inversa, começando pelo ultimo "maisDois". 
		int resultado2 = aoQuadrodado
				.compose(vezesDois)
				.compose(maisDois)
				.apply(0);
		System.out.println(resultado2);
	}
	

}
