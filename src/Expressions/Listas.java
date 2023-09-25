package Expressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Listas {

	public static void main(String[] args) {
		
		List<String> pessoas = Arrays.asList("Robson", "Adams", "Helder", "Marcio", "Didi");
		
		System.out.println("Forma normal do ForEach\n");
		System.out.println("Lista de Pessoas\n");
		
		for(String pessoa: pessoas) {
			System.out.println(pessoa);
		}
		
		System.out.println("\nLista com ForEach\n");
		
		pessoas.forEach((pessoa) -> {
			System.out.println(pessoa);
		}); // Caso voce tem mais de um argumento para a lista, coloco dentro de uma função anonima
		// Se não, for apenas um, voce pode trocar ((pessoas)) por apenas (pessoas -> {argumento}); 
		
		System.out.println("\nMethod Reference\n");
		
		pessoas.forEach(System.out::println); // Metodo de referencia para imprimir uma lista.
		
		System.out.println("\nMethod Reference- 2\n");
		System.out.println("\nLista Personalizada\n");
		
		pessoas.forEach(nome -> imprimirNome(nome));
		
		System.out.println("\nLista Personalizada - 2\n");
		
		pessoas.forEach(Listas::imprimirNome);
	}
	
	static void imprimirNome(String nome) {
		System.out.println("O meu nome é " + nome);
	}

}
