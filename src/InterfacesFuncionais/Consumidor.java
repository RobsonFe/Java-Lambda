package InterfacesFuncionais;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome + "!!!");

		Produto p1 = new Produto("Caneta", 12.34, 0.15);
		imprimirNome.accept(p1);
		
		
		// A classe Consumer é uma classe que não tem retorno, ela exibi apenas o metodo pormeio do "accept". 
		
		Produto p2 = new Produto("Notebook", 3800.89, 0.20);
		Produto p3 = new Produto("Playstation", 3600.90, 0.20);
		Produto p4 = new Produto("PC Gamer", 4500.70, 0.30);
		Produto p5 = new Produto("HD Externo", 300.80, 0.10);
		Produto p6 = new Produto("Suporte de Notebok", 40.99, 0.5);
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5,p6);
		
		produtos.forEach(imprimirNome);
		//O ForEach já espera dentro dele uma função com consumer
		produtos.forEach(p -> System.out.printf("%.2f%n", p.preco));
		produtos.forEach(System.out::println);

	}

}
