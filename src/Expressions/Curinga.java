package Expressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Curinga {

	public static void main(String[] args) {
		
		List<Integer> myInts = Arrays.asList(1,2,3,4);
		List<Double> myDoubles = Arrays.asList(3.14,3.28);
		List<Object> myObjs = new ArrayList<Object>();
		
		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDoubles, myObjs);
		printList(myObjs);
		
	}
	
	public static void copy(List <? extends Number> source, List<? super Number> destiny) {
		for(Number number: source) {
			destiny.add(number);
		}
	}
	
	public static void printList(List<?> list) {
		for(Object obj: list) {
			System.out.println(obj + " ");
		}
		System.out.println();
	}
}

/*
 * source e destiny são parâmetros da função copy. 
 * São nomes de variáveis que representam as listas que você passará como argumentos para a função.
Number não é uma variável nem uma função neste contexto. 
É uma classe no Java que é uma superclasse para tipos numéricos como Integer, Double, Float, etc. 
Nesse código, Number é usado para indicar que a função aceita listas que contenham elementos que são subtipos de Number. 
Isso permite que você copie elementos numéricos de diferentes tipos (por exemplo, Integer e Double) para a lista de destino.
Então, source e destiny são variáveis que representam as listas que você passará para a função copy.
E Number é uma classe que descreve os tipos numéricos que podem ser armazenados nessas listas.

Função printList:

printList(List<?> list)
A função printList é usada para imprimir os elementos de uma lista genérica, ou seja, uma lista que pode conter elementos de qualquer tipo.
O tipo List<?> é um curinga não delimitado, o que significa que você pode passar qualquer tipo de lista para essa função.
Dentro da função, um loop percorre a lista e imprime cada elemento no console, independentemente do tipo.

*/
