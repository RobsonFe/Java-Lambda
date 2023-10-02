package InterfacesFuncionais;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		
		// o Supplier fornece qualquer tipo de retorno
		
		Supplier<List<String>> umaLista = () -> Arrays.asList("Rob", "Adam", "Carl");
		System.out.println(umaLista.get());
		
		// variavel = () -> função ; 
		// Obs: Em expressões Lambda voce só coloca parenteses em funções vazias(sem definições) ou com mais de um parametro.
		// Mas caso queira colocar mesmo com apenas um parametro, pode colocar.
	}

}
