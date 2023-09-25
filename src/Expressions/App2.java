package Expressions;

import java.util.function.BinaryOperator;

public class App2 {

	public static void main(String[] args) {
		
		BinaryOperator<Integer> cal = (x,y) -> {
			return x-y;
		};
		
		System.out.println(cal.apply(25, 100));
		
		cal = (x,y) -> x/y;
		System.out.println(cal.apply(25, 5));
		
		BinaryOperator<String> nomes = (nome1,nome2) -> {
			return nome1 + " e " + nome2;
		};
		
		System.out.println(nomes.apply("Robson", "Thaís"));

	}
	
	//BinaryOperator recebe um <tipo generico> e executa a função da interface dentro do lambda.
	// O Tipo generico deve ser o tipo Classe, não no formato primitivo. Ex: Tem que ser Double e não double.

}
