package InterfacesFuncionais;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) { 
		
		Predicate<Integer> isPar = num -> num % 2 == 0; // verifica se o numero é par ou impar
		Predicate<Integer> isTresDigitos = 
				num -> num >= 100 && num <= 999; // Verifica se o numero tem ou não mais de 3 digitos. 
				
		System.out.println(isPar.and(isTresDigitos).test(123)); // Retorna um valor false.
		// Fazendo a mesma função retonar true, porque nesse caso o "negate()" nega a condição original
		System.out.println(isPar.and(isTresDigitos).negate().test(123));
		// Verifica a condição "or" equivalente a "&&". 
		System.out.println(isPar.or(isTresDigitos).test(123));
	}

}
