package InterfacesFuncionais;

//Toda classe extende da classe Object
public class Produto extends Object {
		
	final String nome;
	final double preco;
	final double desconto;
	
	
	public Produto(String nome, double preco, double desconto) {
		
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toString() {
		double precoTotal = preco * (1 - desconto);
		return nome + "tem o preço de " + precoTotal;
	}
	
	
}
