package InterfacesFuncionais;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = prod ->(
				prod.preco * (1- prod.desconto)
				) >= 750;
		
		Produto produto = new Produto("Notebook", 3800.00, 0.15);
		System.out.println(isCaro.test(produto));
		
		// No Predicado, voce passa uma função que retorna um valor booleano. true ou false.

	}

}
