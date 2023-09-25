package Expressions;

@FunctionalInterface
public interface Calculo {
	
	double calcular(double a, double b);
	
	default String chamado() {
		return "Posso ser chamado mesmo com uma Functional Interface";
	}
	
	static String chamado2() {
		return "Eu tambem posso!";
	}
	
	//Uma functional Interface permite que apenas uma classe abstrata seja usada no metodo.
	// Como uma classe padrão(Default) e uma função estatica não são abstratas, pode ser chamada. 
}
